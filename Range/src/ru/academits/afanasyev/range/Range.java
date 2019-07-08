package ru.academits.afanasyev.range;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double number) {
        return (number >= from) && (number <= to);
    }

    public Range getCrossingInterval(Range range) {
        double range1From = this.getFrom();
        double range1To = this.getTo();
        double range2From = range.getFrom();
        double range2To = range.getTo();
        double range3From = 0;
        double range3To = 0;

        if (range1From > range2From) {
            range3From = range1From;
        }
        if (range1From < range2From) {
            range3From = range2From;
        }
        if (range1To > range2To) {
            range3To = range2To;
        }
        if (range1To < range2To) {
            range3To = range1To;
        }

        if ((range3From == 0) && (range3To == 0) || (range3From > range3To)) {
            return null;
        } else {
            return new Range(range3From, range3To);
        }
    }
}