package application;


import java.awt.event.ActionEvent;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class maincontroller {
@FXML
private static TextField l_1;

//public void delete (ActionEvent event) {
//	l_1.setText("");



String a1 = "";
String a2 = "";
String operation ="";
double first;
double second;
boolean bool = false;

public void getNumber(Event e ) {
	Button b =(Button) e.getSource();
	if (!bool) {
		a1 += b.getText();
		l_1.setText(a1);
	}
	else {
		a2 += b.getText();
		l_1.setText(a1+ operation +a2);
		
		
	}
}


public void getOperation(Event e) {
	if (operation.contentEquals(""))
		first = Double.parseDouble(l_1.getText());
	Button b= (Button) e.getSource();
	operation=b.getText();
	l_1.setText(a1+operation);
	bool=true;
}
public static class Operation{
	public static double addition(double i, double j) {
	return i+j;
}	

public static double subtraction(double i, double j) {
return i+j;
}
public static double multiplication(double i, double j) {
return i+j;
}
public static double divison(double i, double j) {
return i+j;
}}
public void Result() {
	a1="";
	second = Double.parseDouble(a2);
	a2="";
	bool = false;
	switch (operation) {
	case"+":
		l_1.setText(Double.toString(Operation.addition(first, second)));
		first= Operation.addition(first, second);
		break;
	case"-":
		l_1.setText(Double.toString(Operation.subtraction(first, second)));
		first= Operation.subtraction(first, second);
		break;
	case"*":
		l_1.setText(Double.toString(Operation.multiplication(first, second)));
		first= Operation.multiplication(first, second);
		break;
	case"/":
		l_1.setText(Double.toString(Operation.divison(first, second)));
		first= Operation.divison(first, second);
		break;
		
	}
}



}

