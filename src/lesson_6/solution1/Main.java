package lesson_6.solution1;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 5, 6, 3, 8, 4};
        int[] arr2 = new int[]{3, 5, 6, 3, 8, 4};
        int[] arr3 = new int[]{3, 5, 6, 3, 8, 0, 0, 0, 0}; // размер массива 9, элементов 5
        int[] arr4 = new int[]{3, 2, 22, 11, 23, 2323};
        int[] arr5 = new int[]{3, 2, 22, 11, 23, 2323};
        int[] arr6 = new int[]{3, 2, 22, 11, 23, 2323};

        DynamicArray x1 = new DynamicArray(arr1);
        x1.removeByValue(3);

        for (int i = 0; i < x1.getArr().length; i++) {
            System.out.print(x1.getArr()[i] + " ");
        }
        System.out.println();

        DynamicArray x2 = new DynamicArray(arr2);
        x2.removeByIndex(3);
        for (int i = 0; i < x2.getArr().length; i++) {
            System.out.print(x2.getArr()[i] + " ");
        }
        System.out.println();

        DynamicArray x3 = new DynamicArray(arr3);
        x3.trim();
        for (int i = 0; i < x3.getArr().length; i++) {
            System.out.print(x3.getArr()[i] + " ");
        }
        System.out.println();

        DynamicArray x4 = new DynamicArray(arr4);
        int index = x4.get(4);
        System.out.println(index);

        DynamicArray x5 = new DynamicArray(arr5);
        int lengthOfArray = x5.getSize();
        System.out.println(lengthOfArray);

        DynamicArray x6 = new DynamicArray(arr6);
        boolean completion = x6.isEmpty();
        System.out.println(completion);
    }
}
