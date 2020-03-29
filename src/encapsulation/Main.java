package encapsulation;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EnhancedPlayer enhancedPlayer= new EnhancedPlayer("Tim",scanner.nextInt(), "Sword");
		System.out.println("Initial health is "+enhancedPlayer.getHealth());
		 
	}

}
