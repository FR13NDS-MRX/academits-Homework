package ru.academits.afanasyev.main;

import ru.academits.afanasyev.range.Range;

public class Main {
    public static void main(String[] args) {
        Range range = new Range(0, 100);
        Range range1 = new Range(54, 187);
        Range range2 = new Range(150, 243);
        Range range3 = range1.getCrossingInterval(range2);
        Range[] range4 = range1.addIntervals(range2);
        Range[] range5 = range1.subtractIntervals(range2);

        if (range3 == null) {
            System.out.println("null");
        } else {
            System.out.printf("Новый интервал-пересечение - (%.2f; %.2f)%n", range3.getFrom(), range3.getTo());
        }

        if (range4[1] == null) {
            System.out.printf("Новый интервал-объединение - (%.2f; %.2f)%n", range4[0].getFrom(), range4[0].getTo());
        } else {
            System.out.printf("Новый интервал-объединение - (%.2f; %.2f) и (%.2f; %.2f)%n", range4[0].getFrom(), range4[0].getTo(), range4[1].getFrom(), range4[1].getTo());
        }

        if (range5[1] == null) {
            System.out.printf("Новый интервал-разность - (%.2f; %.2f)%n", range5[0].getFrom(), range5[0].getTo());
        } else {
            System.out.printf("Новый интервал-разность - (%.2f; %.2f) и (%.2f; %.2f)%n", range5[0].getFrom(), range5[0].getTo(), range5[1].getFrom(), range5[1].getTo());
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