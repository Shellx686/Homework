package lesson_3.solution1;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // проверяем метод суммы
        System.out.println(calc.summ(5, 6));
        System.out.println(calc.summ(5.2, 6.8));
        long a = 34;
        long b = 43;
        System.out.println(calc.summ(a, b));

        // проверяем метод умножения
        System.out.println(calc.umnoj(4, 5));
        System.out.println(calc.umnoj(4.2, 5.3));
        System.out.println(calc.umnoj(a, b));

        // проверяем метод деления
        System.out.println(calc.delen(10, 5));
        System.out.println(calc.delen(4.2, 5.3));
        System.out.println(calc.delen(a, b));

        // проверяем метод вычитания
        System.out.println(calc.minus(10, 5));
        System.out.println(calc.minus(4.2, 5.3));
        System.out.println(calc.minus(a, b));


    }
}
