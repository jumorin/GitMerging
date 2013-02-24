public class TheMotivator {
	private int score; 
	public String name; 
	
	public TheMotivator(int score, String name) {
		super();
		this.score = score;
		this.name = name; 
	}

	public void myComments() {
		if (score == 100)
			System.out.println("Perfect Score!");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Not so stellar");
		
		System.out.println("");
	}
	
	public void printScore() {
		System.out.println(name + ": Your score is " + score);
	}
	
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator(60, "Tim");
		tm.printScore(); 
		tm.myComments();
		TheMotivator jm = new TheMotivator(85, "Jim");
		jm.printScore(); 
		jm.myComments(); 
	}
}