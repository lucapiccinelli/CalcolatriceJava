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


        JButton button1 = new JButton("1");
        button1.setBounds(20, 225, 70, 50);
        button1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(panel, "1");
            }
        });

        panel.add(button1);


        JButton button2 = new JButton("2");
        button2.setBounds(110, 225, 70, 50);
        button2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(panel, "2");
            }
        });

        panel.add(button2);


        JButton button3 = new JButton("3");
        button3.setBounds(200, 225, 70, 50);
        button3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(panel, "3");
            }
        });

        panel.add(button3);


        JButton button4 = new JButton("4");
        button4.setBounds(20, 155, 70, 50);
        button4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(panel, "4");
            }
        });

        panel.add(button4);



        JButton button5 = new JButton("5");
        button5.setBounds(110, 155, 70, 50);
        button5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(panel, "5");
            }
        });

        panel.add(button5);


        JButton button6 = new JButton("6");
        button6.setBounds(200, 155, 70, 50);
        button6.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(panel, "6");
            }
        });

        panel.add(button6);


        JButton button7 = new JButton("7");
        button7.setBounds(20, 85, 70, 50);
        button7.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(panel, "7");
            }
        });

        panel.add(button7);


        JButton button8 = new JButton("8");
        button8.setBounds(110, 85, 70, 50);
        button8.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(panel, "8");
            }
        });

        panel.add(button8);


        JButton button9 = new JButton("9");
        button9.setBounds(200, 85, 70, 50);
        button9.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(panel, "9");
            }
        });

        panel.add(button9);


        JButton button0 = new JButton("0");
        button0.setBounds(110, 295, 70, 50);
        button0.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(panel, "0");
            }
        });

        panel.add(button0);


        JButton button10 = new JButton("C");
        button10.setBounds(20, 295, 70, 50);
        button10.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(panel, "C");
            }
        });

        panel.add(button10);


        JButton button11 = new JButton(",");
        button11.setBounds(200, 295, 70, 50);
        button11.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(panel, ",");
            }
        });

        panel.add(button11);


        JButton button12 = new JButton("+");
        button12.setBounds(290, 295, 70, 50);
        button12.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(panel, "+");
            }
        });

        panel.add(button12);


        JButton button13 = new JButton("-");
        button13.setBounds(290, 225, 70, 50);
        button13.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(panel, "-");
            }
        });

        panel.add(button13);


        JButton button14 = new JButton("x");
        button14.setBounds(290, 155, 70, 50);
        button14.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(panel, "x");
            }
        });

        panel.add(button14);


        JButton button15 = new JButton("÷");
        button15.setBounds(290, 85, 70, 50);
        button15.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(panel, "÷");
            }
        });

        panel.add(button15);


        JButton button16 = new JButton("=");
        button16.setBounds(290, 15, 70, 50);
        button16.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(panel, "=");
            }
        });

        panel.add(button16);




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