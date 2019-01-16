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
//�α���â ��Ʈ�ѷ�
public class LoginContoroller implements Initializable {
	@FXML
	private TextField txtId;//���̵� �Է�â
	@FXML
	private TextField txtPw;//��й�ȣ �Է�â
	@FXML
	private Button btnLogin;//�����Ա� â���� �̵��ϴ� ��ư
	@FXML
	private Button btnExit;//�����ư

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		btnLogin.setOnAction(event -> handlerbtnLogin(event));
		btnExit.setOnAction(event -> handlerbtnExit(event));
	}
	//�����ư �޼ҵ�
	public void handlerbtnExit(ActionEvent event) {
		Platform.exit();
	}
	//���̵�� ��й�ȣ�� ���� ��ġ�ϴ� �����Ͱ� ������ �����Է�â���� �̵��ϴ� �޼ҵ�
	public void handlerbtnLogin(ActionEvent event) {
		LoginDAO ldao = new LoginDAO();
		StaffVO svo = new StaffVO();
		svo.setS_ID(txtId.getText().trim());
		svo.setS_PW(txtPw.getText().trim());
		System.out.println(ldao.getLogin(svo));

		WorkPageController.id = ldao.toWorkPage(txtId.getText());//�Էµ� ���̵� ���� �ش� ��å�� �ҷ����� ���

		if (txtId.getText().equals("")||txtPw.getText().equals("")) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("�α���");
			alert.setHeaderText("���̵� ��й�ȣ�� �Էµ��� �ʾҽ��ϴ�.");
			alert.setContentText("�ٽ� �Է����ּ���");
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
							stage1.setTitle("�Ǹ� ����");
							stage1.setResizable(false);
							Stage old = (Stage) btnEnter.getScene().getWindow();
							Stage old1 = (Stage) btnExit.getScene().getWindow();
							old.close();
							old1.close();
							stage1.showAndWait();
						}}else if(NumberChk(txtInput.getText().trim())!=true) {
									Alert alert = new Alert(AlertType.ERROR);
									alert.setTitle("���� ���");
									alert.setHeaderText("���� ��� ����");
									alert.setContentText("���ڸ� �Է����ּ���.");
									alert.showAndWait();
						}
					} catch (Exception ee) {
						// TODO: handle exception
					}}else {
						Alert alert = new Alert(AlertType.ERROR);
						alert.setTitle("���� ���");
						alert.setHeaderText("���� ��� ����");
						alert.setContentText("������ �Է��Ҽ� �����ϴ�.");
						alert.showAndWait();
					}
				});
				stage.setTitle("���� �Ա�");
				stage.setResizable(false);
				stage.setScene(scene);
				stage.show();
			} catch (Exception e) {

				e.printStackTrace();
			}
		} else{
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("�α���");
			alert.setHeaderText("���̵� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			alert.setContentText("�ٽ� �Է����ּ���");
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
