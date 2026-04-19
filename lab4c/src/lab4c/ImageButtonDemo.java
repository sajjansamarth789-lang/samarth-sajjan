/*4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass
is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by
implementing the event handling mechanism with addActionListener( ).*/


package lab4c;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo implements ActionListener {

    JFrame frame;
    JButton btnClock, btnHourGlass;
    JLabel label;

    public ImageButtonDemo() {

        // Create Frame
        frame = new JFrame("Image Button Demo");

        // Load Images (place images in same folder or give full path)
        ImageIcon clockIcon = new ImageIcon("digitalclock.jpg");
        ImageIcon hourGlassIcon = new ImageIcon("hourglass.jpg");

        // Create Buttons with Images
        btnClock = new JButton(clockIcon);
        btnHourGlass = new JButton(hourGlassIcon);

        // Create Label
        label = new JLabel("Click an Image Button");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 20));

        // Layout
        frame.setLayout(new GridLayout(3, 1));

        // Add Action Listeners
        btnClock.addActionListener(this);
        btnHourGlass.addActionListener(this);

        // Add components
        frame.add(label);
        frame.add(btnClock);
        frame.add(btnHourGlass);

        // Frame settings
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Event Handling
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnClock) {
            label.setText("Digital Clock is pressed");
        } else if (e.getSource() == btnHourGlass) {
            label.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        new ImageButtonDemo();
    }
}
