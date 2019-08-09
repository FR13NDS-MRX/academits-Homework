package ru.academits.afanasyev.shapes;

public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return "Прямоугольник";
    }

    @Override
    public int hashCode() {
        final int prime = 17;
        int hash = 1;
        hash = hash * prime + Double.hashCode(length);
        hash = hash * prime + Double.hashCode(width);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Rectangle r = (Rectangle) o;
        return length == r.length && width == r.width;
    }
}
