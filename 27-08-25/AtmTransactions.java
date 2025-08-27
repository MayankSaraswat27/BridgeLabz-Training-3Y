import java.util.*;
public class AtmTransactions{
    public static int balanceCalculation(int arr[]){
        int deposit = 0;
        int withdrawl = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>=0){
                deposit+=arr[i];
            }
            else{
                withdrawl+=arr[i];
            }
        }
        int balance = deposit+withdrawl;
        return balance;
    }

    public static void overDraftOrNot(int x){
        if(x<0) System.out.println("OverDraft!");;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of transactions : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter all transcations : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your Total Balance : "+balanceCalculation(arr));
        overDraftOrNot(balanceCalculation(arr));
    }
}
