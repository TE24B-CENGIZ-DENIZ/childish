public class Locness extends Monster {
    public Locness(){
        super("Locness monster", 15, 15, 4 );

    }

    @Override 
    public void attack(){
        IO.println("the monster couses a tsunami at your direction dealing " + dmg + " amount of damage ");
    }

}

