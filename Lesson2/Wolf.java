public class Wolf {

	String sex = "male";
	String name = "Loki";
	float weight = 41.75f;
	int age = 6;
	String color = "grey";

	void go() {
		System.out.println(name + " goes");
	}

	boolean sit() {
		System.out.println(name + " is sitting");
		return true;
	}

	void run() {
		System.out.println(name + " runs");
	}

	String howl() {
		System.out.println(name + " howls");
		return("Awwooooo");
	}

	boolean hunt() {
		System.out.println(name + " hunts");
		return true;
	}
}