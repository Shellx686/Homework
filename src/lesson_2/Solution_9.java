package lesson_2;

public class Solution_9 {

    // Создайте программу, выводящую на экран первые 20 элементов
    // последовательности 2 4 8 16 32 64 128 …

    public static void main(String[] args) {
        int x = 2;
        for (int i = 0; i < 20; i++) {
            System.out.println(x);
            x += x;
        }
    }
}
