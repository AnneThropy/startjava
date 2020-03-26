import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		//declaring variables
		char quest = 10067;
		String replyEnd = "";

		//getting names
		Scanner response = new Scanner (System.in);
		System.out.println(quest + " First player - What's your name?");
		String playerOneName = response.nextLine();
		System.out.println(quest + " Second player - What's your name?");
		String playerTwoName = response.nextLine();

		//setting players
		Player player = new Player("");
		Player playerOne = new Player(playerOneName);
		Player playerTwo = new Player(playerTwoName);
		//System.out.println("playerOne = " + playerOne.getName());
		//System.out.println("playerTwo = " + playerTwo.getName());

		//GAME
		do {
			int i = 1;
			GuessNumber guessNumberGame = new GuessNumber();
			//System.out.println("secret - " + guessNumberGame.getSecret());

			do {
				//selecting the player depending on the turn
				if(i % 2 != 0) {
					player = playerOne;
				} else {
					player = playerTwo;
				}
				i++;

				//player responds
				player.guess();
				//System.out.println(player.getName() + " set number = " + player.getNumber());

				//checking player's response
				guessNumberGame.check(player.getNumber(), player.getName());
			} while (player.getNumber() != guessNumberGame.getSecret());

			// Asking to repeat
			do {
				System.out.println("Do you want to try again? Type 'Y' to try again, 'N' to exit");
				replyEnd = response.nextLine();
			} while (!replyEnd.equalsIgnoreCase("Y") && !replyEnd.equalsIgnoreCase("N"));
		} while (replyEnd.equalsIgnoreCase("Y"));
	} 
}
