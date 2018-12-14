package pkgApp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;
import pkgCore.Retirement;

public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	
	@FXML
	private TextField txtYearsToWork;
	
	@FXML
	private TextField txtAnnualReturnWorking;
	
	@FXML
	private TextField txtYearsRetired;
	
	@FXML
	private TextField txtAnnualReturnRetired;
	
	@FXML
	private TextField txtRequiredIncome;
	
	@FXML
	private TextField txtMonthlySSI;
	
	@FXML
	private Label labelSaveEachMonth;
	
	@FXML
	private Label labelNeedToSave;


	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	@FXML
	public void btnClear(ActionEvent event) {
		System.out.println("Clear pressed");

		txtYearsToWork.setText("");
		txtAnnualReturnWorking.setText("");
		txtYearsRetired.setText("");
		txtAnnualReturnRetired.setText("");
		txtRequiredIncome.setText("");
		txtMonthlySSI.setText("");
		labelSaveEachMonth.setText("");
		labelNeedToSave.setText("");
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) {
		
		int yearsToWork = Integer.parseInt(txtYearsToWork.getText());
		
		double annualReturnWorking = Double.parseDouble(txtAnnualReturnWorking.getText());
		
		int yearsRetired = Integer.parseInt(txtYearsRetired.getText());
		
		double annualReturnRetired = Double.parseDouble(txtAnnualReturnRetired.getText());
		
		double requiredIncome = Double.parseDouble(txtRequiredIncome.getText());
		
		double monthlySSI = Double.parseDouble(txtMonthlySSI.getText());
		
		Retirement r = new Retirement(yearsToWork, annualReturnWorking, yearsRetired, annualReturnRetired, requiredIncome, monthlySSI);
		
		double totalAmountSaved = r.TotalAmountSaved() * -1;
		
		double amountToSave = r.AmountToSave() * -1;
		
		labelSaveEachMonth.setText(String.format("%.2f", amountToSave));
		
		labelNeedToSave.setText(String.format("%.2f", totalAmountSaved));
	}
	
}
