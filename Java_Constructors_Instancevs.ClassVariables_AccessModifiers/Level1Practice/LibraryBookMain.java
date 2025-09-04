public class LibraryBookMain {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Java Programming", "James Gosling", 600, true);
        book1.display();
        book1.borrowBook();
        book1.display();
    }
}
