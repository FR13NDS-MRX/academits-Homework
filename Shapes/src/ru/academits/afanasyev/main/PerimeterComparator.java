package ru.academits.afanasyev.main;

import ru.academits.afanasyev.shapes.Shape;

import java.util.Comparator;

public class PerimeterComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape s1, Shape s2) {
        return (int) s1.getPerimeter() - (int) s2.getPerimeter();
    }
}
