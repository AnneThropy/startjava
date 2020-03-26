import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		//variables
		int firstNumber, secondNumber;
		String operator, response;

		//Welcome + instructions message:
		System.out.println((char) 9971 + " Welcome to Calculator!\nHere are the operators you can use:");
		System.out.println(" '+' - to sum");
		System.out.println(" '-' - to minus");
		System.out.println(" '*' - to multiply");
		System.out.println(" '/' - to divide");
		System.out.println(" '^' - for raising to power");
		System.out.println(" '%' - to count % of");

		do {
			//getting user data
			Scanner input = new Scanner (System.in);

			System.out.println("Enter the first number");
			firstNumber = input.nextInt();

			System.out.println("Enter the operator");
			operator = input.next();

			System.out.println("Enter the second number");
			secondNumber = input.nextInt();
			input.nextLine(); //making place for nextLine to work after nextInt

			Calculator calculatorRun = new Calculator(firstNumber, operator, secondNumber);

			//calculating
			calculatorRun.run();

			// Asking to repeat
			do {
				System.out.println("Do you want to try again? Type 'Y' to try again, 'N' to exit");
				response = input.nextLine();
			} while (!response.equalsIgnoreCase("Y") && !response.equalsIgnoreCase("N"));
		} while (response.equalsIgnoreCase("Y"));
	}
}