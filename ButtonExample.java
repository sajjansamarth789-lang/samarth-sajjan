package Swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ButtonExample {

    ButtonExample() {

        JFrame f = new JFrame("Button Event Example");
        f.setSize(400, 300);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label to display message
        JLabel label = new JLabel("Click a Button");
        label.setFont(new Font("Arial", Font.BOLD, 16));

        // Buttons (you can replace with images if available)
        JButton btnClock = new JButton("Digital Clock");
        JButton btnGlass = new JButton("Hour Glass");

        // ActionListener for Digital Clock
        btnClock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        // ActionListener for Hour Glass
        btnGlass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        // Add components
        f.add(btnClock);
        f.add(btnGlass);
        f.add(label);

        f.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonExample();
            }
        });
    }
}