import java.util.*;
public class RailwayReservationSystem {

    public static void trainOptions(int x){
        String trainName = "";
        int fare = 0;
        switch(x){
            case 1:
                trainName+="VandeBharat";
                fare = 3000;
                break;
            case 2:
                trainName+="Rajdhani";
                fare = 2000;
                break;    
            case 3:
                trainName+="Shatabdi";
                fare = 1800;
                break;
            case 4:
                trainName+="Express";
                fare = 1000;
                break;
            case 5:
                trainName+="Passanger";
                fare = 100;
                break;
            default:
                trainName+="Local";
                fare = 40;
        }
        System.out.println("Your train : "+trainName);
        System.out.println("Your train fare : "+fare);
    }

    public static int seats(int num){
        if(num==1){
            return 10;
        }
        else if(num==2){
            return 12;
        }
        else if(num==3){
            return 8;
        }
        else if(num==4){
            return 12;
        }
        else if(num==5){
            return 15;
        }
        else{
            return 20;
        }
    }

    public static boolean seatAvailability(int num){
        if(num<0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Users/Passangers : ");
        int n = sc.nextInt();
        do{
            System.out.println("Enter (1-5) for train booking (VandeBharat,Rajdhani,Shatabdi,Express,Passanger) & Any Other number for local: ");
            int num = sc.nextInt();
            int tseats = seats(num);
            if(seatAvailability(tseats)==false){
                System.out.println("Waiting - Seat not available!");
            }else{
                trainOptions(num);
            }
            n--;
        }while(n>0);    
    }
}
