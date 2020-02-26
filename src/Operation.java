import javax.swing.*;
import javax.swing.text.JTextComponent;
/**
 * The class {@code Operation} is used to implement the logic of the calculator.
 * @author MrKors
 */

public class Operation{

    private String firstNumber;
    private String secondNumber;
    char operationType;
    private Number result;
    private boolean tempTrue;
    /** EPSILON - result calculation accuracy */
    private final double EPSILON = 0.000001;


    public String getFirstNumber() {
        return firstNumber;
    }

    /**
     * Method setter, assign argument to field {@code firstNumber}? if this field equals {@code null}
     * @param firstNumber
     */
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

    /**
     * Method for printing button names
     * @param fieldName - field for printing
     * @param buttonValue - button name
     */
    public void printNumbersOrOperation(JTextComponent fieldName, JButton buttonValue){
        if (!tempTrue) {
            fieldName.setText("");
            tempTrue = true;
        }
        fieldName.setText(fieldName.getText() + buttonValue.getActionCommand());
    }

    /**
     *
     */
    public void doOperation (){
        double firstValue = Double.parseDouble(getFirstNumber());
        double secondValue = Double.parseDouble(getSecondNumber());

        switch (operationType) {
            case '+':
                result = firstValue + secondValue;
                break;
            case '-':
                result = firstValue - secondValue;
                break;
            case '/':
                result = firstValue / secondValue;
                break;
            case '*':
                result = firstValue * secondValue;
                break;
        }
    }

    /**
     * Method for determining the type of result
     * @return {@link Number}
     */
    private Number determineTypeOfResult() {
        if (Math.abs(result.doubleValue()) - Math.floor(Math.abs(result.doubleValue())) < EPSILON) {
            return result.longValue();
        } else {
            return result.doubleValue();
        }
    }

    /**
     * Method for getting result in fields
     * @param textPane
     * @param textField
     * @param storeData
     * @return {@link Operation}
     */
    public Operation getResult (JTextComponent textPane, JTextComponent textField, StoreData storeData){
        storeData.setResultStore(this.toString());
        textPane.setText(storeData.getResultStore());
        textPane.setText(textPane.getText() + "\n");
        textField.setText(String.valueOf(determineTypeOfResult()));

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
        return firstNumber + " " + operationType + " " + secondNumber + " = " + determineTypeOfResult();
    }
}
