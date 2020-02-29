import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Class for painting main frame
 * @author MrKors
 */
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
    private JTextField inputTextField;
    private JTextField outputTextField;
    private JTextPane textPane;

    StoreData storeData = new StoreData();
    Operation operation = new Operation();
    SimpleAttributeSet simpleAttributeSet = new SimpleAttributeSet();
    Font textFieldFont = new Font(null,Font.BOLD,25);

    /** Constructor */
    public MainFrame() {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panel1);
        setBounds(500,200,700,500);
        setResizable(false);

        StyleConstants.setAlignment(simpleAttributeSet, StyleConstants.ALIGN_RIGHT);
        StyleConstants.setFontFamily(simpleAttributeSet, "Serif");
        textPane.setParagraphAttributes(simpleAttributeSet,true);

        inputTextField.setFont(textFieldFont);
//        button_1.setFont(textFieldFont);

        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(inputTextField, outputTextField, button_1);
                operation.printNumbersOrOperation(outputTextField, inputTextField, button_1);
            }
        });

        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(inputTextField, outputTextField, button_2);
                operation.printNumbersOrOperation(outputTextField, inputTextField, button_2);
            }
        });

        button_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(inputTextField, outputTextField, button_3);
                operation.printNumbersOrOperation(outputTextField, inputTextField, button_3);
            }
        });

        button_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(inputTextField, outputTextField, button_4);
                operation.printNumbersOrOperation(outputTextField, inputTextField, button_4);
            }
        });

        button_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(inputTextField, outputTextField, button_5);
                operation.printNumbersOrOperation(outputTextField, inputTextField, button_5);
            }
        });
        button_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(inputTextField, outputTextField, button_6);
                operation.printNumbersOrOperation(outputTextField, inputTextField, button_6);
            }
        });
        button_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(inputTextField, outputTextField, button_7);
                operation.printNumbersOrOperation(outputTextField, inputTextField, button_7);
            }
        });
        button_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(inputTextField, outputTextField, button_8);
                operation.printNumbersOrOperation(outputTextField, inputTextField, button_8);
            }
        });
        button_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(inputTextField, outputTextField, button_9);
                operation.printNumbersOrOperation(outputTextField, inputTextField, button_9);
            }
        });

        button_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(inputTextField, outputTextField, button_0);
                operation.printNumbersOrOperation(outputTextField, inputTextField, button_0);
            }
        });

        button_dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.printNumbersOrOperation(inputTextField, outputTextField, button_dot);
                operation.printNumbersOrOperation(outputTextField, inputTextField, button_dot);
            }
        });

        button_plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.nextOperation(inputTextField, outputTextField, storeData);
                operation.printNumbersOrOperation(outputTextField, inputTextField, button_plus);
                operation.setFirstNumber(inputTextField.getText());
                operation.operationType = '+';
                inputTextField.setText("");
            }
        });

        button_minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.nextOperation(inputTextField, outputTextField, storeData);
                operation.printNumbersOrOperation(outputTextField, inputTextField, button_minus);
                operation.setFirstNumber(inputTextField.getText());
                operation.operationType = '-';
                inputTextField.setText("");
            }
        });
        button_multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.nextOperation(inputTextField, outputTextField, storeData);
                operation.printNumbersOrOperation(outputTextField, inputTextField, button_multi);
                operation.setFirstNumber(inputTextField.getText());
                operation.operationType = '*';
                inputTextField.setText("");
            }
        });
        button_div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.nextOperation(inputTextField, outputTextField, storeData);
                operation.printNumbersOrOperation(outputTextField, inputTextField, button_div);
                operation.setFirstNumber(inputTextField.getText());
                operation.operationType = '/';
                inputTextField.setText("");
            }
        });
        button_С.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputTextField.setText("");
                inputTextField.setText("");
            }
        });
        button_equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.setSecondNumber(inputTextField.getText());
                operation.doOperation();
                operation = operation.getResult(textPane, inputTextField, outputTextField, storeData);
            }
        });
    }
}
