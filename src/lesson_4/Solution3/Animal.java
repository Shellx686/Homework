package lesson_4.Solution3;

public class Animal {

    // Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.

    String food;
    String location;
    String name;


    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }

    void makeNoise() {
        System.out.println("Животное издает звук");
    }

    void eat() {
        System.out.println("Животное ест");
    }

    void sleep() {
        System.out.println("Животное спит");
    }

    public static void main(String[] args) {

    }


}
