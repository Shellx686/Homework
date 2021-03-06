package lesson_2;

import java.util.Random;

public class Solution_3 {

    // Создать программу, которая будет проверять попало ли случайно
    // выбранное из отрезка [5;155] целое число в интервал (25;100)
    // и сообщать результат на экран. Примеры работы программы:
    //
    //Число 113 не содержится в интервале (25,100). Число 72 содержится
    // в интервале (25,100). Число 25 не содержится в интервале (25,100)
    // Число 155 не содержится в интервале (25,100)

    public static void main(String[] args) {

        Random r = new Random();
        int a = r.nextInt(151) + 5; // [0; 150] -> [5; 155]
        if (a > 25 && a < 100) System.out.println("Число " + a + " содержится в интервале (25,100)");
        else System.out.println("Число " + a + " не содержится в интервале (25,100)");

    }
}
