package lesson_6.solution2;

public class Main {
    public static void main(String[] args) {
        Stack st = new Stack(5);
        // помещаем значения в стек
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);

        // смотрим текущий элемент стека и удаляем его
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
