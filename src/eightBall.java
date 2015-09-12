import skilstak.c;
import java.util.*;
public class eightBall {
   
   private static String[] list = {"Yes.","No.","Maybe."};

   public static final void main(String[] args) {
    System.out.println(c.rc() + "Welcome to the Magic Eight Ball!\n" + c.x + c.rc() + "Enter your question here:\n");
    while(true) {
     String question = input("-->" + c.rc());
     if(question.equalsIgnoreCase("end")){
        break;  
     }
     if(question.equalsIgnoreCase("do bananas exist")){
        System.out.println("no they dont");
        break;
     }
     System.out.println(choice(list));
    }
   }
   
   private static final String choice(String[] list) { 
    int index = (int)(Math.random()*list.length);
    return list[index];
   
   }
   private static final String input(String prompt) {
    System.out.print(prompt);
    Scanner scanner = new Scanner(System.in);
    String answer = scanner.nextLine();
    return answer;
   }

}


