package worldCup;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class gameTest {
	private game game1 = new game("Mexico","Brazil");
	private game game2 = new game("Russia","China"); 
	
	
	@BeforeEach
	public void init() {
		}
	
	@Test
	void testGame() {
		assertTrue(game1.displaySides()[0].equals("Mexico"));
		assertTrue(game1.displaySides()[1].equals("Brazil"));
	}

	@Test
	void testIncreaseHomeScore() {
		assertTrue(game1.displayScore()[0]==0);
		game1.increaseHomeScore(1);
		assertTrue(game1.displayScore()[0]==1);
	}

	@Test
	void testIncreaseAwayScore() {
		assertTrue(game1.displayScore()[1]==0);
		game1.increaseAwayScore(1);
		assertTrue(game1.displayScore()[1]==1);
	}

	@Test
	void testDisplayScore() {
		assertTrue(game1.displayScore()[1]==0);
	}

	@Test
	void testDisplaySides() {
		assertTrue(game1.displaySides()[0].equals("Mexico"));
	}

	@Test
	void testCombinedScore() {
		assertTrue(game1.combinedScore()==0);
		game1.increaseHomeScore(1);
		assertTrue(game1.combinedScore()==1);
		game1.increaseAwayScore(1);
		assertTrue(game1.combinedScore()==2);
	}

}
