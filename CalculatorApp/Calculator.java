import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {
    
    private JTextField inputField = new JTextField(20);
    private JButton[] digitButtons = new JButton[10];
    private JButton addButton = new JButton("+");
    private JButton subtractButton = new JButton("-");
    private JButton multiplyButton = new JButton("*");
    private JButton divideButton = new JButton("/");
    private JButton equalsButton = new JButton("=");
    private JButton clearButton = new JButton("C");
    
    private double operand1 = 0;
    private double operand2 = 0;
    private String operator = "";
    
    public Calculator() {
        setTitle("Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(inputField);
        inputPanel.add(clearButton);
        
        JPanel digitPanel = new JPanel(new GridLayout(4, 3));
        for (int i = 0; i < 10; i++) {
            digitButtons[i] = new JButton(String.valueOf(i));
            digitButtons[i].addActionListener(new DigitButtonListener());
            digitPanel.add(digitButtons[i]);
        }
        
        JPanel buttonPanel = new JPanel(new GridLayout(5, 1));
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);
        buttonPanel.add(equalsButton);
        
        add(inputPanel, BorderLayout.NORTH);
        add(digitPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.EAST);
        
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "+";
                operand1 = Double.parseDouble(inputField.getText());
                inputField.setText("");
            }
        });
        
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "-";
                operand1 = Double.parseDouble(inputField.getText());
                inputField.setText("");
            }
        });
        
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "*";
                operand1 = Double.parseDouble(inputField.getText());
                inputField.setText("");
            }
        });
        
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "/";
                operand1 = Double.parseDouble(inputField.getText());
                inputField.setText("");
            }
        });
        
        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operand2 = Double.parseDouble(inputField.getText());
                double result = 0;
                switch(operator) {
                    case "+":
                        result = operand1 + operand2;
                        break;
                    case "-":
                        result = operand1 - operand2;
                        break;
                    case "*":
                        result = operand1 * operand2;
                        break;
                    case "/":
                        result = operand1 / operand2;
                        break;
                }
                inputField.setText(String.valueOf(result));
            }
        });
        
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
                operand1 = 0;
                operand2 = 0;
                operator = "";
            }
        });
        
        setVisible(true);
    }
    
    private class DigitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String digit = e.getActionCommand();
            inputField.setText(inputField.getText() + digit);
        }
    }
    
    public static void main(String[] args) {
        new Calculator();
    }
}
