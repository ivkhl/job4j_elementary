package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double stepenx = Math.pow(x2 - x1, 2);
        double stepeny = Math.pow(y2 - y1, 2);
         double summaxy = Math.sqrt(stepenx + stepeny);
        return summaxy;
    }

    public static void main(String[] args) {
        double result = Point.distance(2, 2, 8, 8);
        System.out.println("result (2, 2) to (8, 8) " + result);
    }
}
