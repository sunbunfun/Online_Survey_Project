package com.company;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;

public class Home extends JFrame{
    public Home(){
        frame();
    }

    //Home Screen
    public void frame(){
        JFrame f = new JFrame("Survey Maker");

        f.setVisible(true);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();
        JButton b1 = new JButton("Create a survey");
        b1.setBounds(50, 130, 300, 25);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b1) {
                    f.dispose();
                    CreateSurveyKey createSurveyKeyWindow = new CreateSurveyKey();
                }
            }
        });

        JButton b2 = new JButton("Answer a survey");
        b2.setBounds(50, 160, 300, 25);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b2) {
                    f.dispose();
                    //  BillSplit billSplitWindow = new BillSplit();
                }
            }
        });


        JButton b3 = new JButton("See Survey Results");
        b3.setBounds(50, 190, 300, 25);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b3) {
                    f.dispose();
                    //  BillSplit billSplitWindow = new BillSplit();
                }
            }
        });

        JButton b4 = new JButton("Exit Application");
        b4.setBounds(50, 220, 300, 25);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b4) {
                    System.exit(0);
                }
            }
        });

        JLabel labelOne = new JLabel("Welcome to SunShine Survey!");
        labelOne.setBounds(130, 5, 300, 200);

        p.setLayout(null);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(labelOne);
        f.add(p);
    }
}
