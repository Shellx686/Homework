package lesson_6.solution1;

import lesson_3.solution2.ArrayUtil;

// removeByValue(int value) - удаляет все элементы из массива, которые равны заданному значению.
// К примеру, removeByValue(3), массив элементов [3, 5, 6, 3 8, 4], в результате должны остаться [5, 6, 8, 4].
// removeByIndex(int index) - удаляет элемет по идексу
// trim() - уменьшает размер массива до количества элементов, т.е. Если размер массива 9,
// а элементов 5, то размер массива должен стать равным 5
// get(int index) - получение элемента по индексу
// getSize() - получение размера списка
// isEmpty() - возвращает true, если список пуст, иначе false

public class DynamicArray {

    private int[] arr;

    public DynamicArray(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    void removeByValue(int value) {
        int COUNT = 0;
        int COUNT2 = 0;
        for (int i = 0; i < getArr().length; i++) {
            if (value == getArr()[i]) {
                COUNT++;
            }
        }
        int[] y = new int[getArr().length - COUNT];

        for (int i = 0; i < getArr().length; i++) {
            if (getArr()[i] != value) {
                y[COUNT2] = getArr()[i];
                COUNT2++;
            }
        }
        setArr(y);
    }

    void removeByIndex(int index) {
        if (index < getArr().length) {
            int count = 0;
            int[] y = new int[getArr().length - 1];
            for (int i = 0; i < getArr().length; i++) {
                if (i != index) {
                    y[count] = getArr()[i];
                    count++;
                }
            }
            setArr(y);
        }
        else System.out.println("В методе removeByIndex индекс элемента массива задан неверно.");
    }

    void trim() {
        int count = 0;
        for (int i = getArr().length - 1; i >= 0; i--) {
            if (getArr()[i] == 0) {
                count++;
            }
            else break;
        }
        int[] y = new int[getArr().length - count];
        for (int i = 0; i < y.length; i++) {
            y[i] = getArr()[i];
        }
        setArr(y);
    }

    int get(int index) {
        if (index < getArr().length) {
            return getArr()[index];
        }
        else return 0;
    }

    int getSize() {
        return getArr().length;
    }

    boolean isEmpty() {
        int x = 0;
        for (int i = 0; i < getArr().length; i++) {
            x += getArr()[i];
        }
        if (x == 0) return true;
        else return false;
    }
}
