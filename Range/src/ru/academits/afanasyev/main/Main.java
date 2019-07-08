package ru.academits.afanasyev.main;

import ru.academits.afanasyev.range.Range;

public class Main {
    public static void main(String[] args) {
        Range range = new Range(0, 100);
        Range range1 = new Range(54, 187);
        Range range2 = new Range(188, 243);
        Range range3 = range1.getCrossingInterval(range2);

        if (range3 == null) {
            System.out.println("null");
        } else {
            System.out.printf("Новый интервал пересечение - от %f до %f%n", range3.getFrom(), range3.getTo());
        }
        
        range.setFrom(10);
        range.setTo(110);

        System.out.println("Длина диапазона - " + range.getLength());
        double number = 50;

        if (range.isInside(number)) {
            System.out.printf("Чилсло %f входит в диапазон от %f до %f", number, range.getFrom(), range.getTo());
        } else {
            System.out.printf("Число %f не входит в диапазон от %f до %f", number, range.getFrom(), range.getTo());
        }
    }
}