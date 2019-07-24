package ru.academits.afanasyev.square;

import ru.academits.afanasyev.shape.Shape;

public class Square implements Shape {
    private double sideLength;

    Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getWidth() {
        return sideLength;
    }

    public double getHeight() {
        return sideLength;
    }

    public double getArea() {
        return sideLength * sideLength;
    }

    public double getPerimeter() {
        return sideLength * 4;
    }
}
