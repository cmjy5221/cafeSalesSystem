package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Model.StaffVO;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class StaffRegController implements Initializable {
	@FXML
	private TextField txtId;
	@FXML
	private TextField txtPw;
	@FXML
	private TextField txtPwOk;
	@FXML
	private TextField txtName;
	@FXML
	private TextField txtPhone;
	@FXML
	private Button btnCheck;
	@FXML
	private Button btnReg;
	@FXML
	private Button btnExit;
	@FXML
	private RadioButton rbManager;
	@FXML
	private RadioButton rbNormal;
	@FXML
	private ToggleGroup jobSelectGroup;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnReg.setDisable(true);

		btnCheck.setOnAction(event -> handlerbtnCheck(event));
		btnExit.setOnAction(event -> handlerbtnExit(event));
		btnReg.setOnAction(event -> handlerbtnReg(event));
	}

	public void handlerbtnReg(ActionEvent event) {
		StaffVO svo = new StaffVO();
		StaffRegDAO sdao = new StaffRegDAO();

		boolean success = false;
		if (txtPw.getText().trim().equals("") || txtPwOk.getText().trim().equals("")
				|| txtName.getText().trim().equals("") || txtPhone.getText().trim().equals("")) {
			txtPw.clear();
			txtPwOk.clear();
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("직원등록");
			alert.setHeaderText("전부 입력해주세요");
			alert.setContentText("다시 입력하세요.");
			alert.showAndWait();
		} else {
			if (txtPw.getText().trim().equals(txtPwOk.getText().trim())) {
				svo = new StaffVO(txtName.getText().trim(), txtPhone.getText().trim(), txtId.getText().trim(),
						txtPw.getText().trim(), jobSelectGroup.getSelectedToggle().getUserData().toString());
				try {
					success = sdao.registeStaff(svo);
					if (success) {
						handlerbtnExit(event);

					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("패스워드 확인");
				alert.setHeaderText("패스워드가 일치하지 않습니다.");
				alert.setContentText("패스워드를 다시 입력하세요.");
				alert.showAndWait();
			}
		}
	}

	public void handlerbtnExit(ActionEvent event) {
		Stage old = (Stage) btnCheck.getScene().getWindow();
		old.close();
	}

	public void handlerbtnCheck(ActionEvent event) {
		StaffRegDAO sdao = new StaffRegDAO();
		String searchId = "";
		boolean serachResult = true;

		try {
			serachResult = (boolean) sdao.getIdOverlap(txtId.getText().trim());
			searchId = txtId.getText().trim();
			if (!searchId.equals("") && !serachResult) {
				txtId.setDisable(false);
				btnCheck.setDisable(true);
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("아이디 중복 검사");
				alert.setHeaderText(searchId + "를 사용할 수 있습니다.");
				alert.setContentText("패스워드를 입력하세요.");
				alert.showAndWait();

				btnReg.setDisable(false);
				txtId.setDisable(true);
			} else if (txtId.getText().trim().equals("")) {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("아이디 중복 검사");
				alert.setHeaderText("아이디를 입력해주세요.");
				alert.setContentText("입력창에 아무것도 입력되지 않았습니다.");
				alert.showAndWait();
			} else {
				txtId.clear();
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("아이디 중복 검사");
				alert.setHeaderText(searchId + "를 사용할 수 없습니다.");
				alert.setContentText("아이디를 다르게 입력해주세요");
				alert.showAndWait();
			}
		} catch (Exception e) {
			e.printStackTrace();
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("아이디 중복 검사 오류");
			alert.setHeaderText("아이디 중복 검사에 오류가 발생하였습니다.");
			alert.setContentText("다시 하세요");
			alert.showAndWait();
		}
	}// 아이디 중복검사 메소드 종료

}
