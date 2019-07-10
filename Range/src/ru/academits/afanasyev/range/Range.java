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

    public Range[] addIntervals(Range range) {
        double range1From = this.getFrom();
        double range1To = this.getTo();
        double range2From = range.getFrom();
        double range2To = range.getTo();
        double range4From;
        double range4To;

        if ((range1To > range2From) && (range1To < range2To)) {
            range4From = range1From;
            range4To = range2To;

            Range range4 = new Range(range4From, range4To);
            return new Range[]{range4, null};
        }
        if ((range1To > range2From) && (range1To > range2To)) {
            range4From = range1From;
            range4To = range1To;

            Range range4 = new Range(range4From, range4To);
            return new Range[]{range4, null};
        }

        Range range1 = new Range(range1From, range1To);
        Range range2 = new Range(range2From, range2To);

        return new Range[]{range1, range2};
    }

    public Range[] subtractIntervals(Range range) {
        double range1From = this.getFrom();
        double range1To = this.getTo();
        double range2From = range.getFrom();
        double range2To = range.getTo();
        double range5From;
        double range5To;
        double range6From;
        double range6To;

        if ((range1To > range2From) && (range1To < range2To)) {
            range5From = range1From;
            range5To = range2From - 1;

            Range range5 = new Range(range5From, range5To);
            return new Range[]{range5, null};
        }

        if (range1To < range2From) {
            range5From = range1From;
            range5To = range1To;

            Range range5 = new Range(range5From, range5To);
            return new Range[]{range5, null};
        }

        if ((range1To > range2From) && (range1To > range2To)) {
            range5From = range1From;
            range5To = range2From - 1;
            range6From = range2To + 1;
            range6To = range1To;

            Range range5 = new Range(range5From, range5To);
            Range range6 = new Range(range6From, range6To);
            return new Range[]{range5, range6};
        }

        return null;
    }
}