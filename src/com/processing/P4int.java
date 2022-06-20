package com.processing;
import processing.core.*;
import com.processing.Picker;

public class P4int extends PApplet {

    public static void main(String[] args) {
        PApplet.main("com.processing.P4int");


    }

    public void setup() {
        Picker.picken();
    }

    public void reset(){
        background(255,0,0);
    }


    public void settings() {
        size(1000, 800);

    }

    public void draw() {
        if (mousePressed) {
            stroke(Picker.col.getRed(), Picker.col.getGreen(), Picker.col.getBlue());
            line(mouseX, mouseY, pmouseX, pmouseY);


        }

    }

}