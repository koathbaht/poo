package lab1;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        ex2();
        ex3();
    }

    private static void ex2() {
        System.out.println("Hello World!");
    }

    private static void ex3() {
        int n = 10;
        Random rand = new Random();
        int i = rand.nextInt(n);
        int i2 = i * 2;
        System.out.println(i2);
    }
}
