package lesson_2;

import java.util.Scanner;

public class Solution_10 {

    // Создайте программу, вычисляющую факториал натурального числа n,
    // которое пользователь введёт с клавиатуры

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                f *= i;

            }
            System.out.println("Факториал числа " + n + " равняется " + f);
        }
        else System.out.println("Введенное число не является натуральным");
    }
}
