import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FoodListApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Food List Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton btnShowFoods = new JButton("Show Food Items");

        btnShowFoods.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Food items array
                String[] foods = {
                    "Pizza",
                    "Burger",
                    "Pasta",
                    "Sandwich",
                    "Dosa",
                    "Biryani",
                    "Idli"
                };

                // List inside a scrollable pane
                JList<String> foodList = new JList<>(foods);
                JScrollPane scrollPane = new JScrollPane(foodList);

                // Dialog box to show the list
                JOptionPane.showMessageDialog(
                    frame,
                    scrollPane,
                    "Available Food Items",
                    JOptionPane.PLAIN_MESSAGE
                );
            }
        });

        frame.add(btnShowFoods);
        frame.setVisible(true);
    }
}
