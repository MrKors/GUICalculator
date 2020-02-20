import javax.swing.*;
import javax.swing.text.JTextComponent;

public class Operation{

    private String firstNumber;
    private String secondNumber;
    String operationType;
    private int resultInt;
    private double resultDouble;
    private boolean typeDouble;
    private boolean tempTrue;
//    private boolean typeInteger;

    public String getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(String firstNumber) {
        if (this.firstNumber == null) {
            this.firstNumber = firstNumber;
        }
    }

    public String getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(String secondNumber) {
        this.secondNumber = secondNumber;
    }


    public void printNumbersOrOperation(JTextComponent fieldName, JButton buttonValue){
        if (!tempTrue) {
            fieldName.setText("");
            tempTrue = true;
        }
        fieldName.setText(fieldName.getText() + buttonValue.getActionCommand());
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

    public Operation getResult (JTextComponent textPane, JTextComponent textField, StoreData storeData){
        storeData.setResultStore(this.toString());
        textPane.setText(storeData.getResultStore());
        textPane.setText(textPane.getText() + "\n");

        if (typeDouble) {
            storeData.setResultDouble(resultDouble);
            storeData.setTypeDouble(true);
            textField.setText(String.valueOf(resultDouble));
        } else {
            storeData.setResultInt(resultInt);
            storeData.setTypeDouble(false);
            textField.setText(String.valueOf(resultInt));
        }
        return new Operation();
    }

    public void nextOperation (JTextComponent textField, JTextComponent textPane, StoreData storeData){
        tempTrue = true;
        textPane.setText(storeData.getResultStore());
        textPane.setText(textPane.getText() + "\n");
        textPane.setText(textPane.getText() + textField.getText());
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
