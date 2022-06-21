package com.processing;
import processing.core.*;
import com.processing.Picker;

import java.awt.*;

public class P4int extends PApplet {

    public static void main(String[] args) {
        PApplet.main("com.processing.P4int");


    }

    public void setup() {
        background(192,192,192);
        Picker.picken();
    }

    public void reset(){
        background(192,192,192);


    }


    public void settings() {
        size(1000, 800);

    }

    public void draw() {

        switch (Picker.form) {
            case 1: if (mousePressed) {
                strokeWeight(Picker.sg);
                stroke(Picker.col.getRed(), Picker.col.getGreen(), Picker.col.getBlue());
                line(mouseX, mouseY, pmouseX, pmouseY);
                }
                break;
            case 2: reset();
                    Picker.switcher=true;
                    Picker.form = Picker.formAlt;
                    break;
            case 3: if (mousePressed) {
                    fill(Picker.col.getRed(), Picker.col.getGreen(), Picker.col.getBlue());
                    circle(mouseX, mouseY, Picker.dm);}
                    break;
            case 4: if (mousePressed) {
                fill(Picker.col.getRed(), Picker.col.getGreen(), Picker.col.getBlue());
                rect(mouseX, mouseY, Picker.breite, Picker.hoehe);}
                break;
            default: break;


        }

    }

}