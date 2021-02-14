package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double summax = x2 - x1;
        double summay = y2 - y1;
        double stepenx = Math.pow(summax, 2);
        double stepeny = Math.pow(summay, 2);
        double summaxy = stepenx + stepeny;
        double output = Math.sqrt(summaxy);
        return output;
    }

    public static void main(String[] args) {
        double result = Point.distance(2, 2, 8, 8);
        System.out.println("result (2, 2) to (8, 8) " + result);
    }
}
