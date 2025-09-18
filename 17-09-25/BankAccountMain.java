import java.util.*;
public class BankAccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number : ");
        String accountNumber = sc.nextLine();
        System.out.println("Enter PIN : ");
        int PIN = sc.nextInt();
        BankAccount acc = new BankAccount(accountNumber, 200000, PIN);
        System.out.println("Account Number : "+acc.getAccountNumber());
        System.out.println("Balance : "+acc.getBalance());
        System.out.println("Enter 1 for Deposit 2 for Withdrawl: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter Deposit Amount : ");
                double amount = sc.nextDouble();
                acc.deposit(amount);
                break;
            case 2:
                System.out.println("Enter Withdrawl Amount : ");
                double amount2 = sc.nextDouble();
                System.out.println("Enter PIN : ");
                int pin = sc.nextInt();
                acc.withdrawl(amount2, pin); 
                break;
            default:
                System.out.println("Invalid Input!");   
        }
    }
}
