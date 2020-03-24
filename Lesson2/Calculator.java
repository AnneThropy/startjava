import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		//declaring symbols
		char hint = 9971;
		char alarm = 10071;
		char calc = 9989;

		//Welcome + instructions message:
		System.out.println(hint + "Welcome to Calculator!\nHere are the operators you can use:");
		System.out.println(" '+' - to sum");
		System.out.println(" '-' - to minus");
		System.out.println(" '*' - to multiply");
		System.out.println(" '/' - to divide");
		System.out.println(" '^' - for raising to power");
		System.out.println(" '%' - to count % of");

		Scanner input = new Scanner (System.in);
		String response = "";

		do {
			//getting user data - all steps separately to avoid parcing strings we didn't learn yet
			System.out.println("Enter the first number");
			int firstNumber = input.nextInt();

			System.out.println("Enter the operator");
			String operator = input.next();

			System.out.println("Enter the second number");
			int secondNumber = input.nextInt();

			//calculating
			//showing response separately in every calculations to be able to assign different data types to the variables as well as cuatomize the message
			if (operator.equals("+")) {
				// sum here
				int result = firstNumber + secondNumber;
				System.out.println(calc + " " + firstNumber + " " + operator + " " + secondNumber + " = " + result);
			} else if (operator.equals("-")) {
				// minus here
				int result = firstNumber - secondNumber;
				System.out.println(calc + " " + firstNumber + " " + operator + " " + secondNumber + " = " + result);
			} else if (operator.equals("*")) {
				// multiply here
				int result = firstNumber * secondNumber;
				System.out.println(calc + " " + firstNumber + " " + operator + " " + secondNumber + " = " + result);
			} else if (operator.equals("/")) {
				// divide here - two options to show up nicely the result with or without deximals
				if (firstNumber % secondNumber == 0) {
					int result = firstNumber / secondNumber;
					System.out.println(calc + " " + firstNumber + " " + operator + " " + secondNumber + " = " + result);
				} else {
					double result = (double) firstNumber / secondNumber;
					System.out.println(calc + " " + firstNumber + " " + operator + " " + secondNumber + " = " + result);
				}
			} else if (operator.equals("^")) {
				// raise to power here
				long result = 1L;
				for (int i = 0; i < secondNumber; i++) {
					result *= firstNumber;
				}
				System.out.println(calc + " " + firstNumber + " " + operator + " " + secondNumber + " = " + result);
			} else if (operator.equals("%")) {
				// calculate percentage here
				double result = (secondNumber * firstNumber) / 100.0;
				System.out.println(calc + " " + firstNumber + operator + " Out of " + secondNumber + " = " + result);
			} else {
				//if operator is outside of required
				System.out.println(alarm + "Operator is not correct!");
			}

			// Asking to repeat
			input.nextLine(); //making place for nextLine to work after nextInt
			System.out.println("Do you want to try again? Type 'Y' to try again. Use any key to exit");
			response = input.nextLine();

		} while (response.equalsIgnoreCase("Y"));
	}
}