public class BankMain {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(1001, "Mayank", 5000);
        acc.displayDetails();
        acc.deposit(2000);
        acc.withdraw(1500);
        System.out.println("Updated Balance: " + acc.getBalance());
    }
}
