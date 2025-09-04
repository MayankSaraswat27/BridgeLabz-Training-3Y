public class EmployeeMain {
    public static void main(String[] args) {
        Manager mgr = new Manager(2001, "HR", 40000);
        mgr.displayDetails();
        mgr.setSalary(45000);
        System.out.println("Updated Salary: " + mgr.getSalary());
    }
}
