package org.example.calcolatrice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main
{

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Calcolatrice");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = createPanel(400, 400);

        JTextField inputField = new JTextField();
        inputField.setBounds(20, 10, 250, 60);
        inputField.setEditable(false);
        panel.add(inputField);


        buttonList(panel);
        createClearButton(20, 295, panel);


        frame.setSize(400, 400);
        frame.add(panel);
        frame.setVisible(true);
    }



    private static void buttonList(JPanel panel)
    {
        createButton(20, 225, "1", panel);
        createButton(110, 225, "2", panel);
        createButton(200, 225, "3", panel);
        createButton(20, 155,"4", panel);
        createButton(110, 155,"5", panel);
        createButton(200, 155, "6", panel);
        createButton(20, 85, "7", panel);
        createButton(110, 85, "8", panel);
        createButton(200, 85, "9", panel);
        createButton(110, 295, "0", panel);
        createButton(200, 295, ",", panel);
        createButton(290, 295, "+", panel);
        createButton(290, 225, "-", panel);
        createButton(290, 155, "X", panel);
        createButton(290, 85, "÷", panel);
        createButton(290, 15, "=", panel);
    }



    private static void createButton(int x, int y, String text, JPanel panel)
    {
        JButton button = JButton(text, x, y);
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JTextField inputField = (JTextField) panel.getComponent(0);
                String inputFieldText = inputField.getText();
                inputField.setText(inputFieldText + text);
            }
        });
        panel.add(button);
    }




    private static void createClearButton(int x, int y, JPanel panel)
    {
        JButton button = JButton("C", x, y);
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JTextField inputField = (JTextField) panel.getComponent(0);
                clearField(inputField);
            }
        });
        panel.add(button);
    }

    private static JButton JButton(String C, int x, int y)
    {
        JButton button = new JButton(C);
        button.setBounds(x, y, 70, 50);
        return button;
    }


    private static void clearField(JTextField inputField)
    {
        inputField.setText("");
    }




    private static JPanel createPanel(int width, int height)
    {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, width, height);

        return panel;
    }
}