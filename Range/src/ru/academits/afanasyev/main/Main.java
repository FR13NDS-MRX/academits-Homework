package ru.academits.afanasyev.main;

import ru.academits.afanasyev.range.Range;

public class Main {
    public static void main(String[] args) {
        Range range = new Range(0, 100);
        Range range1 = new Range(5, 10);
        Range range2 = new Range(7, 12);
        Range intersection = range1.getIntersection(range2);
        Range[] union = range1.getUnion(range2);
        Range[] difference = range1.getDifference(range2);

        if (intersection == null) {
            System.out.println("null");
        } else {
            System.out.printf("Новый интервал-пересечение - (%.2f; %.2f)%n", intersection.getFrom(), intersection.getTo());
        }

        if (union.length == 1) {
            System.out.printf("Новый интервал-объединение - (%.2f; %.2f)%n", union[0].getFrom(), union[0].getTo());
        } else {
            System.out.printf("Новый интервал-объединение - (%.2f; %.2f) и (%.2f; %.2f)%n", union[0].getFrom(), union[0].getTo(), union[1].getFrom(), union[1].getTo());
        }

        if (difference.length == 1) {
            System.out.printf("Новый интервал-разность - (%.2f; %.2f)%n", difference[0].getFrom(), difference[0].getTo());
        } else if (difference.length == 2){
            System.out.printf("Новый интервал-разность - (%.2f; %.2f) и (%.2f; %.2f)%n", difference[0].getFrom(), difference[0].getTo(), difference[1].getFrom(), difference[1].getTo());
        } else {
            System.out.println(0);
        }

        range.setFrom(10);
        range.setTo(110);

        System.out.println("Длина диапазона - " + range.getLength());
        double number = 50;

        if (range.isInside(number)) {
            System.out.printf("Чилсло %.2f входит в диапазон (%.2f; %.2f)", number, range.getFrom(), range.getTo());
        } else {
            System.out.printf("Число %.2f не входит в диапазон (%.2f;%.2f)", number, range.getFrom(), range.getTo());
        }
    }
}