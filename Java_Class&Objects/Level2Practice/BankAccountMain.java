public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Mayank", 12345, 10000);
        acc1.displayBalance();
        acc1.deposit(5000);
        acc1.withdraw(2000);
        acc1.displayBalance();
    }
}