package ru.academits.afanasyev.shapes;

public class Triangle implements Shape {
    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;

    public Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    private double getALength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    private double getBLength() {
        return Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
    }

    private double getCLength() {
        return Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
    }

    @Override
    public double getWidth() {
        return Math.max(x1, Math.max(x2, x3)) - Math.min(x1, Math.min(x2, x3));
    }

    @Override
    public double getHeight() {
        return Math.max(y1, Math.max(y2, y3)) - Math.min(y1, Math.min(y2, y3));
    }

    @Override
    public double getArea() {
        double a = getALength();
        double b = getBLength();
        double c = getCLength();
        double semiPerimeter = (a + b + c) / 2;

        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }

    @Override
    public double getPerimeter() {
        return getALength() + getBLength() + getCLength();
    }

    @Override
    public String toString() {
        return "Треугольник";
    }

    @Override
    public int hashCode() {
        final int prime = 17;
        int hash = 1;
        hash = hash * prime + (int) x1;
        hash = hash * prime + (int) x2;
        hash = hash * prime + (int) x3;
        hash = hash * prime + (int) y1;
        hash = hash * prime + (int) y2;
        hash = hash * prime + (int) y3;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Triangle t = (Triangle) o;
        if (x1 != t.x1) return false;
        if (x2 != t.x2) return false;
        if (x3 != t.x3) return false;
        if (y1 != t.y1) return false;
        if (y2 != t.y2) return false;
        if (y3 != t.y3) return false;
        return x1 == t.x1 && x2 == t.x2 && x3 == t.x3 && y1 == t.y1 && y2 == t.y2 && y3 == t.y3;
    }
}
