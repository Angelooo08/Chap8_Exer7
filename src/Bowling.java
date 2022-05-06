import java.util.Random;

public class Bowling {
    private int player;
    private int score;
    private int frame = 1;
    



    public Bowling(int player){
        
        this.player = player;
    
    }

    public int getPlayer(){
        return player;
    }

    public int getScore(){
        return score;
    }
    
    public int randomNum(int max){
        int knockedPins = (int)Math.floor(Math.random()*(max-0+1)+0);
        return knockedPins;
    }

    public void scoreCard(int player, int frame, int pinsKnocked, int score){
        System.out.println("Player: "  + player +" Frame: " + frame + " Knocked Pins: " + pinsKnocked + " Score: " + score);

    }

    public void play() throws InterruptedException {
        
        int try1 = randomNum(10);
         if ( try1 == 10 ){
             this.score = 20;
             scoreCard(getPlayer(), this.frame, 10, getScore());
             Thread.sleep(1000);
         }
         else{
            int remainingPins = 10 - try1;
            int try2 = randomNum(remainingPins);
             int totalKockedPins = try1 + try2;

            if ( totalKockedPins == 10 ){
                this.score = 15;
                scoreCard(getPlayer(), this.frame, 10, getScore());
                Thread.sleep(1000);
            
            }
            else
            {
                this.score = totalKockedPins;
                scoreCard(getPlayer(), this.frame, totalKockedPins, getScore());
                Thread.sleep(1000);

            }
             

         }
        this.frame++;
    }

    }
    

