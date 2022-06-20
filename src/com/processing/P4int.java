package com.processing;
import processing.core.*;

public class P4int extends PApplet {

    public static void main(String[] args) {
        PApplet.main("com.processing.P4int");


    }

    public void setup() {
        Picker.picken();


    }


    public void settings() {
        size(1000, 800);

    }

    public void draw() {
        if (mousePressed) {

            line(mouseX, mouseY, pmouseX, pmouseY);

        }

    }

}