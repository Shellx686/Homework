package lesson_3.solution3;

// Написать класс ArraySorting, в котором будет метод bubbleSort.
// Он на вход принимает массив целых чисел (int), а на выход отдает
// новый! массив с отсортированными по возрастанию значениями.
// Вам нужно выполнить сортировку массива с помощью сортировки пузырьком

import java.util.Arrays;
import java.util.Random;

public class ArraySorting {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(10) + 5; // задает длинну массива в диапазано [5;14]
        int[] arr = new int[x];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }

        // смотрим получившийся массив
        System.out.println(Arrays.toString(arr));

        // смотрим отсортированный массив методом bubbleSort
        System.out.println(Arrays.toString(bubbleSort(arr)));

    }

    static int[] bubbleSort(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            int count;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    count = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = count;
                }
            }
        }
        return arr;
    }

}
