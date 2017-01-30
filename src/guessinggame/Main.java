

public class Main {
	
	/**
	 * create objects and start the game
	 */
	public static void main(String[] args){
		Game game = new Game(20);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}
}
