import java.util.Scanner;

public class Calculator {

	//declaring variables
	private int firstNumber, secondNumber, result;
	private double resultDouble;
	private long resultLong = 1L;
	private String operator;
	private char alarm = 10071;
	private char calc = 9989;

	public Calculator(int a, String b, int c) {
		firstNumber = a;
		operator = b;
		secondNumber = c;
	}

	public void run() {
		//calculating
		switch (operator.toLowerCase()) {

			// sum here
			case "+":
				result = firstNumber + secondNumber;
				System.out.println(calc + " " + firstNumber + " " + operator + " " + secondNumber + " = " + result);
				break;

			// minus here
			case "-":
				result = firstNumber - secondNumber;
				System.out.println(calc + " " + firstNumber + " " + operator + " " + secondNumber + " = " + result);
				break;

			// multiply here
			case "*":
				result = firstNumber * secondNumber;
				System.out.println(calc + " " + firstNumber + " " + operator + " " + secondNumber + " = " + result);
				break;

			// divide here - two options to show up nicely the result with or without deximals
			case "/":
				if (firstNumber % secondNumber == 0) {
					result = firstNumber / secondNumber;
					System.out.println(calc + " " + firstNumber + " " + operator + " " + secondNumber + " = " + result);
				} else {
					resultDouble = (double) firstNumber / secondNumber;
					System.out.println(calc + " " + firstNumber + " " + operator + " " + secondNumber + " = " + resultDouble);
				}
				break;

			// raise to power here
			case "^":
				for (int i = 0; i < secondNumber; i++) {
					resultLong *= firstNumber;
				}
				System.out.println(calc + " " + firstNumber + " " + operator + " " + secondNumber + " = " + resultLong);
				break;

			// calculate percentage here
			case "%":
				resultDouble = (secondNumber * firstNumber) / 100.0;
				System.out.println(calc + " " + firstNumber + operator + " Out of " + secondNumber + " = " + resultDouble);
				break;

			//if operator is outside of required
			default:
				System.out.println(alarm + "Operator is not correct!");
				break;
		}
	}
}

