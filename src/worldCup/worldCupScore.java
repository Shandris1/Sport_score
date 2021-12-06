package worldCup;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.regex.Pattern;

/**
* <h1>World Cup</h1>
* This is the class of world cup library that holds all info
* related to an individual game, and how info about it can be extracted
* <p>
*
* @author  Anton Shefov
* @version 1.0
* @since   2021-12-04 
*/
public class worldCupScore {
	private AllGamesQueue currentlyPlayedGames = new AllGamesQueue();

	public static void main(String[] args) {
		
		game MB = new game("Mexico","Brazil"); 
		
		AllGamesQueue currentlyPlayedGames = new AllGamesQueue();
		currentlyPlayedGames.addNewGame(MB);
		
		
		currentlyPlayedGames.printAllGames();
	}

}
