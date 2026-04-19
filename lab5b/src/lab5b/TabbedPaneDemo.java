/*5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and display
the concerned color whenever the specific tab is selected in the Pan.*/



package lab5b;

import javax.swing.*;
import java.awt.*;

public class TabbedPaneDemo {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Tabbed Pane Color Demo");

        // Create TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create Panels for each tab
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        // Add tabs with panels
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add tabbedPane to frame
        frame.add(tabbedPane);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
