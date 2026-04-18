package Swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

class CountryListExample {

    CountryListExample() {

        JFrame f = new JFrame("Country List");
        f.setSize(300, 300);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Country list
        String countries[] = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // JList
        JList<String> list = new JList<>(countries);
        list.setVisibleRowCount(5);

        // Map for capitals
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Addis Ababa");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        // Event handling
        list.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String country = list.getSelectedValue();
                if (country != null) {
                    System.out.println("Capital of " + country + " is: " + capitals.get(country));
                }
            }
        });

        f.add(new JScrollPane(list));
        f.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CountryListExample());
    }
}