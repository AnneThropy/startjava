public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();

		//assigning values to the variables of the Wolf class
		wolfOne.setSex("female");
		wolfOne.setName("Ally");
		wolfOne.setWeight(35.5f);
		wolfOne.setAge(3);
		wolfOne.setColor("white");

		//printing out new values in console
		System.out.println("New Name: " + wolfOne.getName());
		System.out.println("New Sex: " + wolfOne.getSex());
		System.out.println("New Weight: " + wolfOne.getWeight());
		System.out.println("New Age: " + wolfOne.getAge());
		System.out.println("New Color: " + wolfOne.getColor());
	}
}