package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Model.StaffVO;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
//로그인창 컨트롤러
public class LoginContoroller implements Initializable {
	@FXML
	private TextField txtId;//아이디 입력창
	@FXML
	private TextField txtPw;//비밀번호 입력창
	@FXML
	private Button btnLogin;//시재입금 창으로 이동하는 버튼
	@FXML
	private Button btnExit;//종료버튼

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		btnLogin.setOnAction(event -> handlerbtnLogin(event));
		btnExit.setOnAction(event -> handlerbtnExit(event));
	}
	//종료버튼 메소드
	public void handlerbtnExit(ActionEvent event) {
		Platform.exit();
	}
	//아이디와 비밀번호를 비교해 일치하는 데이터가 있을시 시재입력창으로 이동하는 메소드
	public void handlerbtnLogin(ActionEvent event) {
		LoginDAO ldao = new LoginDAO();
		StaffVO svo = new StaffVO();
		svo.setS_ID(txtId.getText().trim());
		svo.setS_PW(txtPw.getText().trim());
		System.out.println(ldao.getLogin(svo));

		WorkPageController.id = ldao.toWorkPage(txtId.getText());//입력된 아이디를 통해 해당 직책을 불러오는 기능

		if (txtId.getText().equals("")||txtPw.getText().equals("")) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("로그인");
			alert.setHeaderText("아이디나 비밀번호가 입력되지 않았습니다.");
			alert.setContentText("다시 입력해주세요");
			alert.showAndWait();
		} else if (ldao.getLogin(svo) == true) {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/View/inputmoney.fxml"));
				Scene scene = new Scene(root);
				Stage stage = new Stage(StageStyle.UTILITY);
				stage.initModality(Modality.WINDOW_MODAL);
				stage.initOwner(btnExit.getScene().getWindow());

				TextField txtInput = (TextField) root.lookup("#txtInput");
				Button btnEnter = (Button) root.lookup("#btnEnter");
				txtInput.setText(0 + "");
				btnEnter.setOnAction(e -> {
					CofferDAO cdao = new CofferDAO();
					boolean input = false;
					if(txtInput.getText().trim().equals("")!=true) {
					try {
						if(NumberChk(txtInput.getText().trim())==true) {
						if (Integer.parseInt(txtInput.getText().trim()) >= 0) {
							input = cdao.setSijae(Integer.parseInt(txtInput.getText().trim()));
							Parent root1 = FXMLLoader.load(getClass().getResource("/View/WorkPage.fxml"));
							Scene scene1 = new Scene(root1);
							Stage stage1 = new Stage();
							stage1.setScene(scene1);
							stage1.setTitle("판매 관리");
							stage1.setResizable(false);
							Stage old = (Stage) btnEnter.getScene().getWindow();
							Stage old1 = (Stage) btnExit.getScene().getWindow();
							old.close();
							old1.close();
							stage1.showAndWait();
						}}else if(NumberChk(txtInput.getText().trim())!=true) {
									Alert alert = new Alert(AlertType.ERROR);
									alert.setTitle("시재 등록");
									alert.setHeaderText("시재 등록 실패");
									alert.setContentText("숫자만 입력해주세요.");
									alert.showAndWait();
						}
					} catch (Exception ee) {
						// TODO: handle exception
					}}else {
						Alert alert = new Alert(AlertType.ERROR);
						alert.setTitle("시재 등록");
						alert.setHeaderText("시재 등록 실패");
						alert.setContentText("공백은 입력할수 없습니다.");
						alert.showAndWait();
					}
				});
				stage.setTitle("시재 입금");
				stage.setResizable(false);
				stage.setScene(scene);
				stage.show();
			} catch (Exception e) {

				e.printStackTrace();
			}
		} else{
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("로그인");
			alert.setHeaderText("아이디나 비밀번호가 일치하지 않습니다.");
			alert.setContentText("다시 입력해주세요");
			alert.showAndWait();
		}
	}
	public boolean NumberChk(String str) {

		char charVal ;
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
