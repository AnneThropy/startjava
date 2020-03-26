import java.util.Scanner;

public class Player {

	private char flag = 9971;
	private String name;
	private int number;
	private Scanner response = new Scanner (System.in);

	public Player(String a) {
		name = a;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public void guess() {
		System.out.println(flag + " Player " + name + ": Your turn! Guess the number from 1 to 100!");
		number = response.nextInt();
	}
}