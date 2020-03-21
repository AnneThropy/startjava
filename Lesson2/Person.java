public class Person {

	String sex = "male";
	String name = "Bob";
	double height = 1.83;
	int weight = 70;
	int age = 22;

	void move() {
		System.out.println("Make a step");
	}

	boolean sit() {
		System.out.println("Sit down");
		return true;
	}

	void run() {
		System.out.println("Run!");
	}

	String talk() {
		System.out.println("Small talk");
		return("Bla-bla-bla");
	}

	String learnJava() {
		System.out.println("Learning the second lesson");
		return("Lesson is learned");
	}
}