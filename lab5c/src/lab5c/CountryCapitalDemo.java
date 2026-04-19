package lab5c;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;

public class CountryCapitalDemo {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Country - Capital List");

        // Country array
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Create JList
        JList<String> list = new JList<>(countries);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Country → Capital mapping
        HashMap<String, String> map = new HashMap<>();
        map.put("USA", "Washington, D.C.");
        map.put("India", "New Delhi");
        map.put("Vietnam", "Hanoi");
        map.put("Canada", "Ottawa");
        map.put("Denmark", "Copenhagen");
        map.put("France", "Paris");
        map.put("Great Britain", "London");
        map.put("Japan", "Tokyo");
        map.put("Africa", "No single capital"); // continent
        map.put("Greenland", "Nuuk");
        map.put("Singapore", "Singapore");

        // Add Listener
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {
                    String country = list.getSelectedValue();
                    String capital = map.get(country);

                    System.out.println("Selected Country: " + country);
                    System.out.println("Capital: " + capital);
                    System.out.println("------------------------");
                }
            }
        });

        // Add scroll pane
        JScrollPane sp = new JScrollPane(list);
        frame.add(sp, BorderLayout.CENTER);

        // Frame settings
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}