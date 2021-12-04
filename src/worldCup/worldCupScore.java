package worldCup;
import java.util.Comparator;
import java.util.PriorityQueue;

public class worldCupScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<game> allGames = new PriorityQueue<>();
		game MB = new game("Mexico","Brazil"); 
		MB.increaseHomeScore(15);
		allGames.add(MB);
		
		
		System.out.println(allGames);
	}
	
	
	public class StringLengthComparator implements Comparator<game> {
	    @Override
	    public int compare(game x, game y) {
	        // Assume neither string is null. Real code should
	        // probably be more robust
	        // You could also just return x.length() - y.length(),
	        // which would be more efficient.
	        return x.combinedScore() - y.combinedScore(); 
	        		}
	}
	


}
