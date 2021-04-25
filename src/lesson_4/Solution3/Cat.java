package lesson_4.Solution3;

public class Cat extends Animal {

    String color;



    public Cat(String nameOfCat) {
        super("Кот", "Рыба", "Дом");
    }



    @Override
    void makeNoise() {
        System.out.println("Кошка мяукает");
    }

    @Override
    void eat() {
        System.out.println("Кошка ест рыбу");
    }
}
