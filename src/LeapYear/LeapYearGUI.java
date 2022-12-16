package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int year = Integer.parseInt(tfYear.getText());
                    if(year % 4 == 0 && year % 100 != 0) {
                        JOptionPane.showMessageDialog(null, "Leap year");
                    } else if (year % 400 == 0) {
                        JOptionPane.showMessageDialog(null, "Leap year");
                    } else {
                        JOptionPane.showMessageDialog(null, "Not a leap year");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setContentPane(app.panel1);
        app.setSize(600,600);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}
