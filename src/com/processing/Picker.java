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
    private JSpinner stiftgroesse;
    private JButton kreiszeichnen;
    private JSpinner kreisDm;
    private JButton quadratzeichnen;
    private JSpinner rechteckBreite;
    private JButton freiZeichnen;
    private JButton radieren;
    private JSpinner rechteckHöhe;
    private JButton linie;
    private JButton setHintergrund;
    public static Color col = Color.BLACK;
    static int sg=4;
    static int dm = 0;
    static int breite = 0;
    static int hoehe = 0;
    public static boolean switcher = true;
    static int form = 1;
    static int formAlt;



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
                formAlt = form;
                form = 2;


            }

        });
        größeSetzenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sg = (int) stiftgroesse.getValue();

            }
        });
        stiftgroesse.addInputMethodListener(new InputMethodListener() {
            @Override
            public void inputMethodTextChanged(InputMethodEvent event) {

            }

            @Override
            public void caretPositionChanged(InputMethodEvent event) {

            }
        });

        kreiszeichnen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dm = (int) kreisDm.getValue();
                form = 3;

            }
        });
        kreisDm.addInputMethodListener(new InputMethodListener() {
            @Override
            public void inputMethodTextChanged(InputMethodEvent event) {

            }

            @Override
            public void caretPositionChanged(InputMethodEvent event) {

            }
        });
        freiZeichnen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form = 1;
            }
        });
        quadratzeichnen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                breite = (int) rechteckBreite.getValue();
                hoehe = (int) rechteckHöhe.getValue();
                form = 4;
            }
        });
        rechteckBreite.addInputMethodListener(new InputMethodListener() {
            @Override
            public void inputMethodTextChanged(InputMethodEvent event) {

            }

            @Override
            public void caretPositionChanged(InputMethodEvent event) {

            }
        });
        radieren.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form = 5;
            }
        });
        linie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form = 6;
            }
        });
        setHintergrund.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formAlt = form;
                form = 7;
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
