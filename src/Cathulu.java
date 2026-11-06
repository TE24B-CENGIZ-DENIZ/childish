public class Cathulu extends Monster {

    public Cathulu() {
        super("Cathulu", 100, 100, 30);
        // IO.println( this.getname() );

        
    }

    @Override 
    public void attack(){
        IO.println(" cathulu curses you to doom which does " + dmg + " amount of dmg ");
    }

    

}
