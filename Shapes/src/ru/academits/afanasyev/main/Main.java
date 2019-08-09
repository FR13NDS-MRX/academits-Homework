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

        Shape maxAreaShape = getMaxAreaShape(square, triangle, rectangle1, rectangle2, circle1, circle2);
        System.out.println("Фигура с максимальной площадью - " + maxAreaShape.toString());
        System.out.println("Её площадь - " + maxAreaShape.getArea());
        System.out.println("Её периметр - " + maxAreaShape.getPerimeter());
        System.out.println("Её ширина и высота - " + maxAreaShape.getWidth() + ", " + maxAreaShape.getHeight());
        System.out.println();

        Shape secondMaxPerimeterShape = getSecondMaxPerimeterShape(square, triangle, rectangle1, rectangle2, circle1, circle2);
        System.out.println("Фигура со вторым по величене периметром - " + secondMaxPerimeterShape.toString());
        System.out.println("Её периметер - " + secondMaxPerimeterShape.getPerimeter());
        System.out.println("Её площадь - " + secondMaxPerimeterShape.getArea());
        System.out.println("Её ширина и высота - "  + secondMaxPerimeterShape.getWidth() + ", " + secondMaxPerimeterShape.getHeight());
    }

    private static Shape getMaxAreaShape(Shape... shape) {
        Arrays.sort(shape, new AreaComparator());
        return shape[shape.length - 1];
    }

    private static Shape getSecondMaxPerimeterShape(Shape... shape) {
        Arrays.sort(shape, new PerimeterComparator());
        return shape[shape.length - 2];
    }
}