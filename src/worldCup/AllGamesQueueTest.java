package worldCup;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AllGamesQueueTest {

	@Test
	void AddGameToQueuetest() {
		AllGamesQueue currentlyPlayedGames = new AllGamesQueue();
		currentlyPlayedGames.addNewGame(new game("Russia","China"));
		currentlyPlayedGames.addNewGame(new game("Ghana","Portigal"));
		currentlyPlayedGames.addNewGame(new game("Spain","USA"));
		currentlyPlayedGames.addNewGame(new game("Phillipines","UK"));
		currentlyPlayedGames.addNewGame(new game("India","Canada"));
		currentlyPlayedGames.getGameByPosition(0).increaseHomeScore(5);
		currentlyPlayedGames.getGameByPosition(3).increaseHomeScore(3);
		ArrayList<game> OrderedGames = currentlyPlayedGames.getAllGamesSortedByScore();
		assertTrue(OrderedGames.get(0).getOutputString().equalsIgnoreCase("Russia 5 - China 0"));
		assertTrue(OrderedGames.get(1).getOutputString().equalsIgnoreCase("Phillipines 3 - UK 0"));

	}
	
	@Test
	void SortGamestest() {
		AllGamesQueue currentlyPlayedGames = new AllGamesQueue();
		currentlyPlayedGames.addNewGame(new game("Russia","China"));
		currentlyPlayedGames.addNewGame(new game("Ghana","Portigal"));
		currentlyPlayedGames.addNewGame(new game("Spain","USA"));
		currentlyPlayedGames.addNewGame(new game("Phillipines","UK"));
		currentlyPlayedGames.addNewGame(new game("India","Canada"));
		currentlyPlayedGames.getGameByPosition(1).increaseHomeScore(5);
		currentlyPlayedGames.getGameByPosition(3).increaseHomeScore(3);
		ArrayList<game> OrderedGames = currentlyPlayedGames.getAllGamesSortedByScore();
		
		assertTrue(OrderedGames.get(0).getOutputString().equalsIgnoreCase("Ghana 5 - Portigal 0"));

	}
	
	@Test
	void SortMoreGamesTest() {
		AllGamesQueue currentlyPlayedGames = new AllGamesQueue();
		currentlyPlayedGames.addNewGame(new game("Russia","China"));
		currentlyPlayedGames.addNewGame(new game("Ghana","Portigal"));
		currentlyPlayedGames.addNewGame(new game("Spain","USA"));
		currentlyPlayedGames.addNewGame(new game("Phillipines","UK"));
		currentlyPlayedGames.addNewGame(new game("India","Canada"));
		currentlyPlayedGames.getGameByPosition(1).increaseHomeScore(5);
		currentlyPlayedGames.getGameByPosition(0).increaseHomeScore(5);
		currentlyPlayedGames.getGameByPosition(2).increaseAwayScore(5);
		currentlyPlayedGames.getGameByPosition(3).increaseHomeScore(3);
		ArrayList<game> OrderedGames = currentlyPlayedGames.getAllGamesSortedByScore();
		assertTrue(OrderedGames.get(0).getOutputString().equalsIgnoreCase("Spain 0 - USA 5"));

	}
	
	
	@Test
	void removeGamesTest() {
		AllGamesQueue currentlyPlayedGames = new AllGamesQueue();
		currentlyPlayedGames.addNewGame(new game("Russia","China"));
		currentlyPlayedGames.addNewGame(new game("Ghana","Portigal"));
		currentlyPlayedGames.addNewGame(new game("Spain","USA"));
		currentlyPlayedGames.addNewGame(new game("Phillipines","UK"));
		currentlyPlayedGames.addNewGame(new game("India","Canada"));
		currentlyPlayedGames.getGameByPosition(1).increaseHomeScore(5);
		currentlyPlayedGames.getGameByPosition(0).increaseHomeScore(5);
		currentlyPlayedGames.getGameByPosition(2).increaseAwayScore(5);
		currentlyPlayedGames.getGameByPosition(3).increaseHomeScore(3);
		currentlyPlayedGames.removeByPosition(1);
		ArrayList<game> OrderedGames = currentlyPlayedGames.getAllGamesSortedByScore();
		assertTrue(OrderedGames.get(0).getOutputString().equalsIgnoreCase("Spain 0 - USA 5"));
		

	}
	
	@Test
	void removeMoreGamesTest() {
		AllGamesQueue currentlyPlayedGames = new AllGamesQueue();
		currentlyPlayedGames.addNewGame(new game("Russia","China"));
		currentlyPlayedGames.addNewGame(new game("Ghana","Portigal"));
		currentlyPlayedGames.addNewGame(new game("Spain","USA"));
		currentlyPlayedGames.addNewGame(new game("Phillipines","UK"));
		currentlyPlayedGames.addNewGame(new game("India","Canada"));
		currentlyPlayedGames.getGameByPosition(0).increaseHomeScore(1);
		currentlyPlayedGames.getGameByPosition(0).increaseAwayScore(8);
		currentlyPlayedGames.getGameByPosition(1).increaseHomeScore(5);
		currentlyPlayedGames.getGameByPosition(1).increaseAwayScore(5);
		currentlyPlayedGames.getGameByPosition(2).increaseHomeScore(2);
		currentlyPlayedGames.getGameByPosition(2).increaseAwayScore(7);
		currentlyPlayedGames.getGameByPosition(3).increaseHomeScore(10);
		currentlyPlayedGames.getGameByPosition(3).increaseAwayScore(0);
		currentlyPlayedGames.getGameByPosition(4).increaseHomeScore(3);
		currentlyPlayedGames.getGameByPosition(4).increaseAwayScore(7);
		currentlyPlayedGames.removeByPosition(1);
		ArrayList<game> OrderedGames = currentlyPlayedGames.getAllGamesSortedByScore();
		assertTrue(OrderedGames.get(0).getOutputString().equalsIgnoreCase("India 3 - Canada 7"));
		assertTrue(OrderedGames.get(0).getOutputString().equalsIgnoreCase("India 3 - Canada 7"));

		

	}
	
	@Test
	void removeNonexistantGameTest() {
		AllGamesQueue currentlyPlayedGames = new AllGamesQueue();
		currentlyPlayedGames.addNewGame(new game("India","Canada"));
		currentlyPlayedGames.getGameByPosition(0).increaseHomeScore(1);
		currentlyPlayedGames.getGameByPosition(0).increaseAwayScore(8);
		currentlyPlayedGames.removeByPosition(1);
		ArrayList<game> OrderedGames = currentlyPlayedGames.getAllGamesSortedByScore();
		assertTrue(OrderedGames.get(0).getOutputString().equalsIgnoreCase("India 1 - Canada 8"));
	}
	
	@Test
	void printZeroGamesTest() {
		AllGamesQueue currentlyPlayedGames = new AllGamesQueue();
		ArrayList<game> OrderedGames = currentlyPlayedGames.getAllGamesSortedByScore();
		assertTrue(OrderedGames.isEmpty());
	}
	
	@Test
	void increaseNonexistantScore() {
		AllGamesQueue currentlyPlayedGames = new AllGamesQueue();
		currentlyPlayedGames.addNewGame(new game("India","Canada"));
		currentlyPlayedGames.getGameByPosition(1).increaseHomeScore(1);
		currentlyPlayedGames.getGameByPosition(1).increaseAwayScore(8);
		currentlyPlayedGames.removeByPosition(1);
		ArrayList<game> OrderedGames = currentlyPlayedGames.getAllGamesSortedByScore();
		assertTrue(OrderedGames.get(0).getOutputString().equalsIgnoreCase("India 0 - Canada 0"));
	}


}
