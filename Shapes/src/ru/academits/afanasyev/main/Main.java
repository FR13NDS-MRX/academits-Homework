package ru.academits.afanasyev.main;

import ru.academits.afanasyev.shapes.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Triangle triangle = new Triangle(1, 5, 3, 1, 2, 5);
        Rectangle rectangle1 = new Rectangle(2, 4);
        Rectangle rectangle2 = new Rectangle(1, 5);
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(4);

        double maxAreaShape = getMaxAreaShape(square.getArea(), triangle.getArea(), rectangle1.getArea(), rectangle2.getArea(), circle1.getArea(), circle2.getArea());
        System.out.println("Максимальная площадь фигуры - " + maxAreaShape);


    }

    public static double getMaxAreaShape(double... shape) {
        Arrays.sort(shape);
        return shape[shape.length - 1];
    }
}
