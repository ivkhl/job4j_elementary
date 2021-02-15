package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double hprm = (a + b + c) / 2;
        return Math.sqrt(hprm * (hprm - a) * (hprm - b) * (hprm - c));
        //  hprm means halfperimeter
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
