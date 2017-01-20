
import java.util.Scanner;

public class GameConsole{
	
	/**
	 * The play method plays a game using input from a user.
	 * @param game was use by the class game
	 * @return the lastest number that user guess(the correct number)
	 */
	public int play(Game game){
		Scanner scan = new Scanner(System.in);
		System.out.println("Guessing Game");
		System.out.println("Your guess?");
		int num;
		do{
		System.out.println(game.getHint());
		num = scan.nextInt();
		}while(!game.guess(num));
		System.out.println(game.getHint());
		System.out.println("You used "+game.getCount()+" guesses.");
		return num;
	}
}

