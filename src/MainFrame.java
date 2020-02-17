import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{

    private JPanel panel1;
    private JButton button_7;
    private JButton button_8;
    private JButton button_9;
    private JButton button_4;
    private JButton button_5;
    private JButton button_6;
    private JButton button_1;
    private JButton button_2;
    private JButton button_3;
    private JButton button_0;
    private JButton button_dot;
    private JButton button_С;
    private JButton button_equal;
    private JButton button_minus;
    private JButton button_plus;
    private JButton button_multi;
    private JButton button_div;
    private JTextPane textPane1;
    private JTextArea textArea;
    private JTextField textField;

    StoreData storeData = new StoreData();
    Operation operation = new Operation();
    VarType varType;

    public MainFrame() {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panel1);
        setBounds(500,200,400,500);

        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(textArea, button_1);
                operation.printNumbersOrOperation(textField, button_1);
            }
        });

        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(textArea, button_2);
                operation.printNumbersOrOperation(textField, button_2);
            }
        });

        button_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(textArea, button_3);
                operation.printNumbersOrOperation(textField, button_3);
            }
        });

        button_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(textArea, button_4);
                operation.printNumbersOrOperation(textField, button_4);
            }
        });

        button_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(textArea, button_5);
                operation.printNumbersOrOperation(textField, button_5);
            }
        });
        button_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(textArea, button_6);
                operation.printNumbersOrOperation(textField, button_6);
            }
        });
        button_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(textArea, button_7);
                operation.printNumbersOrOperation(textField, button_7);
            }
        });
        button_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(textArea, button_8);
                operation.printNumbersOrOperation(textField, button_8);
            }
        });
        button_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(textArea, button_9);
                operation.printNumbersOrOperation(textField, button_9);
            }
        });

        button_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(textArea, button_0);
                operation.printNumbersOrOperation(textField, button_0);
            }
        });

        button_dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(textArea, button_dot);
                operation.printNumbersOrOperation(textField, button_dot);
            }
        });

        button_plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(textArea, button_plus);
                operation.setFirstNumber(textField.getText());
                operation.operationType = "+";
                textField.setText("");
            }
        });

        button_minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(textArea, button_minus);
                operation.setFirstNumber(textField.getText());
                operation.operationType = "-";
                textField.setText("");
            }
        });
        button_multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(textArea, button_multi);
                operation.setFirstNumber(textField.getText());
                operation.operationType = "*";
                textField.setText("");
            }
        });
        button_div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(textArea, button_div);
                operation.setFirstNumber(textField.getText());
                operation.operationType = "/";
                textField.setText("");
            }
        });
        button_С.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                textField.setText("");
            }
        });
        button_equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.setSecondNumber(textField.getText());
                varType = operation.doOperation();
                operation = operation.getResult(textArea, storeData);
                textField.setText("");
            }
        });
    }
}
