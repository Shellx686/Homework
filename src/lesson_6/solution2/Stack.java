package lesson_6.solution2;

// Написать стек на основе массива (методы push и pop). Массив имеет фиксированный размер.
// Если пытаемся положить элемент (push) в стек, который заполнен, то тогда ничего не делаем.
// Если пытаемся вытащить элемент из стека (pop метод), а стек пуст, то тогда возвращаем 0.

public class Stack {
    int number; // длина массива
    int index = -1; // индекс элемента в массиве
    int[] arr;

    public Stack(int number) {
        this.number = number;
        arr = new int[number];
    }

    // помещаем элемент в стек
    void push(int a) {
        if (++index < number) {
            arr[index] = a;
        }
    }

    // проверяем пустой ли стек
    boolean isEmpty(){
        return index < 0;
    }

    // посмотреть крайний элемент стека
    int peek(){
        if (index > -1 && index < number) return arr[index];
        else return 0;
    }

    // посмотреть текущий элемент стека и удалить его
    int pop(){
        if (isEmpty()) return 0;
        else return arr[index--];
    }

}
