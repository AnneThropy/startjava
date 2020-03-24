public class Wolf {

	private String sex = "male";
	private String name = "Loki";
	private float weight = 41.75f;
	private int age = 6;
	private String color = "grey";

	//sex
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	//name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == "") {
			System.out.println("Empty string");
		} else {
			this.name = name;
		}
	}

	//weight
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}

	//age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 8) {
			System.out.println("Age is incorrect");
		} else {
			this.age = age;
		}
	}

	//color
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	//METHODS

	public void go() {
		System.out.println(name + " goes");
	}

	public boolean sit() {
		System.out.println(name + " is sitting");
		return true;
	}

	public void run() {
		System.out.println(name + " runs");
	}

	public String howl() {
		System.out.println(name + " howls");
		return("Awwooooo");
	}

	public boolean hunt() {
		System.out.println(name + " hunts");
		return true;
	}
}