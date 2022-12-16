package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    private List<JCheckBox> foods;

    private List<JRadioButton> discs;



    public FoodOrderGUI() {
        foods = new ArrayList<>();
        foods.add(cPizza);
        foods.add(cBurger);
        foods.add(cFries);
        foods.add(cSoftDrinks);
        foods.add(cTea);
        foods.add(cSundae);
        discs = new ArrayList<>();
        discs.add(rbNone);
        discs.add(rb5);
        discs.add(rb10);
        discs.add(rb15);

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) throws IllegalArgumentException {
                try {
                    double cost = 0;
                    double[] prices = {100,80,65,55,50,40};
                    double[] discounts = {0,0.05,0.1,0.15};
                    double chosenDisc = 0;
                    boolean foodSelected = false;
                    boolean discSelected = false;
                    for(int i = 0; i < foods.size(); i++) {
                        if(foods.get(i).isSelected()) {
                            cost += prices[i];
                            foodSelected = true;
                        }
                    }
                    if(!foodSelected)
                        throw new IllegalArgumentException("No food selected");
                    for(int i = 0; i < discs.size(); i++) {
                        if(discs.get(i).isSelected()) {
                            chosenDisc = discounts[i];
                            discSelected = true;
                        }
                    }
                    if(!discSelected)
                        throw new IllegalArgumentException("No discount selected");

                    double deduction = cost*chosenDisc;
                    cost -= deduction;

                    JOptionPane.showMessageDialog(null,String.format("The total price is Php %.2f", cost));
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }

            }
        });
    }

    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setContentPane(app.panel1);
        app.setTitle("Food Ordering System");
        app.setSize(600,600);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
