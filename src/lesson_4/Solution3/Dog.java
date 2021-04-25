package lesson_4.Solution3;

public class Dog extends Animal {

    String breed;


    public Dog(String nameOfDog) {
        super("Собака", "Мясо", "Будка");
    }

    @Override
    void makeNoise() {
        System.out.println("Собака лает");
    }

    @Override
    void eat() {
        System.out.println("Собака грызет кость");
    }
}
