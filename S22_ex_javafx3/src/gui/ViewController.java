package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class ViewController {
	
	@FXML
	private Button btTeste;
	
	@FXML
	public void onBtTesteAction() {
		Alerts.showAlert("Alert Title", null, "Hello", AlertType.ERROR);
	}
}
