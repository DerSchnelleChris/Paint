package com.processing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

public class Picker extends JFrame{
    private JPanel mainPicker;
    private JButton farbwahl;
    private JButton stiftwahl;
    private JButton resetButton;
    private JButton größeSetzenButton;
    private JSpinner spinner1;
    public static Color col = Color.BLACK;
    static int sg = 4;
    public static boolean switcher = true;



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
                switcher = false;
            }

        });
        größeSetzenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sg = (int) spinner1.getValue();

            }
        });
        spinner1.addInputMethodListener(new InputMethodListener() {
            @Override
            public void inputMethodTextChanged(InputMethodEvent event) {

            }

            @Override
            public void caretPositionChanged(InputMethodEvent event) {

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
