package worldCup;

public class game{

    private String homeTeam;        // the name
    private String awayTeam;
    private int homeScore;       // assuming you're using double
    private int awayScore;
    
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
    public int[] displayScore() {
    	int[]returnArray = new int[2];
    	returnArray[0] = homeScore;
    	returnArray[1] = awayScore;
    	return returnArray;
    	
    }
    public String[] displaySides() {
    	String[]returnSides = new String[2];
    	returnSides[0]=homeTeam;
    	returnSides[1]=awayTeam;
    	return returnSides;
    }
    public int combinedScore() {
    	return homeScore+awayScore;
    }
    public String getOutputString() {
    	return(displaySides()[0]+" "+displayScore()[0])+" - "+displaySides()[1]+" "+displayScore()[1];
    }
    public boolean getEitherPlayer(String input) {
    	if(this.homeTeam.equals(input)|this.awayTeam.equals(input)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    	
    }
    
}