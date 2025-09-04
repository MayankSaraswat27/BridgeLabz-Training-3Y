public class StudentMain {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Mayank", 8.9);
        pg.displayDetails();
        pg.setCGPA(9.2);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}
