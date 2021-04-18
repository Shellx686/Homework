package lesson_2;

public class Solution_8 {

    //Создайте программу, выводящую на экран все неотрицательные элементы
    // последовательности 90 85 80 75 70 65 60 …

    public static void main(String[] args) {

        int x = 90;

        do {
            System.out.println(x);
            x -= 5;
        } while (x >= 0);

    }
}
