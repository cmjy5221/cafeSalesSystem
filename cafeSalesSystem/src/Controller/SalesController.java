package Controller;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import Model.PurchaseVO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.WritableImage;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
//매출 조회 창 컨트롤러
public class SalesController implements Initializable {
	@FXML
	private DatePicker dpDate;
	@FXML
	private Button btnCheck;
	@FXML
	private Button btnTotal;
	@FXML
	private Button btnSevenDayBar;
	@FXML
	private Button btnDir;
	@FXML
	private TextField txtDir;
	@FXML
	private Button btnExcel;
	@FXML
	private Button btnPDF;
	@FXML
	private TableView<PurchaseVO> tvSales;
	@FXML
	private Label lbNowSijae;
	@FXML
	private BarChart bcSales;
	@FXML
	private CategoryAxis xAxixs;
	@FXML
	private NumberAxis yAxixs;

	ObservableList<PurchaseVO> data = FXCollections.observableArrayList();
	ObservableList<PurchaseVO> data2 = FXCollections.observableArrayList();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		CofferDAO cDao= new CofferDAO();
		dpDate.setValue(LocalDate.now());
		lbNowSijae.setText(cDao.selectSijae()+"");
		btnCheck.setOnAction(event -> handlerBtnCheck(event));
		btnTotal.setOnAction(event -> handlerBtnTotal(event));
		btnDir.setOnAction(event -> handlerBtnDir(event));
		btnExcel.setOnAction(event -> handlerBtnExcel(event));
		btnPDF.setOnAction(event -> handlerBtnPDF(event));
		
		TableColumn colDate = new TableColumn("판매날짜");
		colDate.setCellValueFactory(new PropertyValueFactory<>("sdate"));
		TableColumn colTotal = new TableColumn("건별판매액");
		colTotal.setCellValueFactory(new PropertyValueFactory<>("total"));
		TableColumn colAmount = new TableColumn("건별판매량");
		colAmount.setCellValueFactory(new PropertyValueFactory<>("amount"));
		TableColumn colWay = new TableColumn("판매방식");
		colWay.setCellValueFactory(new PropertyValueFactory<>("way"));
		TableColumn colRMoney = new TableColumn("현금매출");
		colRMoney.setCellValueFactory(new PropertyValueFactory<>("rmoney"));
		TableColumn colCMoney = new TableColumn("카드매출");
		colCMoney.setCellValueFactory(new PropertyValueFactory<>("cmoney"));
		TableColumn colTMoney = new TableColumn("총매출");
		colTMoney.setCellValueFactory(new PropertyValueFactory<>("tmoney"));

		tvSales.setItems(data);
		tvSales.getColumns().addAll(colDate, colTotal, colAmount, colWay, colRMoney, colCMoney, colTMoney);

		data.removeAll(data);
		salesTotalList();

		ArrayList<PurchaseVO> pal = new ArrayList<PurchaseVO>();
		PurchaseDAO pDao = new PurchaseDAO();
		pal = pDao.barChart();
		XYChart.Series seriesSales = new XYChart.Series<>();
		ObservableList salesList = FXCollections.observableArrayList();
		for (int i = 6; i >= 0; i--) {
			salesList.add(new XYChart.Data(pal.get(i).getSdate(), pal.get(i).getTmoney()));
		}
		seriesSales.setData(salesList);
		bcSales.getData().add(seriesSales);
		
		btnExcel.setDisable(true);
		btnPDF.setDisable(true);
	}

	public void handlerBtnPDF(ActionEvent event) {
		try {
			WritableImage snapShot = bcSales.getScene().snapshot(null);
			ImageIO.write(SwingFXUtils.fromFXImage(snapShot, null), "png", new File("image/salesBarChart.png"));
			// pdf document 선언.
			// (Rectangle pageSize,float marginLeft,float
			// marginRight, float
			// marginTop,float marginBottom)
			Document document = new Document(PageSize.A4, 0, 0, 30, 30);
			// pdf 파일을 저장할 공간을 선언 pdf 파일이 생성된다. 그후 스트림으로 저장
			String strReportPDFName = "sales_" + System.currentTimeMillis() + ".pdf";
			PdfWriter.getInstance(document, new FileOutputStream(txtDir.getText() + "\\" + strReportPDFName));
			// document를 열어 pdf문서를 쓸수 있도록 한다.
			document.open();
			// 한글지원폰트 설정
			BaseFont bf = BaseFont.createFont("font/MALGUN.TTF", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
			Font font = new Font(bf, 8, Font.NORMAL);
			Font font2 = new Font(bf, 14, Font.BOLD);
			// 타이틀
			Paragraph title = new Paragraph("매출 정보", font2);
			// 중간정렬
			title.setAlignment(Element.ALIGN_CENTER);
			// 문서에 추가
			document.add(title);
			document.add(new Paragraph("\r\n"));
			// 생성 날짜
			LocalDate date = dpDate.getValue();
			Paragraph writeDay = new Paragraph(date.toString(), font);
			// 오른쪽 정렬
			writeDay.setAlignment(Element.ALIGN_RIGHT);
			// 문서에 추가
			document.add(writeDay);
			document.add(new Paragraph("\r\n"));
			// 테이블 생성 Table객체보다 PdfPTable 객체가 더 정교하게 테이블을 만들 수 있다.
			// 생성자에 컬럼수를 써준다.
			PdfPTable table = new PdfPTable(8);
			// 각각의 컬럼에 width를 정한다.
			table.setWidths(new int[] { 50, 50, 50, 50, 50, 50, 50, 50 });

			// 컬럼 타이틀
			PdfPCell header1 = new PdfPCell(new Paragraph("번호", font));
			PdfPCell header2 = new PdfPCell(new Paragraph("판매날짜", font));
			PdfPCell header3 = new PdfPCell(new Paragraph("판매량", font));
			PdfPCell header4 = new PdfPCell(new Paragraph("판매금액", font));
			PdfPCell header5 = new PdfPCell(new Paragraph("결제방식", font));
			PdfPCell header6 = new PdfPCell(new Paragraph("현금판매액", font));
			PdfPCell header7 = new PdfPCell(new Paragraph("카드판매액", font));
			PdfPCell header8 = new PdfPCell(new Paragraph("총판매액", font));

			// 가로정렬
			header1.setHorizontalAlignment(Element.ALIGN_CENTER);
			header2.setHorizontalAlignment(Element.ALIGN_CENTER);
			header3.setHorizontalAlignment(Element.ALIGN_CENTER);
			header4.setHorizontalAlignment(Element.ALIGN_CENTER);
			header5.setHorizontalAlignment(Element.ALIGN_CENTER);
			header6.setHorizontalAlignment(Element.ALIGN_CENTER);
			header7.setHorizontalAlignment(Element.ALIGN_CENTER);
			header8.setHorizontalAlignment(Element.ALIGN_CENTER);

			// 세로정렬
			header1.setVerticalAlignment(Element.ALIGN_MIDDLE);
			header2.setVerticalAlignment(Element.ALIGN_MIDDLE);
			header3.setVerticalAlignment(Element.ALIGN_MIDDLE);
			header4.setVerticalAlignment(Element.ALIGN_MIDDLE);
			header5.setVerticalAlignment(Element.ALIGN_MIDDLE);
			header6.setVerticalAlignment(Element.ALIGN_MIDDLE);
			header7.setVerticalAlignment(Element.ALIGN_MIDDLE);
			header8.setVerticalAlignment(Element.ALIGN_MIDDLE);

			// 테이블에 추가
			table.addCell(header1);
			table.addCell(header2);
			table.addCell(header3);
			table.addCell(header4);
			table.addCell(header5);
			table.addCell(header6);
			table.addCell(header7);
			table.addCell(header8);

			// DB 연결 및 리스트 선택
			PurchaseDAO pDao = new PurchaseDAO();
			PurchaseVO pVo = new PurchaseVO();
			ArrayList<PurchaseVO> list;
			list = pDao.getPurchaseTotal();
			int rowCount = list.size();

			PdfPCell cell1 = null;
			PdfPCell cell2 = null;
			PdfPCell cell3 = null;
			PdfPCell cell4 = null;
			PdfPCell cell5 = null;
			PdfPCell cell6 = null;
			PdfPCell cell7 = null;
			PdfPCell cell8 = null;

			for (int index = 0; index < rowCount; index++) {
				pVo = list.get(index);

				cell1 = new PdfPCell(new Paragraph(pVo.getNo() + "", font));
				cell2 = new PdfPCell(new Paragraph(pVo.getSdate(), font));
				cell3 = new PdfPCell(new Paragraph(pVo.getAmount() + "", font));
				cell4 = new PdfPCell(new Paragraph(pVo.getTotal() + "", font));
				cell5 = new PdfPCell(new Paragraph(pVo.getWay(), font));
				cell6 = new PdfPCell(new Paragraph(pVo.getRmoney() + "", font));
				cell7 = new PdfPCell(new Paragraph(pVo.getCmoney() + "", font));
				cell8 = new PdfPCell(new Paragraph(pVo.getTmoney() + "", font));

				// 가로정렬
				cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell4.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell5.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell6.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell7.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell8.setHorizontalAlignment(Element.ALIGN_CENTER);

				// 세로정렬
				cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell4.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell5.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell6.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell7.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell8.setVerticalAlignment(Element.ALIGN_MIDDLE);

				// 테이블에 셀 추가
				table.addCell(cell1);
				table.addCell(cell2);
				table.addCell(cell3);
				table.addCell(cell4);
				table.addCell(cell5);
				table.addCell(cell6);
				table.addCell(cell7);
				table.addCell(cell8);
			}
				// 문서에 테이블 추가
				document.add(table);
				document.add(new Paragraph("\r\n"));
			
				Alert alert = new Alert(AlertType.INFORMATION);
				
				// 막대그래프 이미지 추가
				Paragraph barImageTitle = new Paragraph("매출정보 막대 그래프", font);
				barImageTitle.setAlignment(Element.ALIGN_CENTER);
				document.add(barImageTitle);
				document.add(new Paragraph("\r\n"));
				final String barImageUrl = "image/salesBarChart.png";
				// 기존에 javafx.scene.image.Omage 객체를 사용하고 있어 충돌이 생겨 아래와 같이 사용함.
				com.itextpdf.text.Image barImage;
				try {
					if (com.itextpdf.text.Image.getInstance(barImageUrl) != null) {
						barImage = com.itextpdf.text.Image.getInstance(barImageUrl);
						barImage.setAlignment(Element.ALIGN_CENTER);
						barImage.scalePercent(30f);
						document.add(barImage);
						document.add(new Paragraph("\r\n"));
					}
				} catch (Exception e3) {
					// TODO: handle exception
				}
				
				document.close();
				alert.setTitle("PDF 파일 생성");
				alert.setHeaderText("매출정보 PDF 파일 생성 성공");
				alert.setContentText("매출정보 PDF 파일.");
				alert.showAndWait();
				
		} catch (Exception e) {
			// TODO: handle exception
		}
		txtDir.clear();
		btnExcel.setDisable(true);
		btnPDF.setDisable(true);
	}

	public void handlerBtnExcel(ActionEvent event) {
		PurchaseVO pVo = new PurchaseVO();
		PurchaseDAO pDao = new PurchaseDAO();
		boolean sucess;

		ArrayList<PurchaseVO> list;
		try {
			list = pDao.getPurchaseTotal();
			SalesExcel excelWriter = new SalesExcel();

			sucess = excelWriter.xlsxWiter(list, txtDir.getText());
			if (sucess) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("엑셀 파일 생성");
				alert.setHeaderText("매출정보 엑셀 파일 생성 성공");
				alert.setContentText("매출정보 엑셀 파일.");
				alert.showAndWait();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		txtDir.clear();
		btnExcel.setDisable(true);
		btnPDF.setDisable(true);
	}

	public void handlerBtnDir(ActionEvent event) {
		final DirectoryChooser directoryChooser = new DirectoryChooser();
		final Stage primaryStage = new Stage();
		final File selectedDirectory = directoryChooser.showDialog(primaryStage);

		if (selectedDirectory != null) {
			txtDir.setText(selectedDirectory.getAbsolutePath());
			btnExcel.setDisable(false);
			btnPDF.setDisable(false);
		}
	}

	public void handlerBtnTotal(ActionEvent event) {
		data.removeAll(data);
		salesTotalList();
	}

	public void handlerBtnCheck(ActionEvent event) {
		data.removeAll(data);
		salesSearchList();

	}

	public void salesTotalList() {
		Object[][] salesData;

		PurchaseDAO pDao = new PurchaseDAO();
		PurchaseVO pVo = null;
		ArrayList<String> title;
		ArrayList<PurchaseVO> list;

		title = pDao.getColumnName();
		int columnName = title.size();

		list = pDao.getPurchaseTotal();
		int columnRow = list.size();

		salesData = new Object[columnRow][columnName];

		for (int i = 0; i < salesData.length; i++) {
			pVo = list.get(i);
			data.add(pVo);
		}
	}

	public void salesSearchList() {
		Object[][] salesData;

		PurchaseDAO pDao = new PurchaseDAO();
		PurchaseVO pVo = new PurchaseVO();
		ArrayList<String> title;
		ArrayList<PurchaseVO> list;

		title = pDao.getColumnName();
		int columnName = title.size();

		list = pDao.salesDateSearch(dpDate);
		int columnRow = list.size();
		System.out.println(columnRow);
		salesData = new Object[columnRow][columnName];

		for (int i = 0; i < salesData.length; i++) {
			pVo = list.get(i);
			data.add(pVo);
		}
	}
}
