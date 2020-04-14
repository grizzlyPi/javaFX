package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {
	
	@FXML
	private Button btLogin;
	
	@FXML
	public void onBtLoginAction() {
		Alerts.showAlert("Warning", null, "Unable to login. Please contact your Administrator!", AlertType.ERROR);
	}
}
