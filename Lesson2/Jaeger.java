public class Jaeger {

	private String modelName, mark, origin;
	private float height, weight;
	private int speed, strength, armor;

	public Jaeger(String a, String b, String c, float d, float e, int f, int g, int h) {
		modelName = a; 
		mark = b;
		origin = c;
		height = d;
		weight = e;
		speed = f;
		strength = g;
		armor = h;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getArmor() {
		return armor;
	}
	
	public void setArmor(int armor) {
		this.armor = armor;
	}

	//METHODS

	public boolean drift() {
		System.out.println(modelName + " Drifting");
		return true;
	}

	public void move() {
		System.out.println(modelName + " Moving " + speed + " steps ahead");
	}

	public String scanKaiju() {
		return (modelName + " Found Kaiju");
	}

	public void useWeapon() {
		System.out.println(modelName +" Exterminating " + armor + " Kaiju");
	}
}