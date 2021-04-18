package lesson_2;

import java.util.Scanner;

public class Solution_1 {

    // Создать программу, проверяющую и сообщающую на экран,
    // является ли целое число записанное в переменную n, чётным либо нечётным.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n % 2 == 0 ? "Число является чётным" : "Числоя является нечётным");

    }
}
