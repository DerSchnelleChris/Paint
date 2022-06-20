package com.processing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Picker extends JFrame{
    private JPanel mainPicker;
    private JButton farbwahl;
    private JButton stiftwahl;
    private JButton resetButton;
    public static Color col = Color.BLACK;



    public Picker() {
        farbwahl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col = JColorChooser.showDialog(null, "Farbauswahl", null);

            }
        });
        stiftwahl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void picken(){
        JFrame frame1 = new JFrame("Picker");
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
