public class Wolf {

// пол, кличка, вес, возраст, окрас
	String sex = "male";
	String name = "Loki";
	float weight = 41.75f;
	int age = 6;
	String color = "grey";

//идти, сидеть, бежать, выть, охотиться
	void go() {
		System.out.println("Loki goes");
	}

	boolean sit() {
		System.out.println("Loki is sitting");
		return true;
	}

	void run() {
		System.out.println("Loki runs");
	}

	String howl() {
		System.out.println("Loki howls");
		return("Awwooooo");
	}

	boolean hunt() {
		System.out.println("Loki hunts");
		return true;
	}
}