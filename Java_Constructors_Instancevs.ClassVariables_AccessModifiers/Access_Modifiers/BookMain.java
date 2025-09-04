public class BookMain {
    public static void main(String[] args) {
        EBook ebook = new EBook("978-12345", "Java Basics", "James Gosling");
        ebook.displayDetails();
        ebook.setAuthor("Updated Author");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
