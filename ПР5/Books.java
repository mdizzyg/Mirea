package ПР6;

// Интерфейс Books
public interface Books {
    void print();
}

// Класс Author, реализующий интерфейс Books
class Author implements Books {
    private String title;
    private String author;
    private int year;

    public Author(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of Publication: " + year);
    }
}

// Главный класс
 class Test_Main {
    public static void main(String[] args) {
        Books book = new Author("1984", "George Orwell", 1949);
        book.print();
    }
}