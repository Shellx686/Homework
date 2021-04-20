package lesson_3.solution2;

//Написать класс ArrayUtil. У него два метода - min(int[] array) и max(int[] array).
// Он должен возвращать вам минимум и максимум из переданного массива.
// Т.е. в метод min вы передаете массив, а в ответ вам возвращается число,
// которое является минимум из переданного массива.

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(11);
        }
        // смотрим получившийся массив
        System.out.println("Массив случайных чисел:");
        System.out.println(Arrays.toString(arr));

        // находим и выводим на экран минимум
        System.out.println("Минимум равен: " + min(arr));

        // находим и выводим на экран максимум
        System.out.println("Максимум равен: " + max(arr));
    }

    static int min(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    static int max(int[] array) {
        Arrays.sort(array);
        return array[array.length-1];
    }
}
