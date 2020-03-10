import java.util.Scanner; //import Scanner

public class ConditionalGoblin {

	public static void main(String[] args) {
		char cave = 9968;
		char goblin = 9760;
		//Starting game
		System.out.println(cave + "  You're about to enter a dark cave protected by angry goblin");
		System.out.println("Before it lets you in, it wants to know some info about you");

		//asking the age
		Scanner responseAge = new Scanner(System.in);
		System.out.println(goblin + "  GOBLIN: How old are you?");
		int age = responseAge.nextInt();

		if (age > 20) {
			System.out.println("GOBLIN: " + age + "? Geeze, you're ancient!");
		}

		//asking sex
		Scanner responseSex = new Scanner(System.in);
		System.out.println(goblin + "  GOBLIN: Define your sex, human!");
		System.out.println("Hint: Type 'male' or 'female'");
		String sex = responseSex.nextLine();

		if (sex.equals("male")) {
			System.out.println("GOBLIN: " + sex + "? Good boy!");
		}

		if (!sex.equals("male")) {
			System.out.println(goblin + "  GOBLIN: WHAT are you?");
		}

		//asking height
		Scanner responseHeight = new Scanner(System.in);
		System.out.println(goblin + "  GOBLIN: What is your height");
		System.out.println("Hint: Type deximal value. Aka: 1.75");
		double height = responseHeight.nextDouble();

		if (height < 1.80) {
			System.out.println("GOBLIN: " + height + "? - Hm... maybe you can fit!!");
		} else {
			System.out.println("GOBLIN: " + height + "? No way you can enter!");
		}

		//asking first name letter
		Scanner responseLetter = new Scanner(System.in);
		System.out.println(goblin + "  GOBLIN: What's the first letter of your name?");
		System.out.println("Hint: Type one CAPITAL letter");
		String firstNameLetter = responseLetter.nextLine();


		if (firstNameLetter.equals("M")) {
			System.out.println("GOBLIN: Hey Mmmmm. This is a chosen name! I let you IN!");
		} else if (firstNameLetter.equals("I")) {
			System.out.println("GOBLIN: Hey Iiiiiii... I don't know this name, but I like it! You can go!");
		} else {
			System.out.println("GOBLIN: Who are you? I don't know you? Go away!");
		}
		
	}

}