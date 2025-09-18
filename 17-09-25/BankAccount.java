public class BankAccount {
    private final String accountNumber;
    private double balance;
    private final int PIN;

    public BankAccount(String accountNumber, double balance, int PIN){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.PIN = PIN;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double depositAmount){
        if(depositAmount<=0){
            System.out.println("Deposit Should be positive");
            return;
        }
        balance+=depositAmount;
        System.out.println("Deposit Amount : "+depositAmount);
        System.out.println("Balance : "+balance);
    }

    public void withdrawl(double withdrawlAmount, int pin){
        if(this.PIN!=pin){
            System.out.println("Entered Wrong PIN");
            return;
        }
        if(withdrawlAmount<=0){
            System.out.println("Amount should be positive");
            return;
        }
        if(withdrawlAmount>balance){
            System.out.println("Insufficient balance");
            return;
        }
        balance-=withdrawlAmount;
        System.out.println("Withdrawl Amount : "+withdrawlAmount);
        System.out.println("New Balance : "+balance);
    }
}
