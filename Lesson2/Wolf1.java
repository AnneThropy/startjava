public class Wolf1 {

	//sex
	private String sex = "male";
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	//name
	private String name = "Loki";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == "") {
			throw new IllegalArgumentException("Empty string");
			//System.out.println("Empty string");
		} else {
			this.name = name;
		}
	}

	//weight
	private float weight = 41.75f;
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}

	//age
	private int age = 6;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 8) {
			//System.out.println("Age is incorrect");
			throw new IllegalArgumentException("Age is incorrect");
		} else {
			this.age = age;
		}
	}

	//color
	private String color = "grey";
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	//methods:

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