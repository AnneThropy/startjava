import java.util.Scanner;

public class MyFirstGame {
	public static void main(String[] args) {
		//declaring varialbes
		char quest = 10067;
		char no = 10060;
		char down = 11015;
		char up = 11014;
		char win = 11088;

		int secret = 58;
		int guess = 0;

		//when the guess is incorrect
		do {
			Scanner response = new Scanner (System.in);
			System.out.println(quest + "  Guess the number from 1 to 100!" + quest);
			guess = response.nextInt();

			if (guess < 1 || guess > 100) {
					System.out.println(no + " I told you from 1 to 100!!! " + no);
				} else if (guess > secret) {
					System.out.println(no + " That's a but too much. Try something " + down);
				} else if (guess < secret) {
					System.out.println(no + " Almost there, just a bit " + up);
				}
		} while (guess != secret);

		//when then guess is correct
		System.out.println(win + " That's magic! You won! " + win); 
	} 
}
