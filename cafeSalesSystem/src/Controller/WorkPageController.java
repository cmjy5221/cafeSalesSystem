package Controller;

import java.io.IOException;
import java.net.URL;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;

import Model.CustomerVO;
import Model.GoodsVO;
import Model.MenuorderVO;
import Model.PurchaseVO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class WorkPageController implements Initializable {

	static String id;
	@FXML
	private Label lbSName;
	@FXML
	private TextField txtWheather;
	@FXML
	private Button btnWheather;
	@FXML
	private Label lbTime;
	@FXML
	private Button btnReg;// 직원 등록용 창을 여는 버튼
	@FXML
	private TableView<MenuorderVO> tvMenu;
	@FXML
	private Label lbAmount;
	@FXML
	private Label lbTotal;
	@FXML
	private Button btnOneCancel;
	@FXML
	private Button btnCancel;
	@FXML
	private Button btnPlus;
	@FXML
	private Button btnMinus;
	@FXML
	private Label lbRiMoney;
	@FXML
	private Label lbDiscount;
	@FXML
	private Label lbFinal;
	@FXML
	private Label lbChange;
	@FXML
	private Label lbInputMoney;
	@FXML
	private Button btnOne;
	@FXML
	private Button btnTwo;
	@FXML
	private Button btnThree;
	@FXML
	private Button btnFour;
	@FXML
	private Button btnFive;
	@FXML
	private Button btnSix;
	@FXML
	private Button btnSeven;
	@FXML
	private Button btnEight;
	@FXML
	private Button btnNine;
	@FXML
	private Button btnZero;
	@FXML
	private Button btn100;
	@FXML
	private Button btn1000;
	@FXML
	private Button btn10000;
	@FXML
	private Button btnNumClear;
	@FXML
	private Button btnNumEnter;
	@FXML
	private Button btnWon;
	@FXML
	private Button btnCard;
	@FXML
	private Button btnSales;
	@FXML
	private TextField txtCName;
	@FXML
	private Button btnSearch;
	@FXML
	private Button btnTotal;
	@FXML
	private Button btnRegMem;
	@FXML
	private Button btnDelete;
	@FXML
	private TableView<CustomerVO> tvMem;
	@FXML
	private Button btnPointAcc;
	@FXML
	private Button btnPointUse;
	@FXML
	private CheckBox chkPointAcc;
	@FXML
	private CheckBox chkPointUse;
	@FXML
	private Button btnCMenu1;
	@FXML
	private Button btnCMenu2;
	@FXML
	private Button btnCMenu3;
	@FXML
	private Button btnCMenu4;
	@FXML
	private Button btnCMenu5;
	@FXML
	private Button btnCMenu6;
	@FXML
	private Button btnCMenu7;
	@FXML
	private Button btnCMenu8;
	@FXML
	private Button btnCMenu9;
	@FXML
	private Button btnCMenu10;
	@FXML
	private Button btnCMenu11;
	@FXML
	private Button btnCMenu12;
	@FXML
	private Button btnCMenu13;
	@FXML
	private Button btnCMenu14;
	@FXML
	private Button btnCMenu15;
	@FXML
	private Button btnCMenu16;
	@FXML
	private Button btnCMenu17;
	@FXML
	private Button btnCMenu18;
	@FXML
	private Button btnCMenu19;
	@FXML
	private Button btnCMenu20;
	@FXML
	private Button btnCMenu21;
	@FXML
	private Button btnCMenu22;
	@FXML
	private Button btnCMenu23;
	@FXML
	private Button btnCMenu24;
	@FXML
	private Button btnCMenu25;
	@FXML
	private Button btnEtcMenu1;
	@FXML
	private Button btnEtcMenu2;
	@FXML
	private Button btnEtcMenu3;
	@FXML
	private Button btnEtcMenu4;
	@FXML
	private Button btnEtcMenu5;
	@FXML
	private Button btnEtcMenu6;
	@FXML
	private Button btnEtcMenu7;
	@FXML
	private Button btnEtcMenu8;
	@FXML
	private Button btnEtcMenu9;
	@FXML
	private Button btnEtcMenu10;
	@FXML
	private Button btnEtcMenu11;
	@FXML
	private Button btnEtcMenu12;
	@FXML
	private Button btnEtcMenu13;
	@FXML
	private Button btnEtcMenu14;
	@FXML
	private Button btnEtcMenu15;
	@FXML
	private Button btnEtcMenu16;
	@FXML
	private Button btnEtcMenu17;
	@FXML
	private Button btnEtcMenu18;
	@FXML
	private Button btnEtcMenu19;
	@FXML
	private Button btnEtcMenu20;
	@FXML
	private Button btnEtcMenu21;
	@FXML
	private Button btnEtcMenu22;
	@FXML
	private Button btnEtcMenu23;
	@FXML
	private Button btnEtcMenu24;
	@FXML
	private Button btnEtcMenu25;
	@FXML
	private Button btnDMenu1;
	@FXML
	private Button btnDMenu2;
	@FXML
	private Button btnDMenu3;
	@FXML
	private Button btnDMenu4;
	@FXML
	private Button btnDMenu5;
	@FXML
	private Button btnDMenu6;
	@FXML
	private Button btnDMenu7;
	@FXML
	private Button btnDMenu8;
	@FXML
	private Button btnDMenu9;
	@FXML
	private Button btnDMenu10;
	@FXML
	private Button btnDMenu11;
	@FXML
	private Button btnDMenu12;
	@FXML
	private Button btnDMenu13;
	@FXML
	private Button btnDMenu14;
	@FXML
	private Button btnDMenu15;
	@FXML
	private Button btnDMenu16;
	@FXML
	private Button btnDMenu17;
	@FXML
	private Button btnDMenu18;
	@FXML
	private Button btnDMenu19;
	@FXML
	private Button btnDMenu20;
	@FXML
	private Button btnDMenu21;
	@FXML
	private Button btnDMenu22;
	@FXML
	private Button btnDMenu23;
	@FXML
	private Button btnDMenu24;
	@FXML
	private Button btnDMenu25;
	@FXML
	private ToggleGroup HotIceGroup;
	@FXML
	private CheckBox chkTOut;
	@FXML
	private RadioButton rbHot;
	@FXML
	private RadioButton rbIce;
	@FXML
	private CheckBox chkRevise;

	ObservableList<CustomerVO> cusData = FXCollections.observableArrayList();
	ObservableList<MenuorderVO> tempData = FXCollections.observableArrayList();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		if (id.trim().equals("normalStaff")) {
			btnSales.setDisable(true);
			chkRevise.setDisable(true);
			btnReg.setDisable(true);
		}
		MenuorderDAO mDao = new MenuorderDAO();
		GoodsDAO gvo = new GoodsDAO();
		// 최상단 정보바
		Date date = new Date();
		SimpleDateFormat now = new SimpleDateFormat("yyyy-MM-dd");
		lbTime.setText(now.format(date) + "");
		btnWheather.setOnAction(event -> handlerBtnWheather(event));
		btnReg.setOnAction(event -> handlerbtnReg(event));

		rbHot.setSelected(true);

		btnOneCancel.setOnAction(event -> handlerBtnOneCancel(event));
		btnCancel.setOnAction(event -> handlerBtnCancel(event));
		btnPlus.setOnAction(event -> handlerBtnPlus(event));
		btnMinus.setOnAction(event -> handlerBtnMinus(event));

		// 계산기
		btnOne.setOnAction(event -> handlerOne(event));
		btnTwo.setOnAction(event -> handlerTwo(event));
		btnThree.setOnAction(event -> handlerThree(event));
		btn100.setOnAction(event -> handler100(event));
		btn1000.setOnAction(event -> handler1000(event));
		btn10000.setOnAction(event -> handler10000(event));
		btnFour.setOnAction(event -> handlerFour(event));
		btnFive.setOnAction(event -> handlerFive(event));
		btnSix.setOnAction(event -> handlerSix(event));
		btnSeven.setOnAction(event -> handlerSeven(event));
		btnEight.setOnAction(event -> handlerEight(event));
		btnNine.setOnAction(event -> handlerNine(event));
		btnZero.setOnAction(event -> handlerZero(event));
		btnNumClear.setOnAction(event -> handlerNumclear(event));
		btnNumEnter.setOnAction(event -> handlerNumEnter(event));

		// 결제 버튼
		btnWon.setOnAction(event -> handlerBtnWon(event));
		btnCard.setOnAction(event -> handlerBtnCard(event));
		btnSales.setOnAction(event -> handlerBtnSales(event));

		// 고객관리 버튼
		btnSearch.setOnAction(event -> handlerBtnSearch(event));
		btnTotal.setOnAction(event -> handlerBtnTotal(event));
		btnRegMem.setOnAction(event -> handlerBtnRegMem(event));
		btnDelete.setOnAction(event -> handlerBtnDelete(event));
		chkPointUse.setOnAction(event -> handlerChkPointUse(event));

		btnCMenu1.setOnAction(event -> handlerBtnCMenu1(event));

		btnCMenu2.setOnAction(event -> handlerBtnCMenu2(event));
		btnCMenu3.setOnAction(event -> handlerBtnCMenu3(event));
		btnCMenu4.setOnAction(event -> handlerBtnCMenu4(event));
		btnCMenu5.setOnAction(event -> handlerBtnCMenu5(event));
		btnCMenu6.setOnAction(event -> handlerBtnCMenu6(event));
		btnCMenu7.setOnAction(event -> handlerBtnCMenu7(event));
		btnCMenu8.setOnAction(event -> handlerBtnCMenu8(event));
		btnCMenu9.setOnAction(event -> handlerBtnCMenu9(event));
		btnCMenu10.setOnAction(event -> handlerBtnCMenu10(event));
		btnCMenu11.setOnAction(event -> handlerBtnCMenu11(event));
		btnCMenu12.setOnAction(event -> handlerBtnCMenu12(event));
		btnCMenu13.setOnAction(event -> handlerBtnCMenu13(event));
		btnCMenu14.setOnAction(event -> handlerBtnCMenu14(event));
		btnCMenu15.setOnAction(event -> handlerBtnCMenu15(event));
		btnCMenu16.setOnAction(event -> handlerBtnCMenu16(event));
		btnCMenu17.setOnAction(event -> handlerBtnCMenu17(event));
		btnCMenu18.setOnAction(event -> handlerBtnCMenu18(event));
		btnCMenu19.setOnAction(event -> handlerBtnCMenu19(event));
		btnCMenu20.setOnAction(event -> handlerBtnCMenu20(event));
		btnCMenu21.setOnAction(event -> handlerBtnCMenu21(event));
		btnCMenu22.setOnAction(event -> handlerBtnCMenu22(event));
		btnCMenu23.setOnAction(event -> handlerBtnCMenu23(event));
		btnCMenu24.setOnAction(event -> handlerBtnCMenu24(event));
		btnCMenu25.setOnAction(event -> handlerBtnCMenu25(event));

		btnEtcMenu1.setOnAction(event -> handlerBtnEtcMenu1(event));
		btnEtcMenu2.setOnAction(event -> handlerBtnEtcMenu2(event));
		btnEtcMenu3.setOnAction(event -> handlerBtnEtcMenu3(event));
		btnEtcMenu4.setOnAction(event -> handlerBtnEtcMenu4(event));
		btnEtcMenu5.setOnAction(event -> handlerBtnEtcMenu5(event));
		btnEtcMenu6.setOnAction(event -> handlerBtnEtcMenu6(event));
		btnEtcMenu7.setOnAction(event -> handlerBtnEtcMenu7(event));
		btnEtcMenu8.setOnAction(event -> handlerBtnEtcMenu8(event));
		btnEtcMenu9.setOnAction(event -> handlerBtnEtcMenu9(event));
		btnEtcMenu10.setOnAction(event -> handlerBtnEtcMenu10(event));
		btnEtcMenu11.setOnAction(event -> handlerBtnEtcMenu11(event));
		btnEtcMenu12.setOnAction(event -> handlerBtnEtcMenu12(event));
		btnEtcMenu13.setOnAction(event -> handlerBtnEtcMenu13(event));
		btnEtcMenu14.setOnAction(event -> handlerBtnEtcMenu14(event));
		btnEtcMenu15.setOnAction(event -> handlerBtnEtcMenu15(event));
		btnEtcMenu16.setOnAction(event -> handlerBtnEtcMenu16(event));
		btnEtcMenu17.setOnAction(event -> handlerBtnEtcMenu17(event));
		btnEtcMenu18.setOnAction(event -> handlerBtnEtcMenu18(event));
		btnEtcMenu19.setOnAction(event -> handlerBtnEtcMenu19(event));
		btnEtcMenu20.setOnAction(event -> handlerBtnEtcMenu20(event));
		btnEtcMenu21.setOnAction(event -> handlerBtnEtcMenu21(event));
		btnEtcMenu22.setOnAction(event -> handlerBtnEtcMenu22(event));
		btnEtcMenu23.setOnAction(event -> handlerBtnEtcMenu23(event));
		btnEtcMenu24.setOnAction(event -> handlerBtnEtcMenu24(event));
		btnEtcMenu25.setOnAction(event -> handlerBtnEtcMenu25(event));

		btnDMenu1.setOnAction(event -> handlerBtnDMenu1(event));
		btnDMenu2.setOnAction(event -> handlerBtnDMenu2(event));
		btnDMenu3.setOnAction(event -> handlerBtnDMenu3(event));
		btnDMenu4.setOnAction(event -> handlerBtnDMenu4(event));
		btnDMenu5.setOnAction(event -> handlerBtnDMenu5(event));
		btnDMenu6.setOnAction(event -> handlerBtnDMenu6(event));
		btnDMenu7.setOnAction(event -> handlerBtnDMenu7(event));
		btnDMenu8.setOnAction(event -> handlerBtnDMenu8(event));
		btnDMenu9.setOnAction(event -> handlerBtnDMenu9(event));
		btnDMenu10.setOnAction(event -> handlerBtnDMenu10(event));
		btnDMenu11.setOnAction(event -> handlerBtnDMenu11(event));
		btnDMenu12.setOnAction(event -> handlerBtnDMenu12(event));
		btnDMenu13.setOnAction(event -> handlerBtnDMenu13(event));
		btnDMenu14.setOnAction(event -> handlerBtnDMenu14(event));
		btnDMenu15.setOnAction(event -> handlerBtnDMenu15(event));
		btnDMenu16.setOnAction(event -> handlerBtnDMenu16(event));
		btnDMenu17.setOnAction(event -> handlerBtnDMenu17(event));
		btnDMenu18.setOnAction(event -> handlerBtnDMenu18(event));
		btnDMenu19.setOnAction(event -> handlerBtnDMenu19(event));
		btnDMenu20.setOnAction(event -> handlerBtnDMenu20(event));
		btnDMenu21.setOnAction(event -> handlerBtnDMenu21(event));
		btnDMenu22.setOnAction(event -> handlerBtnDMenu22(event));
		btnDMenu23.setOnAction(event -> handlerBtnDMenu23(event));
		btnDMenu24.setOnAction(event -> handlerBtnDMenu24(event));
		btnDMenu25.setOnAction(event -> handlerBtnDMenu25(event));

		btnCMenu1.setText(gvo.GoodsMenuNameRead(1));
		btnCMenu2.setText(gvo.GoodsMenuNameRead(2));
		btnCMenu3.setText(gvo.GoodsMenuNameRead(3));
		btnCMenu4.setText(gvo.GoodsMenuNameRead(4));
		btnCMenu5.setText(gvo.GoodsMenuNameRead(5));
		btnCMenu6.setText(gvo.GoodsMenuNameRead(6));
		btnCMenu7.setText(gvo.GoodsMenuNameRead(7));
		btnCMenu8.setText(gvo.GoodsMenuNameRead(8));
		btnCMenu9.setText(gvo.GoodsMenuNameRead(9));
		btnCMenu10.setText(gvo.GoodsMenuNameRead(10));
		btnCMenu11.setText(gvo.GoodsMenuNameRead(11));
		btnCMenu12.setText(gvo.GoodsMenuNameRead(12));
		btnCMenu13.setText(gvo.GoodsMenuNameRead(13));
		btnCMenu14.setText(gvo.GoodsMenuNameRead(14));
		btnCMenu15.setText(gvo.GoodsMenuNameRead(15));
		btnCMenu16.setText(gvo.GoodsMenuNameRead(16));
		btnCMenu17.setText(gvo.GoodsMenuNameRead(17));
		btnCMenu18.setText(gvo.GoodsMenuNameRead(18));
		btnCMenu19.setText(gvo.GoodsMenuNameRead(19));
		btnCMenu20.setText(gvo.GoodsMenuNameRead(20));
		btnCMenu21.setText(gvo.GoodsMenuNameRead(21));
		btnCMenu22.setText(gvo.GoodsMenuNameRead(22));
		btnCMenu23.setText(gvo.GoodsMenuNameRead(23));
		btnCMenu24.setText(gvo.GoodsMenuNameRead(24));
		btnCMenu25.setText(gvo.GoodsMenuNameRead(25));

		btnEtcMenu1.setText(gvo.GoodsMenuNameRead(26));
		btnEtcMenu2.setText(gvo.GoodsMenuNameRead(27));
		btnEtcMenu3.setText(gvo.GoodsMenuNameRead(28));
		btnEtcMenu4.setText(gvo.GoodsMenuNameRead(29));
		btnEtcMenu5.setText(gvo.GoodsMenuNameRead(30));
		btnEtcMenu6.setText(gvo.GoodsMenuNameRead(31));
		btnEtcMenu7.setText(gvo.GoodsMenuNameRead(32));
		btnEtcMenu8.setText(gvo.GoodsMenuNameRead(33));
		btnEtcMenu9.setText(gvo.GoodsMenuNameRead(34));
		btnEtcMenu10.setText(gvo.GoodsMenuNameRead(35));
		btnEtcMenu11.setText(gvo.GoodsMenuNameRead(36));
		btnEtcMenu12.setText(gvo.GoodsMenuNameRead(37));
		btnEtcMenu13.setText(gvo.GoodsMenuNameRead(38));
		btnEtcMenu14.setText(gvo.GoodsMenuNameRead(39));
		btnEtcMenu15.setText(gvo.GoodsMenuNameRead(40));
		btnEtcMenu16.setText(gvo.GoodsMenuNameRead(41));
		btnEtcMenu17.setText(gvo.GoodsMenuNameRead(42));
		btnEtcMenu18.setText(gvo.GoodsMenuNameRead(43));
		btnEtcMenu19.setText(gvo.GoodsMenuNameRead(44));
		btnEtcMenu20.setText(gvo.GoodsMenuNameRead(45));
		btnEtcMenu21.setText(gvo.GoodsMenuNameRead(46));
		btnEtcMenu22.setText(gvo.GoodsMenuNameRead(47));
		btnEtcMenu23.setText(gvo.GoodsMenuNameRead(48));
		btnEtcMenu24.setText(gvo.GoodsMenuNameRead(49));
		btnEtcMenu25.setText(gvo.GoodsMenuNameRead(50));

		btnDMenu1.setText(gvo.GoodsMenuNameRead(51));
		btnDMenu2.setText(gvo.GoodsMenuNameRead(52));
		btnDMenu3.setText(gvo.GoodsMenuNameRead(53));
		btnDMenu4.setText(gvo.GoodsMenuNameRead(54));
		btnDMenu5.setText(gvo.GoodsMenuNameRead(55));
		btnDMenu6.setText(gvo.GoodsMenuNameRead(56));
		btnDMenu7.setText(gvo.GoodsMenuNameRead(57));
		btnDMenu8.setText(gvo.GoodsMenuNameRead(58));
		btnDMenu9.setText(gvo.GoodsMenuNameRead(59));
		btnDMenu10.setText(gvo.GoodsMenuNameRead(60));
		btnDMenu11.setText(gvo.GoodsMenuNameRead(61));
		btnDMenu12.setText(gvo.GoodsMenuNameRead(62));
		btnDMenu13.setText(gvo.GoodsMenuNameRead(63));
		btnDMenu14.setText(gvo.GoodsMenuNameRead(64));
		btnDMenu15.setText(gvo.GoodsMenuNameRead(65));
		btnDMenu16.setText(gvo.GoodsMenuNameRead(66));
		btnDMenu17.setText(gvo.GoodsMenuNameRead(67));
		btnDMenu18.setText(gvo.GoodsMenuNameRead(68));
		btnDMenu19.setText(gvo.GoodsMenuNameRead(69));
		btnDMenu20.setText(gvo.GoodsMenuNameRead(70));
		btnDMenu21.setText(gvo.GoodsMenuNameRead(71));
		btnDMenu22.setText(gvo.GoodsMenuNameRead(72));
		btnDMenu23.setText(gvo.GoodsMenuNameRead(73));
		btnDMenu24.setText(gvo.GoodsMenuNameRead(74));
		btnDMenu25.setText(gvo.GoodsMenuNameRead(75));

		// 메뉴판 테이블 뷰

		TableColumn colMenuName = new TableColumn("메뉴명");
		colMenuName.setStyle("-fx-alignmaent:CENTER");
		colMenuName.setCellValueFactory(new PropertyValueFactory<>("m_name"));
		TableColumn colPrice = new TableColumn("단가");
		colPrice.setStyle("-fx-alignmaent:CENTER");
		colPrice.setCellValueFactory(new PropertyValueFactory<>("m_price"));
		TableColumn colTotalCount = new TableColumn("총수량");
		colTotalCount.setStyle("-fx-alignmaent:CENTER");
		colTotalCount.setCellValueFactory(new PropertyValueFactory<>("m_amount"));
		TableColumn colTotalPrice = new TableColumn("결제금액");
		colTotalPrice.setStyle("-fx-alignmaent:CENTER");
		colTotalPrice.setCellValueFactory(new PropertyValueFactory<>("m_allprice"));
		TableColumn colHorI = new TableColumn("H/I");
		colHorI.setStyle("-fx-alignmaent:CENTER");
		colHorI.setCellValueFactory(new PropertyValueFactory<>("m_hotorice"));
		TableColumn colTakeOut = new TableColumn("테이크아웃");
		colTakeOut.setStyle("-fx-alignmaent:CENTER");
		colTakeOut.setCellValueFactory(new PropertyValueFactory<>("m_takeout"));

		menuViewList();

		tvMenu.setItems(tempData);
		tvMenu.getColumns().addAll(colMenuName, colPrice, colTotalCount, colTotalPrice, colHorI, colTakeOut);

		// 회원 정보 테이블 뷰

		TableColumn colName = new TableColumn("이름");
		colName.setCellValueFactory(new PropertyValueFactory<>("c_name"));
		TableColumn colTel = new TableColumn("연락처");
		colTel.setCellValueFactory(new PropertyValueFactory<>("c_phone"));
		TableColumn colPoint = new TableColumn("적립포인트");
		colPoint.setCellValueFactory(new PropertyValueFactory<>("c_point"));
		tvMem.setItems(cusData);
		tvMem.getColumns().addAll(colName, colTel, colPoint);

		memberList();
		lbChange.setText(0 + "");
		lbDiscount.setText(0 + "");
		lbFinal.setText(0 + "");
		lbRiMoney.setText(0 + "");
		int sum[] = mDao.setTextCalculation();
		lbAmount.setText(sum[0] + "");
		lbTotal.setText(sum[1] + "");

		lbSName.setText(id);

		int i = tvMem.getSelectionModel().getSelectedIndex();
	}

	// 직원 등록 창으로 이동하는 메소드
	public void handlerbtnReg(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/View/StaffReg.fxml"));
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setTitle("직원 등록");
			stage.setScene(scene);
			stage.setResizable(false);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void handlerBtnSales(ActionEvent event) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/view/sales.fxml"));
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setTitle("매출 조회");
			stage.setResizable(false);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void handlerChkPointUse(ActionEvent event) {
		try {
			if (chkPointUse.isSelected() == true) {
				if (Integer.parseInt(tvMem.getSelectionModel().getSelectedItem().getC_point()) >= 10) {
					lbDiscount.setText(2000 + "");
					lbFinal.setText(Integer.parseInt(lbTotal.getText()) - 2000 + "");
					tvMem.setDisable(true);
				} else if (Integer.parseInt(tvMem.getSelectionModel().getSelectedItem().getC_point()) < 10) {
					Alert alert = new Alert(AlertType.WARNING);
					alert.setTitle("포인트 사용");
					alert.setHeaderText("포인트 사용 실패");
					alert.setContentText("포인트가 10이상이여야 사용 가능합니다.");
					alert.showAndWait();
					chkPointUse.setSelected(false);
				}
			} else {
				lbDiscount.setText(0 + "");
			}
		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("포인트 사용");
			alert.setHeaderText("포인트 사용 실패");
			alert.setContentText("회원을 먼저 선택 후 눌러주세요.");
			alert.showAndWait();
			chkPointUse.setSelected(false);
		}
	}

	public void handlerBtnCard(ActionEvent event) {
		CustomerVO cVo = new CustomerVO();
		CustomerDAO cDao = new CustomerDAO();
		MenuorderDAO mDao = new MenuorderDAO();
		PurchaseVO pVo = new PurchaseVO();
		PurchaseDAO pDao = new PurchaseDAO();
		String money = "카드";
		int realMoney = 0;
		cVo = tvMem.getSelectionModel().getSelectedItem();
		try {
			if (Integer.parseInt(lbAmount.getText()) != 0) {
				if (chkPointAcc.isSelected() == true || chkPointUse.isSelected() == true) {
					pVo = new PurchaseVO(tvMem.getSelectionModel().getSelectedItem().getC_no(),
							Integer.parseInt(lbTotal.getText()), Integer.parseInt(lbAmount.getText()), money, realMoney,
							Integer.parseInt(lbTotal.getText()) - Integer.parseInt(lbDiscount.getText()),
							Integer.parseInt(lbTotal.getText()) - Integer.parseInt(lbDiscount.getText()));
					pDao.insertPurchase(pVo);
					if (chkPointAcc.isSelected() == true) {
						if (chkPointUse.isSelected() == false) {
							cDao.addMemberPoint(Integer.parseInt(lbAmount.getText().trim()), cVo);
						} else if (chkPointUse.isSelected() == true) {
							cDao.addMemberPoint(Integer.parseInt(lbAmount.getText().trim()) - 1, cVo);
							cDao.useMemberPoint(cVo);
						}
					} else if (chkPointAcc.isSelected() == false) {
						if (chkPointUse.isSelected() == true) {
							cDao.useMemberPoint(cVo);
						}
					}
				} else if (chkPointAcc.isSelected() == false && chkPointUse.isSelected() == false) {
					pVo = new PurchaseVO(0, Integer.parseInt(lbTotal.getText()), Integer.parseInt(lbAmount.getText()),
							money, realMoney, Integer.parseInt(lbTotal.getText()), Integer.parseInt(lbTotal.getText()));
					pDao.insertPurchase(pVo);
				}
				lbFinal.setText(Integer.parseInt(lbTotal.getText()) - Integer.parseInt(lbDiscount.getText()) + "");
				lbDiscount.setText(0 + "");
				chkPointAcc.setSelected(false);
				chkPointUse.setSelected(false);
				tvMem.setDisable(false);
			} else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("결제 오류");
				alert.setHeaderText("오류가 발생하였습니다.");
				alert.setContentText("주문내역을 추가해주세요.");
				alert.showAndWait();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		mDao.setTotalMenuListDelete();
		int sum[] = mDao.setTextCalculation();
		lbAmount.setText(sum[0] + "");
		lbTotal.setText(sum[1] + "");
		cusData.removeAll(cusData);
		memberList();
		tempData.removeAll(tempData);
		menuViewList();
	}

	public void handlerBtnWon(ActionEvent event) {
		CustomerVO cVo = new CustomerVO();
		CustomerDAO cDao = new CustomerDAO();
		MenuorderDAO mDao = new MenuorderDAO();
		PurchaseVO pVo = new PurchaseVO();
		PurchaseDAO pDao = new PurchaseDAO();
		CofferDAO cfDao = new CofferDAO();
		String money = "현금";
		int creditCard = 0;
		cVo = tvMem.getSelectionModel().getSelectedItem();

		lbFinal.setText(Integer.parseInt(lbTotal.getText()) - Integer.parseInt(lbDiscount.getText()) + "");
		try {
			if (Integer.parseInt(lbAmount.getText()) != 0) {
				if (chkPointAcc.isSelected() == true || chkPointUse.isSelected() == true) {
					pVo = new PurchaseVO(tvMem.getSelectionModel().getSelectedItem().getC_no(),
							Integer.parseInt(lbTotal.getText()), Integer.parseInt(lbAmount.getText()), money,
							Integer.parseInt(lbTotal.getText()) - Integer.parseInt(lbDiscount.getText()), creditCard,
							Integer.parseInt(lbTotal.getText()) - Integer.parseInt(lbDiscount.getText()));
					pDao.insertPurchase(pVo);
					if (chkPointAcc.isSelected() == true) {
						if (chkPointUse.isSelected() == false) {
							cDao.addMemberPoint(Integer.parseInt(lbAmount.getText().trim()), cVo);
						} else if (chkPointUse.isSelected() == true) {
							cDao.addMemberPoint(Integer.parseInt(lbAmount.getText().trim()) - 1, cVo);
							cDao.useMemberPoint(cVo);
						}
					} else if (chkPointAcc.isSelected() == false) {
						if (chkPointUse.isSelected() == true) {
							cDao.useMemberPoint(cVo);
						}
					}
				} else if (chkPointAcc.isSelected() == false && chkPointUse.isSelected() == false) {
					pVo = new PurchaseVO(0, Integer.parseInt(lbTotal.getText()), Integer.parseInt(lbAmount.getText()),
							money, Integer.parseInt(lbTotal.getText()), creditCard,
							Integer.parseInt(lbTotal.getText()));
					pDao.insertPurchase(pVo);
				}

				cfDao.nowSijae(Integer.parseInt(lbTotal.getText()));

				if (Integer.parseInt(lbRiMoney.getText()) > 0) {

					lbChange.setText(Integer.parseInt(lbRiMoney.getText()) - Integer.parseInt(lbFinal.getText()) + "");

				} else if (lbRiMoney.getText().equals("0")==true) {
					lbChange.setText("0");
				}
				lbDiscount.setText(0 + "");
				lbRiMoney.setText(0+"");
				chkPointAcc.setSelected(false);
				chkPointUse.setSelected(false);
				tvMem.setDisable(false);
			} else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("결제 오류");
				alert.setHeaderText("오류가 발생하였습니다.");
				alert.setContentText("주문내역을 추가해주세요.");
				alert.showAndWait();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		mDao.setTotalMenuListDelete();
		int sum[] = mDao.setTextCalculation();
		lbInputMoney.setText(0 + "");
		lbDiscount.setText(0 + "");
		lbAmount.setText(sum[0] + "");
		lbTotal.setText(sum[1] + "");
		cusData.removeAll(cusData);
		memberList();
		tempData.removeAll(tempData);
		menuViewList();
		tvMem.setEditable(true);
	}

	public void handlerBtnPlus(ActionEvent event) {

		MenuorderVO mVo = new MenuorderVO();
		MenuorderDAO mDao = new MenuorderDAO();
		mVo = tvMenu.getSelectionModel().getSelectedItem();
		int i = tvMenu.getSelectionModel().getFocusedIndex();

		mDao.setMenuAmountPlus(mVo);

		int sum[] = mDao.setTextCalculation();
		lbAmount.setText(sum[0] + "");
		lbTotal.setText(sum[1] + "");
		tempData.removeAll(tempData);
		menuViewList();

		tvMenu.getSelectionModel().select(i);
	}

	public void handlerBtnMinus(ActionEvent event) {

		MenuorderVO mVo = new MenuorderVO();
		MenuorderDAO mDao = new MenuorderDAO();
		mVo = tvMenu.getSelectionModel().getSelectedItem();
		int i = tvMenu.getSelectionModel().getFocusedIndex();

		try {
			if (mVo.getM_amount() != 1) {
				mDao.setMenuAmountMinus(mVo);
				int sum[] = mDao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
				tempData.removeAll(tempData);
				menuViewList();
				tvMenu.getSelectionModel().select(i);
			} else if (mVo.getM_amount() == 1) {
				mDao.setOneMenuListDelete(mVo);
				int sum[] = mDao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
				tempData.removeAll(tempData);
				menuViewList();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void handlerBtnCancel(ActionEvent event) {
		MenuorderDAO mDao = new MenuorderDAO();
		mDao.setTotalMenuListDelete();

		int sum[] = mDao.setTextCalculation();
		lbAmount.setText(sum[0] + "");
		lbTotal.setText(sum[1] + "");
		tempData.removeAll(tempData);
		menuViewList();
	}

	public void handlerBtnOneCancel(ActionEvent event) {
		MenuorderVO mVo = new MenuorderVO();
		MenuorderDAO mDao = new MenuorderDAO();
		mVo = tvMenu.getSelectionModel().getSelectedItem();
		mDao.setOneMenuListDelete(mVo);

		int sum[] = mDao.setTextCalculation();
		lbAmount.setText(sum[0] + "");
		lbTotal.setText(sum[1] + "");
		tempData.removeAll(tempData);
		menuViewList();

	}

	public void handlerBtnDelete(ActionEvent event) {
		CustomerDAO cdao = new CustomerDAO();
		if (tvMem.getSelectionModel().getSelectedItem().getC_name().equals(" ")) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("회원 삭제");
			alert.setHeaderText("회원 삭제 실패");
			alert.setContentText("해당 회원은 삭제할 수 없습니다.");
			alert.showAndWait();
		} else if (tvMem.getSelectionModel().getSelectedItem().getC_point().equals("0") != true) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("회원 검색");
			alert.setHeaderText("회원 삭제 실패");
			alert.setContentText("결제내역이 있는 회원은 삭제할 수 없습니다.");
			alert.showAndWait();
		} else {
			try {
				cdao.Memberdelete(tvMem.getSelectionModel().getSelectedItem());
				cusData.removeAll(cusData);
				memberList();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void handlerBtnSearch(ActionEvent event) {

		CustomerVO cvo = new CustomerVO();
		CustomerDAO cdao = null;

		Object[][] totalData = null;

		String searchName = "";
		boolean searchResult = false;
		try {
			searchName = txtCName.getText().trim();
			cdao = new CustomerDAO();
			cvo = cdao.getCustomerCheck(searchName);

			if (searchName.equals("")) {
				searchResult = true;

				Alert alert = new Alert(AlertType.WARNING);
				alert.setTitle("회원 검색");
				alert.setHeaderText("회원이름 검색 실패");
				alert.setContentText("다시 입력해 주세요.");
				alert.showAndWait();
			}

			if (!searchName.equals("") && (cvo != null)) {
				ArrayList<String> title;
				ArrayList<CustomerVO> list;

				title = cdao.getColumnName();
				int columnCount = title.size();

				list = cdao.getCustomerTotal();
				int rowCount = list.size();

				totalData = new Object[rowCount][columnCount];

				if (cvo.getC_name().trim().equals(searchName)) {
					txtCName.clear();
					cusData.removeAll(cusData);

					for (int i = 0; i < rowCount; i++) {
						cvo = list.get(i);
						if (cvo.getC_name().trim().equals(searchName)) {
							cusData.add(cvo);
							searchResult = true;
						}
					}
				}
			}
			if (!searchResult) {
				txtCName.clear();
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("회원 검색");
				alert.setHeaderText(searchName + " 회원이 없습니다.");
				alert.setContentText("다시 검색해주세요.");
				alert.showAndWait();

			}
		} catch (Exception e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("회원 검색 오류");
			alert.setHeaderText("오류가 발생하였습니다.");
			alert.setContentText("다시 하세요.");
			alert.showAndWait();
		}

	}

	public void handlerBtnTotal(ActionEvent event) {
		try {
			cusData.removeAll(cusData);
			memberList();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void menuViewList() {
		Object[][] menuData;

		MenuorderDAO tdao = new MenuorderDAO();
		MenuorderVO tvo = null;
		ArrayList<String> title;
		ArrayList<MenuorderVO> list;

		title = tdao.getColumnName();
		int columnName = title.size();

		list = tdao.getMenuViewTotal();
		int totalTemp = list.size();

		menuData = new Object[totalTemp][columnName];

		for (int index = 0; index < totalTemp; index++) {
			tvo = list.get(index);
			tempData.add(tvo);
		}
	}

	public void memberList() {

		Object[][] memberData;

		CustomerDAO cDao = new CustomerDAO();
		CustomerVO cVo = null;
		ArrayList<String> title;
		ArrayList<CustomerVO> list;

		title = cDao.getColumnName();
		int columnName = title.size();

		list = cDao.getCustomerTotal();
		int totalCustomer = list.size();

		memberData = new Object[totalCustomer][columnName];

		for (int index = 0; index < totalCustomer; index++) {
			cVo = list.get(index);
			cusData.add(cVo);
		}
	}

	public void handlerBtnRegMem(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/View/MemberReg.fxml"));
			Scene scene = new Scene(root);
			Stage dialog = new Stage(StageStyle.UTILITY);
			dialog.initModality(Modality.WINDOW_MODAL);
			dialog.initOwner(btnRegMem.getScene().getWindow());
			dialog.setTitle("회원 등록");
			dialog.setScene(scene);

			TextField txtMName = (TextField) root.lookup("#txtMName");
			TextField txtPhone = (TextField) root.lookup("#txtPhone");
			Button btnOk = (Button) root.lookup("#btnOk");
			Button btnExit = (Button) root.lookup("#btnExit");

			btnOk.setOnAction(e -> {
				CustomerVO cvo = new CustomerVO();
				CustomerDAO cdao = new CustomerDAO();
				boolean success;

				if (txtMName.getText().trim().equals("") != true) {
					cvo = new CustomerVO(txtMName.getText().trim(), txtPhone.getText(), 0 + "");

					success = cdao.MemberReg(cvo);
					if (success == true) {
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("회원 등록");
						alert.setHeaderText("등록성공");
						alert.setContentText("등록되었습니다.");
						alert.showAndWait();
						try {
							cusData.removeAll(cusData);
							memberList();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						dialog.close();
					} else {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("회원 등록");
						alert.setHeaderText("등록실패");
						alert.setContentText("등록되지 않았습니다.");
						alert.showAndWait();
					}
				} else {
					Alert alert = new Alert(AlertType.WARNING);
					alert.setTitle("회원 등록");
					alert.setHeaderText("등록실패");
					alert.setContentText("회원이름을 정확히 입력해주세요.");
					alert.showAndWait();
				}
			});
			btnExit.setOnAction(e -> {
				Stage oldstage = (Stage) btnOk.getScene().getWindow();
				oldstage.close();
			});
			dialog.show();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnWheather(ActionEvent event) {
		Group group = new Group();

		Scene scene = new Scene(group);

		Stage stage = new Stage();
		stage.setScene(scene);

		WebView webView = new WebView();

		group.getChildren().add(webView);

		WebEngine webEngine = webView.getEngine();

		webEngine.load("http://m.kma.go.kr/m/index.jsp");

		stage.show();

	}

	public void handlerBtnCMenu1(ActionEvent event) {

		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(1, txtGoodsName.getText(), Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu1.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
						Stage oldstage = (Stage) btnExit.getScene().getWindow();
						oldstage.close();
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 성공");
						alert.setContentText("새로운 상품이 등록되었습니다.");
						alert.showAndWait();
					}
				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(1).getG_name().equals("메뉴없음") == false && gdao.goodsMenuView(1).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(1).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(1).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(1).getG_name();
					int menuP = gdao.goodsMenuView(1).getG_price();

					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);

				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu2(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(2, txtGoodsName.getText(), Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu2.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(2).getG_name().equals("메뉴없음") == false && gdao.goodsMenuView(2).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(2).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(2).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(2).getG_name();
					int menuP = gdao.goodsMenuView(2).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu3(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(3, txtGoodsName.getText(), Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu3.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(3).getG_name().equals("메뉴없음") == false && gdao.goodsMenuView(3).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(3).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(3).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(3).getG_name();
					int menuP = gdao.goodsMenuView(3).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu4(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(4, txtGoodsName.getText(), Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu4.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(4).getG_name().equals("메뉴없음") == false && gdao.goodsMenuView(4).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(4).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(4).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(4).getG_name();
					int menuP = gdao.goodsMenuView(4).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
			}
			int sum[] = tdao.setTextCalculation();
			lbAmount.setText(sum[0] + "");
			lbTotal.setText(sum[1] + "");
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu5(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {

						GoodsVO gvo = new GoodsVO(5, txtGoodsName.getText(), Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu5.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}
				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(5).getG_name().equals("메뉴없음") == false && gdao.goodsMenuView(5).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(5).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(5).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(5).getG_name();
					int menuP = gdao.goodsMenuView(5).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu6(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(6, txtGoodsName.getText(), Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu6.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(6).getG_name().equals("메뉴없음") == false && gdao.goodsMenuView(6).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(6).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(6).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(6).getG_name();
					int menuP = gdao.goodsMenuView(6).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu7(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(7, txtGoodsName.getText(), Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu7.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(7).getG_name().equals("메뉴없음") == false && gdao.goodsMenuView(7).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(7).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(7).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(7).getG_name();
					int menuP = gdao.goodsMenuView(7).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu8(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(8, txtGoodsName.getText(), Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu8.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(8).getG_name().equals("메뉴없음") == false && gdao.goodsMenuView(8).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(8).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(8).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(8).getG_name();
					int menuP = gdao.goodsMenuView(8).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu9(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(9, txtGoodsName.getText(), Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu9.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(9).getG_name().equals("메뉴없음") == false && gdao.goodsMenuView(9).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(9).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(9).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(9).getG_name();
					int menuP = gdao.goodsMenuView(9).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu10(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(10, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu10.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(10).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(10).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(10).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(10).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(10).getG_name();
					int menuP = gdao.goodsMenuView(10).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu11(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(11, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu11.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(11).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(11).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(11).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(11).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(11).getG_name();
					int menuP = gdao.goodsMenuView(11).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu12(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(12, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu12.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(12).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(12).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(12).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(12).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(12).getG_name();
					int menuP = gdao.goodsMenuView(12).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu13(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(13, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu13.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(13).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(13).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(13).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(13).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(13).getG_name();
					int menuP = gdao.goodsMenuView(13).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu14(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(14, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu14.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(14).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(14).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(14).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(14).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(14).getG_name();
					int menuP = gdao.goodsMenuView(14).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu15(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(15, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu15.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(15).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(15).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(15).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(15).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(15).getG_name();
					int menuP = gdao.goodsMenuView(15).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu16(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(16, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu16.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(16).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(16).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(16).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(16).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(16).getG_name();
					int menuP = gdao.goodsMenuView(16).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu17(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(17, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu17.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(17).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(17).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(17).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(17).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(17).getG_name();
					int menuP = gdao.goodsMenuView(17).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu18(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(18, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu18.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(18).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(18).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(18).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(18).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(18).getG_name();
					int menuP = gdao.goodsMenuView(18).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu19(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(19, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu19.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(19).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(19).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(19).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(19).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(19).getG_name();
					int menuP = gdao.goodsMenuView(19).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu20(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(20, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu20.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(20).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(20).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(20).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(20).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(20).getG_name();
					int menuP = gdao.goodsMenuView(20).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu21(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(21, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu21.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(21).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(21).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(21).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(21).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(21).getG_name();
					int menuP = gdao.goodsMenuView(21).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu22(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(22, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu22.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(22).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(22).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(22).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(22).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(22).getG_name();
					int menuP = gdao.goodsMenuView(22).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu23(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(23, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu23.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(23).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(23).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(23).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(23).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(23).getG_name();
					int menuP = gdao.goodsMenuView(23).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu24(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(24, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu24.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(24).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(24).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(24).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(24).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(24).getG_name();
					int menuP = gdao.goodsMenuView(24).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnCMenu25(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(25, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnCMenu25.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(25).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(25).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(25).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(25).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(25).getG_name();
					int menuP = gdao.goodsMenuView(25).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu1(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(26, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu1.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(26).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(26).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(26).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(26).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(26).getG_name();
					int menuP = gdao.goodsMenuView(26).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu2(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(27, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu2.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(27).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(27).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(27).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(27).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(27).getG_name();
					int menuP = gdao.goodsMenuView(27).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu3(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(28, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu3.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(28).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(28).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(28).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(28).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(28).getG_name();
					int menuP = gdao.goodsMenuView(28).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu4(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(29, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu4.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(29).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(29).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(29).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(29).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(29).getG_name();
					int menuP = gdao.goodsMenuView(29).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu5(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(30, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu5.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(30).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(30).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(30).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(30).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(30).getG_name();
					int menuP = gdao.goodsMenuView(30).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu6(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(31, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu6.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(31).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(31).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(31).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(31).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(31).getG_name();
					int menuP = gdao.goodsMenuView(31).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu7(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(32, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu7.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(32).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(32).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(32).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(32).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(32).getG_name();
					int menuP = gdao.goodsMenuView(32).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu8(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(33, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu8.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(33).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(33).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(33).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(33).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(33).getG_name();
					int menuP = gdao.goodsMenuView(33).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu9(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(34, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu9.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(34).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(34).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(34).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(34).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(34).getG_name();
					int menuP = gdao.goodsMenuView(34).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu10(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(35, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu10.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(35).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(35).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(35).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(35).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(35).getG_name();
					int menuP = gdao.goodsMenuView(35).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu11(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(36, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu11.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(36).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(36).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(36).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(36).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(36).getG_name();
					int menuP = gdao.goodsMenuView(36).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu12(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(37, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu12.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(37).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(37).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(37).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(37).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(37).getG_name();
					int menuP = gdao.goodsMenuView(37).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu13(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(38, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu13.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(38).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(38).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(38).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(38).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(38).getG_name();
					int menuP = gdao.goodsMenuView(38).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu14(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(39, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu14.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(39).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(39).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(39).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(39).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(39).getG_name();
					int menuP = gdao.goodsMenuView(39).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu15(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(40, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu15.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(40).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(40).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(40).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(40).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(40).getG_name();
					int menuP = gdao.goodsMenuView(40).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu16(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(41, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu16.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(41).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(41).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(41).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(41).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(41).getG_name();
					int menuP = gdao.goodsMenuView(41).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu17(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(42, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu17.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(42).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(42).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(42).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(42).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(42).getG_name();
					int menuP = gdao.goodsMenuView(42).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu18(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(43, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu18.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(43).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(43).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(43).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(43).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(43).getG_name();
					int menuP = gdao.goodsMenuView(43).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu19(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(44, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu19.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(44).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(44).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(44).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(44).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(44).getG_name();
					int menuP = gdao.goodsMenuView(44).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu20(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(45, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu20.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(45).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(45).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(45).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(45).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(45).getG_name();
					int menuP = gdao.goodsMenuView(45).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu21(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(46, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu21.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(46).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(46).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(46).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(46).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(46).getG_name();
					int menuP = gdao.goodsMenuView(46).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu22(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(47, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu22.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(47).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(47).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(47).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(47).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(47).getG_name();
					int menuP = gdao.goodsMenuView(47).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu23(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(48, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu23.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(48).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(48).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(48).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(48).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(48).getG_name();
					int menuP = gdao.goodsMenuView(48).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu24(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(49, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu24.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(49).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(49).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(49).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(49).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(49).getG_name();
					int menuP = gdao.goodsMenuView(49).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnEtcMenu25(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(50, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnEtcMenu25.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(50).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(50).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(50).getG_name(),
						HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(50).getG_name(),
							HotIceGroup.getSelectedToggle().getUserData().toString(), chkTOut.isSelected() + "");
				} else {
					String menuN = gdao.goodsMenuView(50).getG_name();
					int menuP = gdao.goodsMenuView(50).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, HotIceGroup.getSelectedToggle().getUserData().toString(),
							chkTOut.isSelected() + "");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu1(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(51, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu1.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(51).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(51).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(51).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(51).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(51).getG_name();
					int menuP = gdao.goodsMenuView(51).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu2(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(52, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu2.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(52).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(52).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(52).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(52).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(52).getG_name();
					int menuP = gdao.goodsMenuView(52).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu3(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(53, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu3.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(53).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(53).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(53).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(53).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(53).getG_name();
					int menuP = gdao.goodsMenuView(53).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu4(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(54, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu4.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(54).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(54).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(54).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(54).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(54).getG_name();
					int menuP = gdao.goodsMenuView(54).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu5(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(55, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu5.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(55).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(55).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(55).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(55).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(55).getG_name();
					int menuP = gdao.goodsMenuView(55).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu6(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(56, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu6.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(56).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(56).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(56).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(56).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(56).getG_name();
					int menuP = gdao.goodsMenuView(56).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu7(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(57, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu7.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(57).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(57).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(57).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(57).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(57).getG_name();
					int menuP = gdao.goodsMenuView(57).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu8(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(58, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu8.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(58).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(58).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(58).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(58).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(58).getG_name();
					int menuP = gdao.goodsMenuView(58).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu9(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(59, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu9.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(59).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(59).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(59).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(59).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(59).getG_name();
					int menuP = gdao.goodsMenuView(59).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu10(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(60, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu10.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(60).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(60).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(60).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(60).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(60).getG_name();
					int menuP = gdao.goodsMenuView(60).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu11(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(61, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu11.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(61).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(61).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(61).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(61).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(61).getG_name();
					int menuP = gdao.goodsMenuView(61).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu12(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(62, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu12.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(62).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(62).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(62).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(62).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(62).getG_name();
					int menuP = gdao.goodsMenuView(62).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu13(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(63, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu13.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(63).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(63).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(63).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(63).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(63).getG_name();
					int menuP = gdao.goodsMenuView(63).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu14(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(64, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu14.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(64).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(64).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(64).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(64).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(64).getG_name();
					int menuP = gdao.goodsMenuView(64).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu15(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(65, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu15.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(65).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(65).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(65).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(65).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(65).getG_name();
					int menuP = gdao.goodsMenuView(65).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu16(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(66, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu16.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(66).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(66).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(66).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(66).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(66).getG_name();
					int menuP = gdao.goodsMenuView(66).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu17(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(67, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu17.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(67).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(67).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(67).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(67).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(67).getG_name();
					int menuP = gdao.goodsMenuView(67).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu18(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(68, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu18.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(68).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(68).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(68).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(68).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(68).getG_name();
					int menuP = gdao.goodsMenuView(68).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu19(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(69, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu19.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(69).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(69).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(69).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(69).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(69).getG_name();
					int menuP = gdao.goodsMenuView(69).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu20(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(70, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu20.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(70).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(70).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(70).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(70).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(70).getG_name();
					int menuP = gdao.goodsMenuView(70).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu21(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(71, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu21.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(71).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(71).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(71).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(71).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(71).getG_name();
					int menuP = gdao.goodsMenuView(71).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu22(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(72, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu22.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(72).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(72).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(72).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(72).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(72).getG_name();
					int menuP = gdao.goodsMenuView(72).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu23(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(73, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu23.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(73).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(73).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(73).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(73).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(73).getG_name();
					int menuP = gdao.goodsMenuView(73).getG_price();
					if (chkTOut.isSelected() == true) {
					}
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu24(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(74, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu24.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(74).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(74).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(74).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(74).getG_name(), " ", " ");
					;
				} else {
					String menuN = gdao.goodsMenuView(74).getG_name();
					int menuP = gdao.goodsMenuView(74).getG_price();

					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerBtnDMenu25(ActionEvent event) {
		if (chkRevise.isSelected() == true) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("/View/GoodsReg.fxml"));

				Stage dialog = new Stage(StageStyle.UTILITY);
				dialog.initModality(Modality.WINDOW_MODAL);
				dialog.initOwner(btnCMenu1.getScene().getWindow());
				dialog.setTitle("상품 수정");

				Parent goodsReg = (Parent) loader.load();

				TextField txtGoodsName = (TextField) goodsReg.lookup("#txtPName");
				TextField txtGoodsPrice = (TextField) goodsReg.lookup("#txtPPrice");

				Button btnOk = (Button) goodsReg.lookup("#btnOk");
				Button btnExit = (Button) goodsReg.lookup("#btnExit");

				btnOk.setOnAction(e -> {
					if (txtGoodsName.getText().equals("") || txtGoodsPrice.getText().equals("")) {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("상품 등록");
						alert.setHeaderText("등록 실패");
						alert.setContentText("상품명과 가격을 모두 입력해주세요.");
						alert.showAndWait();
					} else {
						GoodsVO gvo = new GoodsVO(75, txtGoodsName.getText(),
								Integer.parseInt(txtGoodsPrice.getText()));
						GoodsDAO gdao = new GoodsDAO();
						gdao.GoodsMenuRegiste(gvo);
						btnDMenu25.setText(txtGoodsName.getText() + "\n" + txtGoodsPrice.getText());
					}

				});
				btnExit.setOnAction(e -> {
					Stage oldstage = (Stage) btnExit.getScene().getWindow();
					oldstage.close();
				});
				Scene scene = new Scene(goodsReg);
				dialog.setScene(scene);
				dialog.setResizable(false);
				dialog.show();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (chkRevise.isSelected() == false) {
			GoodsDAO gdao = new GoodsDAO();
			MenuorderVO tvo = new MenuorderVO();
			MenuorderDAO tdao = new MenuorderDAO();
			if (gdao.goodsMenuView(75).getG_name().equals("메뉴없음") == false
					&& gdao.goodsMenuView(75).getG_price() != 0) {
				if (tdao.getMenuName(gdao.goodsMenuView(75).getG_name(), " ", " ") == true) {
					tdao.setAmountOnePlus(gdao.goodsMenuView(75).getG_name(), " ", " ");
				} else {
					String menuN = gdao.goodsMenuView(75).getG_name();
					int menuP = gdao.goodsMenuView(75).getG_price();
					tvo = new MenuorderVO(menuN, menuP, " ", " ");
					tdao.MenuViewInsert(tvo);
				}
				int sum[] = tdao.setTextCalculation();
				lbAmount.setText(sum[0] + "");
				lbTotal.setText(sum[1] + "");
			}
		}
		try {
			tempData.removeAll(tempData);
			menuViewList();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void handlerOne(ActionEvent event) {
		// TODO Auto-generated method stub
		if (lbInputMoney.getText().equals("0") == true) {
			lbInputMoney.setText("1");
		} else {
			lbInputMoney.setText(lbInputMoney.getText() + "1");
		}
	}

	public void handlerTwo(ActionEvent event) {
		// TODO Auto-generated method stub
		if (lbInputMoney.getText().equals("0") == true) {
			lbInputMoney.setText("2");
		} else {
			lbInputMoney.setText(lbInputMoney.getText() + "2");
		}
	}

	public void handlerThree(ActionEvent event) {
		// TODO Auto-generated method stub
		if (lbInputMoney.getText().equals("0") == true) {
			lbInputMoney.setText("3");
		} else {
			lbInputMoney.setText(lbInputMoney.getText() + "3");
		}
	}

	public void handlerFour(ActionEvent event) {
		// TODO Auto-generated method stub
		if (lbInputMoney.getText().equals("0") == true) {
			lbInputMoney.setText("4");
		} else {
			lbInputMoney.setText(lbInputMoney.getText() + "4");
		}
	}

	public void handlerFive(ActionEvent event) {
		// TODO Auto-generated method stub
		if (lbInputMoney.getText().equals("0") == true) {
			lbInputMoney.setText("5");
		} else {
			lbInputMoney.setText(lbInputMoney.getText() + "5");
		}
	}

	public void handlerSix(ActionEvent event) {
		// TODO Auto-generated method stub
		if (lbInputMoney.getText().equals("0") == true) {
			lbInputMoney.setText("6");
		} else {
			lbInputMoney.setText(lbInputMoney.getText() + "6");
		}
	}

	public void handlerSeven(ActionEvent event) {
		// TODO Auto-generated method stub
		if (lbInputMoney.getText().equals("0") == true) {
			lbInputMoney.setText("7");
		} else {
			lbInputMoney.setText(lbInputMoney.getText() + "7");
		}
	}

	public void handlerEight(ActionEvent event) {
		// TODO Auto-generated method stub
		if (lbInputMoney.getText().equals("0") == true) {
			lbInputMoney.setText("8");
		} else {
			lbInputMoney.setText(lbInputMoney.getText() + "8");
		}
	}

	public void handlerNine(ActionEvent event) {
		// TODO Auto-generated method stub
		if (lbInputMoney.getText().equals("0") == true) {
			lbInputMoney.setText("9");
		} else {
			lbInputMoney.setText(lbInputMoney.getText() + "9");
		}
	}

	public void handlerZero(ActionEvent event) {
		// TODO Auto-generated method stub
		if (lbInputMoney.getText().equals("0") == true) {
			lbInputMoney.setText("0");
		} else {
			lbInputMoney.setText(lbInputMoney.getText() + "0");
		}
	}

	public void handlerNumclear(ActionEvent event) {
		// TODO Auto-generated method stub
		lbInputMoney.setText("0");
		lbRiMoney.setText("0");
	}

	public void handlerNumEnter(ActionEvent event) {
		if (NumberChk(lbInputMoney.getText().trim())) {
			if (lbInputMoney.getText().trim().equals("0") != true && lbInputMoney.getText().trim().equals("") != true) {
				lbRiMoney.setText(lbInputMoney.getText());
				lbInputMoney.setText("0");
			} else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("받은금액 입력");
				alert.setHeaderText("금액 입력을 실패하였습니다.");
				alert.setContentText("정확한 값을 입력해주세요");
			}
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("받은금액 입력");
			alert.setHeaderText("금액 입력을 실패하였습니다.");
			alert.setContentText("다시 입력해주세요");
		}
	}

	public void handler10000(ActionEvent event) {
		if (lbInputMoney.getText().equals("0") != true) {
			lbInputMoney.setText(lbInputMoney.getText() + "0000");
		}
	}

	public void handler1000(ActionEvent event) {
		if (lbInputMoney.getText().equals("0") != true) {
			lbInputMoney.setText(lbInputMoney.getText() + "000");
		}
	}

	public void handler100(ActionEvent event) {
		if (lbInputMoney.getText().equals("0") != true) {
			lbInputMoney.setText(lbInputMoney.getText() + "00");
		}
	}

	public boolean NumberChk(String str) {

		char charVal;
		if (str.equals(""))
			return false;
		for (int i = 0; i < str.length(); i++) {
			charVal = str.charAt(i);
			if (charVal < 48 || charVal > 57) {
				return false;
			}
		}
		return true;
	}
}
