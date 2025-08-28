import java.util.*;
public class MusicPlaylistManager {

    public static void options(int choice, String[] songs){
        
    }

    public static void playAllSongs(String[] songs){
        System.out.println("All Songs are : ");
        for(int i = 0; i<songs.length; i++){
            System.out.print(songs[i]+" ");
        }
        System.out.println();
    }

    public static String searchASongByIndex(String[] songs, int x){
        return songs[x];
    }

    public static int searchASongByName(String[] songs, String name){
        for(int i = 0; i<songs.length; i++){
            if(songs[i].equals(name)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] songs = {"Song1", "Song2", "Song3"};
        while(true){
            System.out.println("Enter the action you want to perform (1-3):");
            System.out.println("1 - Play All Songs\n2 - Play a Song by Index(0-2)\n3 - Search a Song by name");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("You choose to play all Songs : ");
                    playAllSongs(songs);
                    break;
                case 2:
                    System.out.println("Enter Index : ");
                    int idx = sc.nextInt();
                    System.out.println(searchASongByIndex(songs,idx)); 
                    break;
                case 3:
                    System.out.println("Enter name of song : ");
                    String name = sc.next();
                    System.out.println(searchASongByName(songs,name));
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println("If you want to continue type y else n : ");
            char ch = sc.next().charAt(0);
            if(ch=='y'){
                continue;
            }
            else{
                break;
            }
        }
    }
}
