package lesson_2;

import java.util.Scanner;

public class Solution_11 {

    // Выведите на экран все положительные делители натурального числа,
    // введённого пользователем с клавиатуры

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if (x > 0) {
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    System.out.print(i + " ");
                }
            }
        } else System.out.println("Число меньше 1");
    }
}
