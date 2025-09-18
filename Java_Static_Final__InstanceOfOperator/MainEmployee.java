public class MainEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Aman", "Developer");
        Employee e2 = new Employee(2, "Neha", "Tester");

        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();

        Employee.displayTotalEmployees();
    }
}
