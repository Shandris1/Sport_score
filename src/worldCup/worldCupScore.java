package worldCup;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.regex.Pattern;

public class worldCupScore {
	private AllGamesQueue currentlyPlayedGames = new AllGamesQueue();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		game MB = new game("Mexico","Brazil"); 
		
		AllGamesQueue currentlyPlayedGames = new AllGamesQueue();
		
		
		System.out.println(currentlyPlayedGames);
	}
	public void addGame(String newGame){
		String[] newGames = new String[2]; 
		newGames = newGame.split(",",2);
		currentlyPlayedGames.addNewGame(new game(newGames[0],newGames[1]));
		System.out.println(currentlyPlayedGames.getAllGames());
	}
	

}
