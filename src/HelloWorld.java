import skilstak.c;
import java.util.*;
public class HelloWorld {
   public static void main(String[] args) {
    System.out.println(c.cl + c.y + "but do banana exist\n" + c.b + "answer the question\n" + c.x); 
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    while(true){
        if(name.equalsIgnoreCase("yes") || name.equalsIgnoreCase("y")){
         System.out.println(c.m + "No." + c.x);
         break;
        } else if(name.equalsIgnoreCase("no") || name.equalsIgnoreCase("n"));{
         System.out.println(c.y + "Correct." + c.x);
         break;
        }
    }
   }
}
