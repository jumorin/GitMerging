public class TheMotivator {
	public void myComments(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Not so stellar");
	}
	
	public void printScore(int score) {
		System.out.println("Your score is " + score);
	}
	
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.printScore(60); 
		tm.myComments(60);
	}
}