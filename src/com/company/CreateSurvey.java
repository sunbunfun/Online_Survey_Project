package com.company;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class CreateSurvey extends JFrame{
    public CreateSurvey(){
        frame();
    }

    public void frame(){
        JFrame f = new JFrame("Create a Survey");

        f.setVisible(true);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();
        JButton homeButton = new JButton("Home");
        homeButton.setBounds(280, 5, 100, 25);
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == homeButton) { //when this button is pressed, it will route to the home page
                    f.dispose();
                    Home home = new Home();
                }
            }
        });

        p.setLayout(null);
        p.add(homeButton);
        f.add(p);
    }
}
