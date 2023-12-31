import java.util.ArrayList;

public class Library {
    private ArrayList<Book> inventory;

    public Library() {
        inventory = new ArrayList<>(100);
    }

    public void addBook(Book book) {
        if (inventory.contains(book)) {
            System.out.println("This book is already in the library's inventory.");
        } else {
            if (inventory.size() >= 100) {
                System.out.println("Sorry, the library is currently full. Cannot add more books.");
            } else {
                inventory.add(book);
                System.out.println("Book added to the library.");
            }
        }
    }

    public void removeBook(Book book) {
        if (inventory.isEmpty()) {
            System.out.println("The library is currently empty.");
        } else {
            if (inventory.remove(book)) {
                System.out.println("Book removed from the library.");
            } else {
                System.out.println("The specified book is not in the library's inventory.");
            }
        }
    }

    public void listBooks() {
        if (inventory.isEmpty()) {
            System.out.println("The library is currently empty. No books to display.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : inventory) {
                System.out.println("Title: " + book.getTitle() +
                        ", Author: " + book.getAuthor() +
                        ", Year of Publication: " + book.getYearOfPublication());
            }
        }
    }
}