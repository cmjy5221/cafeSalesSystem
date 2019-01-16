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
//���� ��ȸ â ��Ʈ�ѷ�
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
		
		TableColumn colDate = new TableColumn("�Ǹų�¥");
		colDate.setCellValueFactory(new PropertyValueFactory<>("sdate"));
		TableColumn colTotal = new TableColumn("�Ǻ��Ǹž�");
		colTotal.setCellValueFactory(new PropertyValueFactory<>("total"));
		TableColumn colAmount = new TableColumn("�Ǻ��Ǹŷ�");
		colAmount.setCellValueFactory(new PropertyValueFactory<>("amount"));
		TableColumn colWay = new TableColumn("�ǸŹ��");
		colWay.setCellValueFactory(new PropertyValueFactory<>("way"));
		TableColumn colRMoney = new TableColumn("���ݸ���");
		colRMoney.setCellValueFactory(new PropertyValueFactory<>("rmoney"));
		TableColumn colCMoney = new TableColumn("ī�����");
		colCMoney.setCellValueFactory(new PropertyValueFactory<>("cmoney"));
		TableColumn colTMoney = new TableColumn("�Ѹ���");
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
			// pdf document ����.
			// (Rectangle pageSize,float marginLeft,float
			// marginRight, float
			// marginTop,float marginBottom)
			Document document = new Document(PageSize.A4, 0, 0, 30, 30);
			// pdf ������ ������ ������ ���� pdf ������ �����ȴ�. ���� ��Ʈ������ ����
			String strReportPDFName = "sales_" + System.currentTimeMillis() + ".pdf";
			PdfWriter.getInstance(document, new FileOutputStream(txtDir.getText() + "\\" + strReportPDFName));
			// document�� ���� pdf������ ���� �ֵ��� �Ѵ�.
			document.open();
			// �ѱ�������Ʈ ����
			BaseFont bf = BaseFont.createFont("font/MALGUN.TTF", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
			Font font = new Font(bf, 8, Font.NORMAL);
			Font font2 = new Font(bf, 14, Font.BOLD);
			// Ÿ��Ʋ
			Paragraph title = new Paragraph("���� ����", font2);
			// �߰�����
			title.setAlignment(Element.ALIGN_CENTER);
			// ������ �߰�
			document.add(title);
			document.add(new Paragraph("\r\n"));
			// ���� ��¥
			LocalDate date = dpDate.getValue();
			Paragraph writeDay = new Paragraph(date.toString(), font);
			// ������ ����
			writeDay.setAlignment(Element.ALIGN_RIGHT);
			// ������ �߰�
			document.add(writeDay);
			document.add(new Paragraph("\r\n"));
			// ���̺� ���� Table��ü���� PdfPTable ��ü�� �� �����ϰ� ���̺��� ���� �� �ִ�.
			// �����ڿ� �÷����� ���ش�.
			PdfPTable table = new PdfPTable(8);
			// ������ �÷��� width�� ���Ѵ�.
			table.setWidths(new int[] { 50, 50, 50, 50, 50, 50, 50, 50 });

			// �÷� Ÿ��Ʋ
			PdfPCell header1 = new PdfPCell(new Paragraph("��ȣ", font));
			PdfPCell header2 = new PdfPCell(new Paragraph("�Ǹų�¥", font));
			PdfPCell header3 = new PdfPCell(new Paragraph("�Ǹŷ�", font));
			PdfPCell header4 = new PdfPCell(new Paragraph("�Ǹűݾ�", font));
			PdfPCell header5 = new PdfPCell(new Paragraph("�������", font));
			PdfPCell header6 = new PdfPCell(new Paragraph("�����Ǹž�", font));
			PdfPCell header7 = new PdfPCell(new Paragraph("ī���Ǹž�", font));
			PdfPCell header8 = new PdfPCell(new Paragraph("���Ǹž�", font));

			// ��������
			header1.setHorizontalAlignment(Element.ALIGN_CENTER);
			header2.setHorizontalAlignment(Element.ALIGN_CENTER);
			header3.setHorizontalAlignment(Element.ALIGN_CENTER);
			header4.setHorizontalAlignment(Element.ALIGN_CENTER);
			header5.setHorizontalAlignment(Element.ALIGN_CENTER);
			header6.setHorizontalAlignment(Element.ALIGN_CENTER);
			header7.setHorizontalAlignment(Element.ALIGN_CENTER);
			header8.setHorizontalAlignment(Element.ALIGN_CENTER);

			// ��������
			header1.setVerticalAlignment(Element.ALIGN_MIDDLE);
			header2.setVerticalAlignment(Element.ALIGN_MIDDLE);
			header3.setVerticalAlignment(Element.ALIGN_MIDDLE);
			header4.setVerticalAlignment(Element.ALIGN_MIDDLE);
			header5.setVerticalAlignment(Element.ALIGN_MIDDLE);
			header6.setVerticalAlignment(Element.ALIGN_MIDDLE);
			header7.setVerticalAlignment(Element.ALIGN_MIDDLE);
			header8.setVerticalAlignment(Element.ALIGN_MIDDLE);

			// ���̺� �߰�
			table.addCell(header1);
			table.addCell(header2);
			table.addCell(header3);
			table.addCell(header4);
			table.addCell(header5);
			table.addCell(header6);
			table.addCell(header7);
			table.addCell(header8);

			// DB ���� �� ����Ʈ ����
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

				// ��������
				cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell4.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell5.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell6.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell7.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell8.setHorizontalAlignment(Element.ALIGN_CENTER);

				// ��������
				cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell4.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell5.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell6.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell7.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell8.setVerticalAlignment(Element.ALIGN_MIDDLE);

				// ���̺� �� �߰�
				table.addCell(cell1);
				table.addCell(cell2);
				table.addCell(cell3);
				table.addCell(cell4);
				table.addCell(cell5);
				table.addCell(cell6);
				table.addCell(cell7);
				table.addCell(cell8);
			}
				// ������ ���̺� �߰�
				document.add(table);
				document.add(new Paragraph("\r\n"));
			
				Alert alert = new Alert(AlertType.INFORMATION);
				
				// ����׷��� �̹��� �߰�
				Paragraph barImageTitle = new Paragraph("�������� ���� �׷���", font);
				barImageTitle.setAlignment(Element.ALIGN_CENTER);
				document.add(barImageTitle);
				document.add(new Paragraph("\r\n"));
				final String barImageUrl = "image/salesBarChart.png";
				// ������ javafx.scene.image.Omage ��ü�� ����ϰ� �־� �浹�� ���� �Ʒ��� ���� �����.
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
				alert.setTitle("PDF ���� ����");
				alert.setHeaderText("�������� PDF ���� ���� ����");
				alert.setContentText("�������� PDF ����.");
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
				alert.setTitle("���� ���� ����");
				alert.setHeaderText("�������� ���� ���� ���� ����");
				alert.setContentText("�������� ���� ����.");
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
