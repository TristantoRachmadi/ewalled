public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(1, "Naruto Shippuden", "Masashi Kishimoto", 3);
        Book book2 = new Book(2, "Fundamentals of BPM", "Prof Mahendrawathi", 2);
        library.addBook(book1);
        library.addBook(book2);

        Member member = new Member(101, "Joko widodo", 1001);
        StaffMember staff = new StaffMember(102, "Prabowo", 1002, "Pustakawan");
        library.registerMember(member);
        library.registerMember(staff);

        library.displayAvailableBooks();

        member.borrowBook(book1);
        staff.borrowBook(book1);

        library.displayAvailableBooks();

        member.returnBook(book1);
        staff.returnBook(book1);

        library.displayAvailableBooks();
    }
}
