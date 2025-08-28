import java.util.*;
public class OnlineShoppingCartSystem {

    public static int product(Scanner sc){
        int price = 0;
        System.out.println("Enter (1-3) for choosing product (Shirt,Shoes,Food) : ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                price = 1000;
                System.out.println("You want to buy Shirt, Its price is : "+price);
                break;
            case 2:
                price = 5000;
                System.out.println("You want to buy Shoes, Its price is : "+price);
                break;
            case 3:
                price = 500;
                System.out.println("You want to buy Food, Its price is : "+price);
                break;
            default:
                price = 0;
                System.out.println("Invalid number");
        }
        return price;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of customers : ");
        int n = sc.nextInt();
        while(n>0){
            boolean flag = true;
            do{
                float totalAmount = 0;
                System.out.println("How many products You want to buy : ");
                int num = sc.nextInt();
                for(int i = 1; i<=num; i++){
                    int product = product(sc);
                    totalAmount+=product;
                }
                if(totalAmount>5000){
                    totalAmount = totalAmount*0.95f;
                    System.out.println("You will get 5% discount!");
                    System.out.println("Your Total Amount is : "+totalAmount);
                }
                else{
                    System.out.println("Your Total Amount is : "+totalAmount);
                }
                if(num>=1){
                    flag = false;
                }
            }while(flag);
            n--;
        }
    }
}
