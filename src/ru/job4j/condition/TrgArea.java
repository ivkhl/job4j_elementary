package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double halfperimeter = (a + b + c) /2;
        double square = Math.sqrt(halfperimeter * (halfperimeter - a) * (halfperimeter - b) * (halfperimeter - c));
        return square;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
