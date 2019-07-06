package ru.academits.afanasyev.main;

import ru.academits.afanasyev.range.Range;

public class Main {
    public static void main(String[] args) {
        Range range = new Range(0, 100);

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