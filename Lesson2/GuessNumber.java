public class GuessNumber {

	private char no = 10060;
	private char down = 11015;
	private char up = 11014;
	private char win = 11088;
	private int guess;
	private String playerName;
	private int secret = (int) (1 + Math.random()*100);

	public int getSecret() {
		return secret;
	}

	public void check(int a, String b) {
		guess = a;
		playerName = b;
		//checking result
		if (guess < 1 || guess > 100) {
			System.out.println(no + " I told you from 1 to 100!!! " + no);
		} else if (guess > secret) {
			System.out.println(no + " That's too much. Try something " + down);
		} else if (guess < secret) {
			System.out.println(no + " That's too little. Try something " + up);
		} else {
			//when the guess is correct
			System.out.println(win + " That's correct! " + playerName + " won! " + win); 
		}
	}
}