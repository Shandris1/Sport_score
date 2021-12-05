package worldCup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.function.Predicate;

public class AllGamesQueue {
	private ArrayList<game> allGames = new ArrayList<game>();
	
	
	
	public boolean addNewGame(game addedGame) {
		return(allGames.add(addedGame));
	}
	public boolean removeGame(game gameToRemove) {
		return(allGames.remove(gameToRemove));
	}
	public void removeByPosition(int positionToRemove) {
		allGames.remove(positionToRemove);
	}
	
	public game getGameByPosition(int positionToGet) {
		return allGames.get(positionToGet);
	}
	
	public void printAllGames() {
		ArrayList<game> tempPriorityQueue = allGames;
		int[] totalScores = new int[allGames.size()];
		for(int i = 0; i < allGames.size(); i++) {
			totalScores[i]=allGames.get(i).combinedScore();
		}
		
		for(int i = 0; i < allGames.size(); i++) {
			totalScores[i]=allGames.get(i).combinedScore();
		}
	}
		
	public ArrayList<game> getAllGames() {
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
		
		
//		for(int i = 0; i < allGames.size(); i++) {
//			totalScores[i]=allGames.get(i).combinedScore();
//			System.out.println(totalScores[i]);
//		}

		
		//System.out.println(tempPriorityQueue.get(0).getOutputString());
//		int[] totalScores = new int[allGames.size()];
//		for(int i = 0; i < allGames.size(); i++) {
//			totalScores[i]=allGames.get(i).combinedScore();
//		}
//		int[] totalScoresUnsorted = totalScores;
//		Arrays.parallelSort(totalScores);
//		game[] returnArray = new game[allGames.size()];
//		int j = 0;
//		for(int i = allGames.size(); i <-1; i-- ) {
//			int intToreturn = Arrays.asList(totalScoresUnsorted).lastIndexOf(totalScores[i]);
//			returnArray[j] = tempPriorityQueue.get(intToreturn);
//			totalScoresUnsorted.
//		}
//		
//		for (int i = 0; i < returnList.size();i++) {
//			System.out.println("returnList = "+ returnList.get(i).getOutputString());
//		}

		return(returnList);
		
		
	}
	
	
	
}




