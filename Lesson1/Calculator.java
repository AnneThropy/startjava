import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		boolean proceed = false;

		char hint = 9971;
		char alarm = 10071;
		char calc = 9989;

		//Welcome + instructions message:

		System.out.println(hint + "Welcome to Calculator!\nHere are the operators you can use:\n '+' - to sum\n '-' - to minus\n '*' - to multiply\n '/' - to divide\n '^' - for raising to power\n '%' - to count % of");

		do {
			proceed = false; //clearing up the repeating variable
			//getting user data - all steps separately to avoid parcing strings we didn't learn yet
			Scanner firstNum = new Scanner (System.in);
			System.out.println("Enter the first number");
			int firstNumber = firstNum.nextInt();

			Scanner operatorValue = new Scanner (System.in);
			System.out.println("Enter the operator");
			String operator = operatorValue.next();

			Scanner secondNum = new Scanner (System.in);
			System.out.println("Enter the second number");
			int secondNumber = secondNum.nextInt();

			//calculating
			//showing response separately in every calculations to be able to assign different data types to the variables as well as cuatomize the message

			if (operator.equals("+")) {
				// sum here
				int result = firstNumber + secondNumber;
				System.out.println(calc + " " + firstNumber +" "+ operator +" "+ secondNumber + " = " + result);
			} else if (operator.equals("-")) {
				// minus here
				int result = firstNumber - secondNumber;
				System.out.println(calc + " " + firstNumber +" "+ operator +" "+ secondNumber + " = " + result);
			} else if (operator.equals("*")) {
				// multiply here
				int result = firstNumber * secondNumber;
				System.out.println(calc + " " + firstNumber +" "+ operator +" "+ secondNumber + " = " + result);
			} else if (operator.equals("/")) {
				// divide here - two options to show up nicely the result with or without deximals
				if (firstNumber % secondNumber == 0) {
					int result = firstNumber / secondNumber;
					System.out.println(calc + " " + firstNumber +" "+ operator +" "+ secondNumber + " = " + result);
				} else {
					double result = (double) firstNumber / secondNumber;
					System.out.println(calc + " " + firstNumber +" "+ operator +" "+ secondNumber + " = " + result);
				}
			} else if (operator.equals("^")) {
				// raise to power here
				long result = 1L;
				for (int i = 1; i <= secondNumber; i++) {
					result = result * firstNumber;
				}
				System.out.println(calc + " " + firstNumber +" "+ operator +" "+ secondNumber + " = " + result);
			} else if (operator.equals("%")) {
				// calculate percentage here
				double result = (secondNumber * firstNumber) / 100.0;
				System.out.println(calc + " " + firstNumber + operator + " Out of " + secondNumber + " = " + result);
			} else {
				//if operator is outside of required
				System.out.println(alarm + "Operator is not correct!");
			}

			// Asking to repeat
			Scanner askToProceed = new Scanner (System.in);
			System.out.println("Do you want to try again? Type 'Y' to try again. Use any key to exit");
			String response = askToProceed.nextLine();

			if (response.equalsIgnoreCase("Y")) {
				proceed = true;
			}

		} while (proceed == true);
	}
}