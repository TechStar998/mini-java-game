package beginnerjava;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String[] choices = {"Rock", "Paper", "Scissors"};
	System.out.print("Enter 0 for rock, 1 for paper, 2 for scissors : ");
    int userchoices = scanner.nextInt();
    if(userchoices<0 || userchoices>2) {
    	System.out.println("Invalid Choice");
    	return;
    }
    int computerChoice=(int)(Math.random()*3);//Math.random()*n gives values 0 to n-1//
    System.out.println("Computer choice: "+ choices[computerChoice]);
    if(userchoices==computerChoice) {
    	System.out.println("Draw");
    }
    else if((userchoices==1 && computerChoice==0)||
    		(userchoices==2 && computerChoice==1)||
    		(userchoices==0 && computerChoice==2)){
    	System.out.println("You Win!");
    }
    else {
    	System.out.println("Better luck next time!");
    }
    
    
    
    
	}
}
