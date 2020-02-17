import javax.swing.*;
import javax.swing.text.JTextComponent;

public class Operation{

    private String firstNumber;
    private String secondNumber;
    String operationType;
    private int resultInt;
    private double resultDouble;
    private boolean typeDouble;
//    private boolean typeInteger;

    public String getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(String firstNumber) {
        this.firstNumber = firstNumber;
    }

    public String getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(String secondNumber) {
        this.secondNumber = secondNumber;
    }


    public void printNumbersOrOperation(JTextComponent fieldName, JButton buttonValue){
        if (fieldName != null) {
            fieldName.setText(fieldName.getText() + buttonValue.getActionCommand());
        }
//        else if (fieldName instanceof JTextArea) {
//            fieldName.setText(buttonValue.getActionCommand());
//        }
    }

    public VarType doOperation (){
        VarType varType = new VarType();
        varType.IsDouble(getFirstNumber());
        varType.IsDouble(getSecondNumber());
        if (varType.isDouble()) {
            switch (operationType){
                case "+": resultDouble = Double.parseDouble(getFirstNumber()) + Double.parseDouble(getSecondNumber()); break;
                case "-": resultDouble = Double.parseDouble(getFirstNumber()) - Double.parseDouble(getSecondNumber()); break;
                case "/": resultDouble = Double.parseDouble(getFirstNumber()) / Double.parseDouble(getSecondNumber()); break;
                case "*": resultDouble = Double.parseDouble(getFirstNumber()) * Double.parseDouble(getSecondNumber()); break;
            }
            typeDouble = true;

        }
        else {
            switch (operationType){
                case "+": resultInt = Integer.parseInt(getFirstNumber()) + Integer.parseInt(getSecondNumber()); break;
                case "-": resultInt = Integer.parseInt(getFirstNumber()) - Integer.parseInt(getSecondNumber()); break;
                case "/": {
                    if (Integer.parseInt(getFirstNumber()) % Integer.parseInt(getSecondNumber()) == 0) {
                        resultInt = Integer.parseInt(getFirstNumber()) / Integer.parseInt(getSecondNumber());
                    } else {
                       resultDouble = (double) Integer.parseInt(getFirstNumber()) / Integer.parseInt(getSecondNumber());
                       typeDouble = true;
                    }
                } break;
                case "*": resultInt = Integer.parseInt(getFirstNumber()) * Integer.parseInt(getSecondNumber()); break;
            }
//            typeInteger = true;
        }
        return varType;
    }

    public Operation getResult (JTextComponent fieldname, StoreData storeData){
        storeData.setResultStore(this.toString());
        fieldname.setText(storeData.getResultStore());
        fieldname.setText(fieldname.getText() + "\n");
        return new Operation();
    }

    @Override
    public String toString() {
        if (typeDouble) {
            return firstNumber + " " + operationType + " " + secondNumber + " = " + resultDouble;
        } else {
            return firstNumber + " " + operationType + " " + secondNumber + " = " + resultInt;
        }
    }
}
