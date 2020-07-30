package train.oops.basics;

public class CricketScorer {
	// Instance Variables - constitute the state of an object
	private int score;

	// Behavior - all the methods that are part of the class
	// An object of this type has behavior based on the
	// methods four, six and getScore
	public void four() {
		score = score + 4;
	}

	public void six() {
		score = score + 6;
	}
	
	public void six(int add) {
		score = score + add;
	}
	
	public void six(String add) {
		//score = score + add;
	}


	public int getScore() {
		return score;
	}
	
	public CricketScorer() {
		
	}
	
	public CricketScorer(int score) {
		this.score = score;
	}

	public static void main(String[] args) {
		CricketScorer scorer = new CricketScorer();
		scorer.six();
		// State of scorer is (score => 6)
		scorer.four();
		// State of scorer is (score => 10)
		System.out.println(scorer.getScore());
		
		CricketScorer scorer2 = new CricketScorer(20);
		scorer2.six();
		System.out.println(scorer2.getScore());
		
	}
}