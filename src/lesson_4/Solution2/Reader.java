package lesson_4.Solution2;

public class Reader {
    String name;
    String numberLibraryTicket;
    String faculty;
    String dateOfBirth;
    String phone;

    public Reader(String name, String numberLibraryTicket, String faculty, String dateOfBirth, String phone){
        this.name = name;
        this.numberLibraryTicket = numberLibraryTicket;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    void takeBook(int count) {
        System.out.println(name + " взял " + count + " книг");
    }

    void takeBook(String nameBooks) {
        System.out.println(name + " взял книги: " + nameBooks);
    }

    void takeBook(String nameBook1, String nameBook2) {
        System.out.println(name + " взял книги: " + nameBook1 + ", " + nameBook2);
    }

    void takeBook(Book bookName1) {
        System.out.println(name + " взял книги: " + bookName1);
    }

    void takeBook(Book bookName1, Book bookName2) {
        System.out.println(name + " взял книги: " + bookName1 + ", " + bookName2);
    }

    void returnBook(int count) {
        System.out.println(name + " вернул " + count + " книг");
    }

    void returnBook(String nameBooks) {
        System.out.println(name + " вернул книги: " + nameBooks);
    }

    void returnBook(String nameBook1, String nameBook2) {
        System.out.println(name + " вернул книги: " + nameBook1 + ", " + nameBook2);
    }

    void returnBook(Book bookName1) {
        System.out.println(name + " вернул книги: " + bookName1);
    }

    void returnBook(Book bookName1, Book bookName2) {
        System.out.println(name + " вернул книги: " + bookName1 + ", " + bookName2);
    }

    public static void main(String[] args) {
        Reader student_1 = new Reader("Петров И.И.", "100", "Экономический", "10.03.1998", "99999999");
        Reader student_2 = new Reader("Сидоров А.В.", "120", "Физический", "11.02.1996", "888888888");
        Reader student_3 = new Reader("Иванов А.П.", "110", "Математический", "22.06.1993", "33333333");

        Reader[] students = new Reader[] {student_1, student_2, student_3};

        student_1.takeBook(5);
        student_2.takeBook("Приключения");
        student_3.takeBook("Астрономия", "Геология");

        Book book1 = new Book("Приключения", "Марк Твен");
        Book book2 = new Book("Астрономия", "Стивен Хокинг");
        Book book3 = new Book("Геология", "Роберт Хейзен");

        student_2.takeBook(book1.bookName);
        student_3.takeBook(book2.bookName, book3.bookName);

        student_1.returnBook(5);
        student_2.returnBook("Приключения");
        student_3.returnBook("Астрономия", "Геология");

        student_2.returnBook(book1.bookName);
        student_3.returnBook(book2.bookName, book3.bookName);

    }
}
