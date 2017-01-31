package guessinggame;

import java.util.Scanner;

/**
 * Console of Game
 * 
 * @author Kwankaew Uttama
 *
 */

public class GameConsole{
	
	/**
	 * The play method plays a game using input from a user.
	 * 
	 * @param game was use by the class game
	 * 
	 * @return the lastest number that user guess(the correct number)
	 */
	public int play(Game game){
		Scanner scan = new Scanner(System.in);
		System.out.println("Guessing Game");
		int number;
		do{
			System.out.println(game.getHint());
			System.out.println("Your guess?");
			number = scan.nextInt();
		}while(!game.guess(number));
		System.out.println(game.getHint());
		System.out.println("You used "+game.getCount()+" guesses.");
		return number;
	}
}

