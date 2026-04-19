package lab5a;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryListDemo {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Country List");

        // Country List Data
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Create JList
        JList<String> countryList = new JList<>(countries);

        // Set selection mode (single selection)
        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add ListSelectionListener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                // To avoid multiple events firing
                if (!e.getValueIsAdjusting()) {
                    String selected = countryList.getSelectedValue();
                    System.out.println("Selected Country: " + selected);
                }
            }
        });

        // Add JList inside JScrollPane
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Add to frame
        frame.add(scrollPane, BorderLayout.CENTER);

        // Frame settings
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}