public class MainStudent {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rohit", "A");
        Student s2 = new Student(102, "Priya", "B");

        s1.displayStudentDetails();
        s2.displayStudentDetails();

        Student.displayTotalStudents();
    }
}
