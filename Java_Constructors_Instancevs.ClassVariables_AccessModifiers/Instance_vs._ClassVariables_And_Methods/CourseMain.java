public class CourseMain {
    public static void main(String[] args) {
        Course c1 = new Course("Java", 3, 5000);
        Course c2 = new Course("Python", 2, 4000);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("G.L.A UNIVERSITY");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
