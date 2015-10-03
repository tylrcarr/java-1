import java.util.*;

final public class Charizard implements PokemonInterface {

    public double height = 1.70;  
    public double weight = 90.5;  
    public int speed = 100;  
    public int attack = 84; 
    public int specialAttack = 109; 
    public int defense =78; 
    public int specialDefense = 85; 
    public int hp = 78; 
    public ArrayList<Move> moves = new ArrayList<Move>(); 
        public Charizard() {
            Growl growl = new Growl();
            //move.add(new Scratch());
            //move.add(new Ember());
            moves.add(new Growl());
            //move.add(new Leer());
    }
    //public ArrayList<Type> type = new ArrayList<Type>(); 
    //public ArrayList<Ability> abilities = new ArrayList<Ability>();






}
