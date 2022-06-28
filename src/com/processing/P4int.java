package com.processing;
import processing.core.*;
import com.processing.Picker;

import java.awt.*;

public class P4int extends PApplet {

    Color bg = new Color(192, 192, 192);
    float x , y, a, b;
    int clickCount = -1;

    public static void main(String[] args) {
        PApplet.main("com.processing.P4int");
    }

    public void setup() {
        background(bg.getRed(), bg.getGreen(), bg.getBlue());
        Picker.picken();
        rectMode(3);
    }

    public void reset(){
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
                    Picker.switcher=true;
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
                noLoop();
                if(clickCount % 2 == 0) {
                    a = x;
                    b = y;
                    clickCount += 1;
                }
                else {
                    clickCount += 1;
                }
                mouseReleased(a, b, x, y);
                break;
            default: break;


        }

    }

    private void mouseReleased(float x, float y, float c, float d) {
        strokeWeight(Picker.sg);
        stroke(Picker.col.getRed(), Picker.col.getGreen(), Picker.col.getBlue());
        line(x,y, c, d);
    }

    public void mousePressed(){
        this.x = mouseX;
        this.y = mouseY;
        loop();
    }

}