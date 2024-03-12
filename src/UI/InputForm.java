package UI;

import javax.swing.*;
import java.awt.*;

public class InputForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,2));

        JLabel lblKM = new JLabel("Nombre de km :");
        JTextField txtKM = new JTextField();
        JLabel lblPrice = new JLabel("Prix :");
        JTextField txtPrice = new JTextField();
        JLabel lblLiters = new JLabel("Litres :");
        JTextField txtLiters = new JTextField();
        JButton btnAdd = new JButton("Ajouter");
        JButton btnStats = new JButton("Stats");

        panel.add(lblKM);
        panel.add(txtKM);
        panel.add(lblPrice);
        panel.add(txtPrice);
        panel.add(lblLiters);
        panel.add(txtLiters);
        panel.add(btnAdd);
        panel.add(btnStats);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
