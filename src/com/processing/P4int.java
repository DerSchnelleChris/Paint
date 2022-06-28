package com.processing;
import processing.core.*;
import java.awt.*;
import java.util.ArrayList;

public class P4int extends PApplet {

    Color bg = new Color(192, 192, 192);
    float x , y;



    public static void main(String[] args) {
        PApplet.main("com.processing.P4int");
    }

    public void setup() {
        background(bg.getRed(), bg.getGreen(), bg.getBlue());
        Picker.picken();
        rectMode(3);
    }

    public void reset(){
        loop();
        background(bg.getRed(), bg.getGreen(), bg.getBlue());
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
                    //Picker.switcher=true;
                    Picker.form = Picker.formAlt;
                    break;
            case 3: if (mousePressed) {
                    fill(Picker.col.getRed(), Picker.col.getGreen(), Picker.col.getBlue());
                    stroke(Picker.col.getRed(), Picker.col.getGreen(), Picker.col.getBlue());
                    circle(mouseX, mouseY, Picker.dm);}
                    break;
            case 4: if (mousePressed) {
                fill(Picker.col.getRed(), Picker.col.getGreen(), Picker.col.getBlue());
                stroke(Picker.col.getRed(), Picker.col.getGreen(), Picker.col.getBlue());
                rect(mouseX, mouseY, Picker.breite, Picker.hoehe);}
                break;
            case 5: if(mousePressed){
                strokeWeight(Picker.sg);
                stroke(bg.getRed(), bg.getGreen(), bg.getBlue());
                line(mouseX, mouseY, pmouseX, pmouseY);
                }
                break;
            case 6:


                break;
            case 7:
                setBg();
                background(Picker.col.getRed(), Picker.col.getGreen(), Picker.col.getBlue());
                Picker.form = Picker.formAlt;
                break;
            default: break;


        }

    }

    public void mouseReleased() {
        if (Picker.form == 6) {
            strokeWeight(Picker.sg);
            line(x, y, mouseX, mouseY);
        }
    }

    public void mousePressed(){
        if (Picker.form == 6) {
            x = mouseX;
            y = mouseY;
        }
    }


    public void setBg(){
        bg = new Color (Picker.col.getRed(), Picker.col.getGreen(), Picker.col.getBlue());
    }
}