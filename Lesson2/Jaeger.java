public class Jaeger {

	String modelName, mark, origin;
	float height, weight;
	int speed, strength, armor;

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

	boolean drift() {
		System.out.println(modelName + " Drifting");
		return true;
	}

	void move() {
		System.out.println(modelName + " Moving " + speed + " steps ahead");
	}

	String scanKaiju() {
		return (modelName + " Found Kaiju");
	}

	void useWeapon() {
		System.out.println(modelName +" Exterminating " + armor + " Kaiju");
	}
}