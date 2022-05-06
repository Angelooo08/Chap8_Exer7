import java.util.*;

public class App {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        
int numOfPlayers = 0;


ArrayList<Bowling> playerlist = new ArrayList<>();

System.out.println("Enter Number Of Players: ");
numOfPlayers = sc.nextInt();
for(int j = 0; j < numOfPlayers; j++){
    playerlist.add(new Bowling(j + 1));

}
for(int i = 0; i < 10; i++){
    playerlist.forEach((n) -> {try {
        n.play();
    } catch (InterruptedException e) {
        
        e.printStackTrace();
    }});
}

sc.close();
        
    }
      }



