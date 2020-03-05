package com.company;

public class Pyramid extends Shape {
    private double s;
    private double height;

     public Pyramid(double height, double s) {
         super(height * s * 4 / 3);
         this.height = height;
         this.s = s;
     }
}
