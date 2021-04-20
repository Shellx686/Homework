package lesson_3.solution1;

//  Создать класс Calculator. У него должны быть методы:
//1. Сумма
//2. Деление
//3. Умножение
//4. Вычитание
//Все методы должны быть перегружены и работать с тремя типами - double, long и int.
// Т.е. Нужен должны быть, к примеру, по 3 метода суммы: add(int a, int b),
// add(double a, double b) и add(long a, long b).

public class Calculator {

    int summ(int a, int b) {
        int sum = a + b;
        return sum;
    }

    double summ(double a, double b) {
        return a + b;
    }

    long summ(long a, long b) {
        return a + b;
    }

    int delen(int a, int b) {
        int sum = a / b;
        return sum;
    }

    double delen(double a, double b) {
        return a / b;
    }

    long delen(long a, long b) {
        return a / b;
    }

    int umnoj(int a, int b) {
        int sum = a * b;
        return sum;
    }

    double umnoj(double a, double b) {
        return a * b;
    }

    long umnoj(long a, long b) {
        return a * b;
    }

    int minus(int a, int b) {
        int sum = a - b;
        return sum;
    }

    double minus(double a, double b) {
        return a - b;
    }

    long minus(long a, long b) {
        return a - b;
    }
}
