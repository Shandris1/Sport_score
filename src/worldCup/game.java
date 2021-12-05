package worldCup;

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

public class game{

    private String homeTeam;        // the name
    private String awayTeam;
    private int homeScore;       // assuming you're using double
    private int awayScore;
    
    //Create new game. Needs home side and away side defined, and starts with 0 score on both sides
    public game(String homeTeam, String awayTeam){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = 0;         // assuming negative scores are allowed
        this.awayScore = 0;
    }
    
    public void increaseHomeScore(int homeScore){
        this.homeScore += homeScore;
    }
    
    public void increaseAwayScore(int awayScore){
        this.awayScore += awayScore;
    }
    
    //returns score of both sides
    public int[] displayScore() {
    	int[]returnArray = new int[2];
    	returnArray[0] = homeScore;
    	returnArray[1] = awayScore;
    	return returnArray;
    	
    }
    
    //returns both sides as array of strings
    public String[] displaySides() {
    	String[] returnSides = new String[2];
    	returnSides[0] = homeTeam;
    	returnSides[1] = awayTeam;
    	return returnSides;
    }
    
    //returns combined score for ordering
    public int combinedScore() {
    	return homeScore+awayScore;
    }
    
    //Increases both scores.
    public void increaseBothScores(int homeScoreIncrease, int awayScoreIncrease) {//increases both scores
    	homeScore += homeScoreIncrease;
    	awayScore += awayScoreIncrease;
    }
    
    //Creates an output String that can be used to display output
    public String getOutputString() {
    	return(displaySides()[0]+" "+displayScore()[0])+" - "+displaySides()[1]+" "+displayScore()[1];
    }
    
  //can be used to find game by player
    public boolean getEitherPlayer(String input) { 
    	if(this.homeTeam.equals(input)|this.awayTeam.equals(input)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    	
    }
    
}