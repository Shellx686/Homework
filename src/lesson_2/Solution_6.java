package lesson_2;

public class Solution_6 {

    //Создайте программу, выводящую на экран все четырёхзначные числа
    // последовательности 1000 1003 1006 1009 1012 1015 …

    public static void main(String[] args) {
        int x = 1000;
        while (x <= 9999) {
            System.out.println(x);
            x += 3;
        }
    }
}
