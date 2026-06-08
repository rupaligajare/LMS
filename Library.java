import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // View all books
    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            System.out.println(b);
        }
    }

    // Search book
    public Book searchBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    // Issue book
    public void issueBook(int id) {
        Book book = searchBook(id);

        if (book == null) {
            System.out.println("Book not found!");
        } else if (book.isIssued()) {
            System.out.println("Book already issued!");
        } else {
            book.issueBook();
            System.out.println("Book issued successfully!");
        }
    }

    // Return book
    public void returnBook(int id) {
        Book book = searchBook(id);

        if (book == null) {
            System.out.println("Book not found!");
        } else if (!book.isIssued()) {
            System.out.println("Book was not issued!");
        } else {
            book.returnBook();
            System.out.println("Book returned successfully!");
        }
    }
}
