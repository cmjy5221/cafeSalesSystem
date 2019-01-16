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
			alert.setTitle("�������");
			alert.setHeaderText("���� �Է����ּ���");
			alert.setContentText("�ٽ� �Է��ϼ���.");
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
				alert.setTitle("�н����� Ȯ��");
				alert.setHeaderText("�н����尡 ��ġ���� �ʽ��ϴ�.");
				alert.setContentText("�н����带 �ٽ� �Է��ϼ���.");
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
				alert.setTitle("���̵� �ߺ� �˻�");
				alert.setHeaderText(searchId + "�� ����� �� �ֽ��ϴ�.");
				alert.setContentText("�н����带 �Է��ϼ���.");
				alert.showAndWait();

				btnReg.setDisable(false);
				txtId.setDisable(true);
			} else if (txtId.getText().trim().equals("")) {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("���̵� �ߺ� �˻�");
				alert.setHeaderText("���̵� �Է����ּ���.");
				alert.setContentText("�Է�â�� �ƹ��͵� �Էµ��� �ʾҽ��ϴ�.");
				alert.showAndWait();
			} else {
				txtId.clear();
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("���̵� �ߺ� �˻�");
				alert.setHeaderText(searchId + "�� ����� �� �����ϴ�.");
				alert.setContentText("���̵� �ٸ��� �Է����ּ���");
				alert.showAndWait();
			}
		} catch (Exception e) {
			e.printStackTrace();
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("���̵� �ߺ� �˻� ����");
			alert.setHeaderText("���̵� �ߺ� �˻翡 ������ �߻��Ͽ����ϴ�.");
			alert.setContentText("�ٽ� �ϼ���");
			alert.showAndWait();
		}
	}// ���̵� �ߺ��˻� �޼ҵ� ����

}
