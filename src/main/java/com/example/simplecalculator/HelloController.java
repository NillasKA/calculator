package com.example.simplecalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label lblNumber1;
    @FXML
    private Label lblNumber2;
    @FXML
    private Label lblOperator;
    private int number1;
    private int number2;
    private double result;
    private boolean operatorClicked;
    private String strOperatorClicked;

    public void onClearClick(ActionEvent actionEvent){
        number1 = 0;
        number2 = 0;
        operatorClicked = false;
        strOperatorClicked = "";
        lblNumber1.setText("");
        lblNumber2.setText("");
        lblOperator.setText("");
    }
    public void onCalculateClick(ActionEvent actionEvent) {
        number1 = Integer.parseInt(lblNumber1.getText());
        number2 = Integer.parseInt(lblNumber2.getText());
        switch(strOperatorClicked){
            case "+":
                result = number1 + number2;
                lblNumber1.setText(Double.toString(result));
                lblNumber2.setText("");
                lblOperator.setText("");
                break;
            case "-":
                result = number1 - number2;
                lblNumber1.setText(Double.toString(result));
                lblNumber2.setText("");
                lblOperator.setText("");
                break;
            case "/":
                result = (double) number1 / number2;
                lblNumber1.setText(Double.toString(result));
                lblNumber2.setText("");
                lblOperator.setText("");
                break;
            case "X":
                result = number1 * number2;
                lblNumber1.setText(Double.toString(result));
                lblNumber2.setText("");
                lblOperator.setText("");
                break;
            case "^":
                result = Math.pow(number1,number2);
                lblNumber1.setText(Double.toString(result));
                lblNumber2.setText("");
                lblOperator.setText("");
                break;
        }
    }

    public void onSqrClick(ActionEvent actionEvent) {
        number1 = Integer.parseInt(lblNumber1.getText());
        result = Math.sqrt(number1);
        lblNumber1.setText(Double.toString(result));
        lblNumber2.setText("");
        lblOperator.setText("");
    }

    public void onPowerClick(ActionEvent actionEvent) {
        if(!operatorClicked) {
            lblOperator.setText("^");
            operatorClicked = true;
            strOperatorClicked = "^";
        }
    }

    public void onDivisionClick(ActionEvent actionEvent) {
        if(!operatorClicked) {
            lblOperator.setText("/");
            operatorClicked = true;
            strOperatorClicked = "/";
        }
    }

    public void onMultiplyClick(ActionEvent actionEvent) {
        if (!operatorClicked) {
            lblOperator.setText("X");
            operatorClicked = true;
            strOperatorClicked = "X";
        }
    }

    public void onMinusClick(ActionEvent actionEvent) {
        if (!operatorClicked) {
            lblOperator.setText("-");
            operatorClicked = true;
            strOperatorClicked = "-";
        }
    }

    public void onPlusClick(ActionEvent actionEvent) {
        if (!operatorClicked) {
            lblOperator.setText("+");
            operatorClicked = true;
            strOperatorClicked = "+";
        }
    }

    public void onZeroClick(ActionEvent actionEvent) {
        if(!operatorClicked){
            lblNumber1.setText(lblNumber1.getText() + "0");
        }
        else{
            lblNumber2.setText(lblNumber2.getText() + "0");
        }
    }
    public void onOneClick(ActionEvent actionEvent) {
        if(!operatorClicked){
            lblNumber1.setText(lblNumber1.getText() + "1");
        }
        else{
            lblNumber2.setText(lblNumber2.getText() + "1");
        }
    }
    public void onTwoClick(ActionEvent actionEvent) {
        if(!operatorClicked){
            lblNumber1.setText(lblNumber1.getText() + "2");
        }
        else{
            lblNumber2.setText(lblNumber2.getText() + "2");
        }
    }
    public void onThreeClick(ActionEvent actionEvent) {
        if(!operatorClicked){
            lblNumber1.setText(lblNumber1.getText() + "3");
        }
        else{
            lblNumber2.setText(lblNumber2.getText() + "3");
        }
    }
    public void onFourClick(ActionEvent actionEvent) {
        if(!operatorClicked){
            lblNumber1.setText(lblNumber1.getText() + "4");
        }
        else{
            lblNumber2.setText(lblNumber2.getText() + "4");
        }
    }
    public void onFiveClick(ActionEvent actionEvent) {
        if(!operatorClicked){
            lblNumber1.setText(lblNumber1.getText() + "5");
        }
        else{
            lblNumber2.setText(lblNumber2.getText() + "5");
        }
    }
    public void onSixClick(ActionEvent actionEvent) {
        if(!operatorClicked){
            lblNumber1.setText(lblNumber1.getText() + "6");
        }
        else{
            lblNumber2.setText(lblNumber2.getText() + "6");
        }
    }
    public void onSevenClick(ActionEvent actionEvent) {
        if(!operatorClicked){
            lblNumber1.setText(lblNumber1.getText() + "7");
        }
        else{
            lblNumber2.setText(lblNumber2.getText() + "7");
        }
    }
    public void onEightClick(ActionEvent actionEvent) {
        if(!operatorClicked){
            lblNumber1.setText(lblNumber1.getText() + "8");
        }
        else{
            lblNumber2.setText(lblNumber2.getText() + "8");
        }
    }
    public void onNineClick(ActionEvent actionEvent) {
        if(!operatorClicked){
            lblNumber1.setText(lblNumber1.getText() + "9");
        }
        else{
            lblNumber2.setText(lblNumber2.getText() + "9");
        }
    }
}