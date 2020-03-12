public class Cycle {
	public static void main(String[] args) {
		// print numbera from 0 to 20
		System.out.println("Numbers from 0 to 20:");
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}
		System.out.println();

		// print numbers from 6 to -6 with step 2 using while
		System.out.println("Numbers from 6 to -6 with step 2:");
		int i = 6;
		while (i >= -6) {
			System.out.println(i);
			i -= 2;
		}
		System.out.println();

		//sum all even numbers from 10 to 20 using do-while
		System.out.println("Sum of all even numbers from 10 to 20:");
		i = 10;
		int result = 0;
		do {
			i++;
			if (i % 2 != 0) {
				result += i;
				// For check:
				// System.out.println(i + " Temporary result = " + result);
			}
		} while (i < 20);
		System.out.println(result);
	}
}