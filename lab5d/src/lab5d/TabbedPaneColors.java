package lab5d;

import javax.swing.*;
import java.awt.*;

public class TabbedPaneColors {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Tabbed Pane Colors");

        // Create TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create Panels
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add Tabs
        tabbedPane.addTab("CYAN", cyanPanel);
        tabbedPane.addTab("MAGENTA", magentaPanel);
        tabbedPane.addTab("YELLOW", yellowPanel);

        // Add to Frame
        frame.add(tabbedPane);

        // Frame Settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}