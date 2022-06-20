package com.processing;
import processing.core.*;

public class P4int extends PApplet {

    public static void main(String[] args) {
        PApplet.main("com.processing.P4int");


    }

    float maus1, maus2;
    public void setup() {
        Picker.picken();
        maus1 = mouseX;
        maus2 = mouseY;


    }


    public void settings() {
        size(1000, 800);

    }

    public void draw() {
        frameRate(500);
        //stroke(Picker.getColor());
        strokeWeight(16);
        line(maus1, maus2, mouseX, mouseY);
        maus1 = mouseX;
        maus2 = mouseY;


    }






}
