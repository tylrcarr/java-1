import java.util.*;

public abstract interface PokemonInterface {
    public double height = 0;  
    public double weight = 0;  
    public int speed = 0;  
    public int attack = 0; 
    public int specialAttack = 0; 
    public int defense = 0; 
    public int specialDefense = 0; 
    public int hp = 0; 
    public ArrayList<Move> moves = new ArrayList<Move>(); 
    public ArrayList<Type> type = new ArrayList<Type>(); 
    public ArrayList<Ability> abilities = new ArrayList<Ability>();




}
