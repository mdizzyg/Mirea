package ПР6;

public interface Printable {
    void print();
}
// Класс Book, реализующий Printable
class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("This is a book: " + title);
    }
}

// Класс Magazine, реализующий Printable
 class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("This is a magazine: " + title);
    }
}

// Основной класс с методом main
 class Main {
    public static void main(String[] args) {
        // Создаем массив типа Printable с объектами Book и Magazine
        Printable[] items = new Printable[]{
                new Book("Java Programming"),
                new Magazine("Tech Monthly"),
                new Book("Effective Java"),
                new Magazine("Science Weekly")
        };

        // Проходим по массиву и вызываем print() для каждого объекта
        for (Printable item : items) {
            item.print();
        }
    }
}
