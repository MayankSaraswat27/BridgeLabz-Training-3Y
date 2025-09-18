abstract class User{
    String name;
    String address;
    public User(String name, String address){
        this.name = name;
        this.address = address;
    }
    abstract String getRole();
}

class Customer extends User{
    public Customer(String name, String address){
        super(name,address);
    }

    public String getRole(){
        return "Customer";
    }

    public void placeOrder(){

    }
}

class Seller extends User{
    public Seller(String name, String address){
        super(name,address);
    }

    public String getRole(){
        return "Seller";
    }

    public void placeOrder(){

    }
}

class Admin extends User{
    public Admin(String name, String address){
        super(name,address);
    }

    public String getRole(){
        return "Admin";
    }
}

interface PaymentGateway{
    void pay(double amount);
    void refund(double amount);
}

class UPIPayment implements PaymentGateway{
    String upiId;
    public UPIPayment(String upiId){
        this.upiId = upiId;
    }

    public void pay(double amount){
        System.out.println("Paid using UPI : "+amount);
    }

    public void refund(double amount){
        System.out.println("Refund to UPI: "+amount);
    }
}

class CreditCardPayment implements PaymentGateway{
    String creditCardId;
    public CreditCardPayment(String creditCardId){
        this.creditCardId = creditCardId;
    }

    public void pay(double amount){
        System.out.println("Paid using Credit Card : "+amount);
    }

    public void refund(double amount){
        System.out.println("Refund to Credit Card : "+amount);
    }
}

class WalletPayment implements PaymentGateway{
    String walletId;
    public WalletPayment(String walletId){
        this.walletId = walletId;
    }

    public void pay(double amount){
        System.out.println("Paid using Wallet : "+amount);
    }

    public void refund(double amount){
        System.out.println("Refund to Wallet : "+amount);
    }
    
}