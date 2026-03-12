class Book {

    // Instance variables
    String title;
    String author;

    // Constructor with only title
    Book(String title) {
        this.title = title;
    }

    // Constructor with title and author
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class page89 {
    public static void main(String[] args) {

        // Book with only title
        Book book1 = new Book("Java Programming");
        book1.display();

        System.out.println();

        // Book with title and author
        Book book2 = new Book("Effective Java", "Joshua Bloch");
        book2.display();
    }
}
