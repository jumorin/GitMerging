public class TheMotivator {
	private int score; 
	
	public TheMotivator(int score) {
		super();
		this.score = score;
	}

	public void myComments() {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Not so stellar");
	}
	
	public void printScore() {
		System.out.println("Your score is " + score);
	}
	
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator(60);
		tm.printScore(); 
		tm.myComments();
		TheMotivator jm = new TheMotivator(85);
		jm.printScore(); 
		jm.myComments(); 
	}
}