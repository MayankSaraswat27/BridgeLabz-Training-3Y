public class MainLibrary {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling", "ISBN1234");
        Book.displayLibraryName();
        b1.displayBookDetails();
    }
}
