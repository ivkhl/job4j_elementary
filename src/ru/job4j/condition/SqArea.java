package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double height = (2*(k+1))/p;
        double length = height * k;
        double square = length *height;
        return square;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
