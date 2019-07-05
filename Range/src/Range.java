public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double number) {
        return (number >= from) && (number <= to);
    }

    public static void main(String[] args) {
        Range range = new Range(0, 100);

        System.out.println("Длина диапазона - " + range.getLength());
        double number = 50;

        if (range.isInside(number)) {
            System.out.printf("Чилсло %f входит в диапазон", number);
        }
        else {
            System.out.printf("Число %f не входит в диапазон.", number);
        }
    }
}