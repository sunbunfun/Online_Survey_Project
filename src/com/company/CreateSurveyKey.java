package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class CreateSurveyKey extends JFrame {
        public CreateSurveyKey() {
            frame();
        }

        //CreateSurveyKey thing

        public void frame() {
            JFrame f = new JFrame("Create A Survey Key");

            f.setVisible(true);
            f.setSize(400, 400);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel p = new JPanel();

            JTextField createKeyField = new JTextField();
            createKeyField.setBounds(50, 100, 300, 25);

            JButton b1 = new JButton("Continue");
            b1.setBounds(50, 130, 300, 25);
            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == b1) {
                        f.dispose();
                        CreateSurvey createSurveyWindow = new CreateSurvey();
                    }
                }
            });

            p.setLayout(null);
            p.add(createKeyField);
            p.add(b1);
            f.add(p);
        }
    }
