package ru.academits.afanasyev.main;

import ru.academits.afanasyev.shapes.Shape;

import java.util.Comparator;

public class AreaComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape shape1, Shape shape2) {
        return (int) shape1.getArea() - (int) shape2.getArea();
    }
}
