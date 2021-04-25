package lesson_4.Solution3;

public class Main {
    public static void main(String[] args) {
        Veterinarian priem = new Veterinarian();
        Horse horse = new Horse("Лошадь");
        Cat cat = new Cat("Кот");
        Dog dog = new Dog("Собака");

        Animal[] animals = new Animal[] {horse, cat, dog};

        for (Animal i : animals) {
            priem.treatAnimal(i);
        }
    }
}
