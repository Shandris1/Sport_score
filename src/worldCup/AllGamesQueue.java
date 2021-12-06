package worldCup;

import java.util.ArrayList;
import java.util.Arrays;

/**
* <h1>World Cup</h1>
* This is the class of world cup library that combines games into an array,
* sorts it adds and deletes games, and outputs it in an approporiate way
* <p>
*
* @author  Anton Shefov
* @version 1.0
* @since   2021-12-04 
*/

public class AllGamesQueue {
	private ArrayList<game> allGames = new ArrayList<game>();
	
	
	//Add new game to the array
	public boolean addNewGame(game addedGame) {
		return(allGames.add(addedGame));
	}
	
	//remove game by game
	public boolean removeGame(game gameToRemove) {
		return(allGames.remove(gameToRemove));
	}
	//Remove game by position
	public void removeByPosition(int positionToRemove) {
		try{
			allGames.remove(positionToRemove);
			}
			catch (IndexOutOfBoundsException exception) { //to prevent data loss, the out of bounds is replaced with a message
				System.out.println("There is no game with this index");
				System.out.println("Select another game to stop");
				
			}
	}
	
	//Returns a game according to its position
	public game getGameByPosition(int positionToGet) {
		return allGames.get(positionToGet);
	}
	

	//Prints all games in the of their position in DB
	public void printAllGamesPosition() {
		for(int i = 0; i < allGames.size(); i++) {
			System.out.println(i+allGames.get(i).getOutputString());
		}
	}
	
	//Prints all games in the order of highest score to lowest
	public void printAllGames() {
		ArrayList<game> tempPriorityQueue = allGames;
		int[] totalScores = new int[allGames.size()];
		ArrayList<game> returnList = new ArrayList<game>();
		for(int i = 0; i < allGames.size(); i++) {
			totalScores[i]=allGames.get(i).combinedScore();
		}
		Arrays.parallelSort(totalScores);
		for(int i = totalScores.length-1; i > -1; i-- ) {
			for(int j = tempPriorityQueue.size()-1; j> -1; j--) {
				if(totalScores[i] == tempPriorityQueue.get(j).combinedScore()) {
					returnList.add(tempPriorityQueue.get(j));
					tempPriorityQueue.remove(j);
					break;
				}else {
				}		
			}
		}
		for (int i = 0; i < returnList.size();i++) {
			System.out.println(returnList.get(i).getOutputString());
		}
	}
		
	
	//returns ArrayList of all games in the order or highest score to lowest
	public ArrayList<game> getAllGamesSortedByScore() {
		ArrayList<game> tempPriorityQueue = allGames;
		int[] totalScores = new int[allGames.size()];
		ArrayList<game> returnList = new ArrayList<game>();
		for(int i = 0; i < allGames.size(); i++) {
			totalScores[i]=allGames.get(i).combinedScore();
		}
		Arrays.parallelSort(totalScores);
		for(int i = totalScores.length-1; i > -1; i-- ) {
			for(int j = tempPriorityQueue.size()-1; j> -1; j--) {
				if(totalScores[i] == tempPriorityQueue.get(j).combinedScore()) {
					returnList.add(tempPriorityQueue.get(j));
					tempPriorityQueue.remove(j);
					break;
				}else {
				}		
			}
		}
		return(returnList);
	}
	
	
	
}




