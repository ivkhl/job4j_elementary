package ru.job4j;

public class ArgMethod {
    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        // ArgMethod.hello(); - не имеет арументов

        // ArgMethod.hello(name, age); - аргумент метода hello имеет только тип данных String в данном случае

        // ArgMethod.hello(age); - имеет неправильный тип аргумента

         ArgMethod.hello(name+" " + age);
    }
}
