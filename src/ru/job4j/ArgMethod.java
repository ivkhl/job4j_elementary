package ru.job4j;

public class ArgMethod {

        public static int func1(int x) {
            return x * x + 1;
        }

        public static void main(String[] args) {

            int result1 = ArgMethod.func1(100);
            System.out.println(result1);

        }
}
