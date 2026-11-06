public class Monster {
   private String name;
   protected int start_health= 1; 
   protected int current_health= 0;
   protected int dmg= 2;

   public Monster(String name, int start_health, int current_health, int dmg){
    this.start_health=start_health;
    this.current_health=current_health;
    this.dmg=dmg;
    this.name=name;
    

   }

   public String getname(){
    
    return name;
    }

    public int getstart_health(){
        return start_health;
        
    }
    public int getcurrent_health(){
        return current_health;
        
    }
    public  int getdmg(int dmg){
        return dmg;

    }

    public void attack(){
        IO.println("the monster attacks and does " + dmg + "  damage. ");

    }
    public void take_damage(){
        IO.println("the monster is attacked and takes " + dmg + "  damage. ");

        current_health= start_health-dmg;
        if(current_health< 0){
            current_health=0;
        } 

    }








}
