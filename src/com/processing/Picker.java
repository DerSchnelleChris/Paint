package com.processing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Picker extends JFrame{
    private JPanel mainPicker;
    private JButton farbwahl;
    private JButton stiftwahl;
    private JButton testButton;
    Color col;



    public Picker() {
        farbwahl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color col = JColorChooser.showDialog(null, "Farbauswahl", null);
                float rgb = col.getRGB();
                System.out.println(rgb);
            }
        });
        stiftwahl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void picken(){
        JFrame col = new JFrame("Picker");
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                try {
                    Picker colpick = new Picker();
                    colpick.setContentPane(new Picker().mainPicker);
                    colpick.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    colpick.setVisible(true);
                    colpick.pack();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }

    });
}
}
