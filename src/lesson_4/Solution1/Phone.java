package lesson_4.Solution1;

public class Phone {

    String number;
    String model;
    double weight;

    void receiveCall(String name, String number) {
        System.out.println("Звонит " + name);
        System.out.println("Номер телефона:  " + number);
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    String getNumber() {
        return number;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    void sendMessages(String[] numbers) {
        System.out.println("Сообщения будут отправлены на следующие номера:");
        for (String i : numbers) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        Phone p3 = new Phone();

        p1.number = "3330099";
        p1.model = "Apple";
        p1.weight = 189.3;

        p2.number = "9908798";
        p2.model = "Samsung";
        p2.weight = 210.22;

        p3.number = "3208746";
        p3.model = "Honor";
        p3.weight = 230.32;

        System.out.println("Телефон 1: " + "номер: " + p1.number + ", Модель: " + p1.model + ", вес: " + p1.weight);
        System.out.println("Телефон 2: " + "номер: " + p2.number + ", Модель: " + p2.model + ", вес: " + p2.weight);
        System.out.println("Телефон 3: " + "номер: " + p3.number + ", Модель: " + p3.model + ", вес: " + p3.weight);

        p1.receiveCall("Петр");
        p2.receiveCall("Ольга");
        p3.receiveCall("Иван");

        System.out.println(p1.getNumber());
        System.out.println(p2.getNumber());
        System.out.println(p3.getNumber());

        String[] numbers = new String[] {p1.number, p2.number, p3.number,};

        p1.sendMessages(numbers);
    }
}
