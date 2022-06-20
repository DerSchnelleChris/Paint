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
        if (mousePressed) {
            strokeWeight(Picker.sg);
            stroke(Picker.col.getRed(), Picker.col.getGreen(), Picker.col.getBlue());
            line(mouseX, mouseY, pmouseX, pmouseY);
        }

        if(!Picker.switcher) {
            reset();
            Picker.switcher=true;
        }

    }

}