import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame implements ActionListener 
{
    private JTextField display;
    private JPanel panel;
    private String[] buttons = 
    {
        "7", "8", "9", "/", 
        "4", "5", "6", "*", 
        "1", "2", "3", "-", 
        "0", ".", "=", "+"
    };
    private String operand1 = "";
    private String operand2 = "";
    private String operator = "";

    public CalculatorGUI() 
    {
        display = new JTextField();
        display.setEditable(false);
        display.setPreferredSize(new Dimension(200, 50));
        display.setHorizontalAlignment(JTextField.RIGHT);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        for (String button : buttons) 
        {
            JButton btn = new JButton(button);
            btn.addActionListener(this);
            panel.add(btn);
        }

        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
    {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
            if (!operator.isEmpty()) 
            {
                operand2 += command;
            } 
            else 
            {
                operand1 += command;
            }
            display.setText(operand1 + operator + operand2);
        } 
        else if (command.equals("=")) 
        {
            double result = calculate(Double.parseDouble(operand1), Double.parseDouble(operand2), operator);
            display.setText(operand1 + operator + operand2 + "=" + result);
            operand1 = Double.toString(result);
            operand2 = "";
            operator = "";
        } 
        else 
        {
            if (operator.isEmpty() || operand2.isEmpty()) 
            {
                operator = command;
            } 
            else 
            {
                double result = calculate(Double.parseDouble(operand1), Double.parseDouble(operand2), operator);
                operand1 = Double.toString(result);
                operator = command;
                operand2 = "";
            }
            display.setText(operand1 + operator + operand2);
        }
    }

    private double calculate(double operand1, double operand2, String operator) {
        switch (operator) 
        {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 != 0) 
                {
                    return operand1 / operand2;
                } 
                else 
                {
                    JOptionPane.showMessageDialog(this, "Cannot divide by zero");
                    return 0;
                }
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
} 