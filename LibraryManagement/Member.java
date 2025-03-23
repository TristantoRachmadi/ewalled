import java.util.ArrayList;
import java.util.List;

class Member extends Person implements Borrowable {
    private int memberId;
    private List<Book> borrowedBooks;

    public Member(int id, String name, int memberId) {
        super(id, name);
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (book.borrowBook()) {
            borrowedBooks.add(book);
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnBook();
            System.out.println(name + " returned " + book.getTitle());
        } else {
            System.out.println(name + " did not borrow this book.");
        }
    }

    public void displayInfo() {
        System.out.println("Member ID: " + memberId + ", Name: " + name);
    }
}
