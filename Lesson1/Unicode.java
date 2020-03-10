public class Unicode {
	public static void main(String[] args) {
		//print all unicodes from 9398 to 10178
		char symbol;
		for (int i = 9398; i <= 10178; i++) {
			symbol = (char) i;
			System.out.println(i + " - " + symbol);
		}
	}

}