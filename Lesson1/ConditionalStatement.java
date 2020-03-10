public class ConditionalStatement {

	public static void main(String[] args) {
		//declaring variables
		int age = 21;
		// boolean sex = true; (for future input tries)
		double heigh = 1.79;
		String sex = "male";
		String firstNameLetter = "A";


		if (age >20) {
			System.out.println(age+"? Geeze, you're ancient!");
		}

		if (sex == "male") {
			System.out.println(sex+"? Good boy!");
		}

		if (sex != "male") {
			System.out.println("Good girl!");
		}

		if (heigh < 1.80) {
			System.out.println(heigh+" - You're allowed into this cave!");
		} else {
			System.out.println(heigh+"? No way you can enter!");
		}

		if (firstNameLetter == "M") {
			System.out.println("Hey Mmmmm");
		} else if (firstNameLetter == "I") {
			System.out.println("Hey Iiiiiii");
		} else {
			System.out.println("Who are you?");
		}
	}
}