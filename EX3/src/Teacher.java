import java.util.ArrayList;

public class Teacher extends Person implements LibraryUser {
    private int teacherId;
    private ArrayList<Book> borrowedBooks;
    private LibraryCard libraryCard;

    public Teacher(String name, int age, int cardNumber, int expirationYear) {
        super(name, age);
        this.libraryCard = new LibraryCard(this, cardNumber, expirationYear);
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book, int year) {
        if (year > libraryCard.getExpirationYear()) {
            System.out.println("Sorry, your library card has expired.");
        } else {
            System.out.println(getName() + " is borrowing the book: " + book.getTitle());
            if (borrowedBooks.size() >= libraryCard.getMaxBooks()) {
                System.out.println("Sorry, you have reached the maximum number of borrowed books allowed.");
            } else if (borrowedBooks.contains(book)) {
                System.out.println("You already have a copy of this book in your borrowed books.");
            } else {
                borrowedBooks.add(book);
                System.out.println("Book added to your borrowed books.");
            }
        }
    }

    public void returnBook(Book book, int year) {
        if (year > libraryCard.getExpirationYear()) {
            System.out.println("Sorry, your library card has expired.");
        } else {
            System.out.println(getName() + " is returning the book: " + book.getTitle());
            if (!borrowedBooks.contains(book)) {
                System.out.println("This book is not in your borrowed books.");
            } else {
                borrowedBooks.remove(book);
                System.out.println("Book returned successfully.");
            }
        }
    }

    public void displayBorrowedBooks() {
        System.out.println("Borrowed books by " + getName() + ":");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books currently borrowed.");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println("Title: " + book.getTitle() +
                        ", Author: " + book.getAuthor() +
                        ", Year of Publication: " + book.getYearOfPublication());
            }
        }
    }

    public LibraryCard getLibraryCard() {
        return libraryCard;
    }
}