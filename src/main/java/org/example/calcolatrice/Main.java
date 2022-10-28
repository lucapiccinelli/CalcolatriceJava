package org.example.calcolatrice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args){
        JFrame frame = new JFrame("calcolatrice");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = createPanel(400, 400);

        JButton button = new JButton("click me");
        button.setBounds(10, 10, 80, 40);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel, "ciao");
            }
        });

        panel.add(button);

        frame.setSize(400, 400);
        frame.add(panel);
        frame.setVisible(true);
    }

    private static JPanel createPanel(int width, int height){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, width, height);

        return panel;
    }

}
