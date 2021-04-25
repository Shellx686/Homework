package lesson_4.Solution3;

public class Horse extends Animal {

    boolean horseshoe;

    public Horse(String nameOfHorse) {
        super("Лошадь", "Овес", "Поле");
    }

    @Override
    void makeNoise() {
        System.out.println("Лошадь фыркает");
    }

    @Override
    void eat() {
        System.out.println("Лошадь ест овёс");
    }
}
