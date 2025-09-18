public class MainBank {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Ravi", 5000);
        BankAccount acc2 = new BankAccount(102, "Sneha", 8000);

        acc1.displayDetails();
        acc2.displayDetails();

        BankAccount.getTotalAccounts();
    }
}
