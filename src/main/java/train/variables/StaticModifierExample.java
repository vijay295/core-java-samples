package train.variables;

class CricketerTest {
	
	//static
	public static int totalScore;
	
	//Instance Variable
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		totalScore = totalScore+score;
		staticMethod();
		this.score = score;
	}
	
	public static void staticMethod() {
		totalScore = 90;
	}
	
}

public class StaticModifierExample {
	
	public static void main(String args[]) {
		CricketerTest ground1 = new CricketerTest();
		ground1.setScore(100);
		System.out.println(ground1.getScore());
		
		CricketerTest ground2 = new CricketerTest();
		ground2.setScore(250);
		System.out.println(ground2.getScore());
		//System.out.println(ground2.totalScore);
		
		System.out.println(CricketerTest.totalScore);
	}

}
