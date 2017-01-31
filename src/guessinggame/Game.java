package guessinggame;

import java.util.Random;
/**
 * Game of guessing a secret number between 1 to 20.
 * 
 * @author Kwankaew Uttama
 *
 */
public class Game {
		private int upperBound;
		private int secret;
		private String hint;
		private int count;
		/**
		 * Initialize a new game.
		 * 
		 * @param upperBound is the max value for the secret number (>1).
		 */
		public Game(int upperBound){
			this.upperBound = upperBound;
			this.secret= getRandomNumber(upperBound);
			this.hint = "I'm thinking of a number between 1 and " +upperBound+"."; 
			this.count = 0 ;
		}
		/**
		 * Create a random number between 1 and limit.
		 * 
		 * @param limit is the upper limit for random number.
		 * 
		 * @return a random number between 1 and limit.
		 */
		private int getRandomNumber(int limit){
			long seed = System.currentTimeMillis();
			Random rand = new Random(seed);
			return rand.nextInt(limit) + 1;
		}
		/**
		 * Check the number that the user input is correct or not. 
		 * 
		 * @param number is that user guess.
		 * 
		 * @return boolean that 
		 */
		public boolean guess(int number){
			if( number == this.secret ){
				this.hint = "Correct. The secret is " +this.secret+".";
				return true;
			}
			else if( number > this.secret ){
				this.hint = "Sorry, you're guess is too large.";
				
			}
			else if( number < this.secret ){
				this.hint = "Sorry, you're guess is too small.";
			}
			this.count++;
			return false;
		}
		/**
		 * Return a hint based on the most recent guess.
		 * 
		 * @return hint based on the most recent guess.
		 */
		public String getHint(){
			return this.hint;
		}
		/**
		 * set a hint based on the most recent guess.
		 * 
		 */
		public void setHint(){
			this.hint = hint;
		}
		/**
		 * count many times that user has guess.
		 * 
		 * @return times that user has guess
		 */
		public int getCount(){
			return this.count;
		}
}
