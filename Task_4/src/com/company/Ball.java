package com.company;

public class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(Math.PI * Math.pow(radius, 3) * 4 / 3, radius);
    }
}
