package lesson_4.Solution3;

//Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
// Пусть этот метод распечатывает food и location пришедшего на прием животного

import java.sql.SQLOutput;

public class Veterinarian {
    void treatAnimal(Animal animal) {
        System.out.println(animal.name + " ест: " + animal.food + ", место обитания: " + animal.location);
    }
}
