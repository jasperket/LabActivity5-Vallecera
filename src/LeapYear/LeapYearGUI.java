package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setContentPane(app.panel1);
        app.setSize(600,600);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}
