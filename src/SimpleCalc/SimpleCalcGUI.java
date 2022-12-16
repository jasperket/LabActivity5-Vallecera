package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI() {
        cbOperations.addItem('+');
        cbOperations.addItem('-');
        cbOperations.addItem('*');
        cbOperations.addItem('/');
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(tfNumber1.getText());
                int num2 = Integer.parseInt(tfNumber2.getText());
                int result;
                switch (cbOperations.getSelectedItem().toString()) {
                    case "+":
                        result = num1+num2;
                        lblResult.setText(String.valueOf(result));
                        break;
                    case "-":
                        result = num1-num2;
                        lblResult.setText(String.valueOf(result));
                        break;
                    case "*":
                        result = num1*num2;
                        lblResult.setText(String.valueOf(result));
                        break;
                    case "/":
                        result = num1/num2;
                        lblResult.setText(String.valueOf(result));
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setContentPane(app.panel1);
        app.setTitle("Simple Calculator");
        app.setSize(600,600);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
