package lesson_2;

import java.util.Scanner;

public class Solution_2 {
    // Создать программу, выводящую на экран ближайшее к 10 из двух
    // положительных чисел, записанных в переменные m и n.
    // Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double m = sc.nextDouble();
        double n = sc.nextDouble();
        if (m > 0 && n > 0) {
            double m1 = Math.abs(10 - m);
            double n1 = Math.abs(10 - n);

            if (m1 < n1) System.out.println(m + " ближайшее число к 10");
            else if (n1 < m1) System.out.println(n + " ближайшее число к 10");
            else System.out.println("Числа равны");
        }
        else System.out.println("Нужно ввести чётные числа!");


    }
}
