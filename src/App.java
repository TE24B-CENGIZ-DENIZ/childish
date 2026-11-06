import java.util.Random;

public class App {
    public void main() {
        int player_dmg= 3;


        Random random = new Random();

        int one_or_zero = random.nextInt(2);
        

        Cathulu monster1 = new Cathulu();
        

        Locness monster2 = new Locness();

        

        if (one_or_zero == 1){
            IO.println(" you encounter a Cathulu." );
            monster1.attack();
            playerattack(player_dmg);
            IO.println("the monster's health drops from " + monster1.current_health + " to " + (monster1.current_health-player_dmg) );




        }
        else{

            IO.println(" you encounter a locness monster." );
            monster2.attack();
            playerattack(player_dmg);
            IO.println("the monster's health drops from " + monster2.current_health + " to " + (monster2.current_health-player_dmg) );

        }

     
        
        
        
    }

    public void playerattack(int dmg){
       IO.println("you attack the monseter dealing " + dmg + " sdmg to it's health ");
            
    }

    

}
