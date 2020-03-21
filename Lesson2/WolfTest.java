public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		
		//assigning values to the variables of the Wolf class
		wolfOne.sex = "female";
		wolfOne.name = "Ally";
		wolfOne.weight = 35.5f;
		wolfOne.age = 3;
		wolfOne.color = "white";

		//printing them out in console
		System.out.println("Name: " + wolfOne.name);
		System.out.println("Sex: " + wolfOne.sex);
		System.out.println("Weight: " + wolfOne.weight);
		System.out.println("Age: " + wolfOne.age);
		System.out.println("Color: " + wolfOne.color);

		//calling object methods
		wolfOne.go();
		System.out.println(wolfOne.sit());
		wolfOne.run();
		System.out.println(wolfOne.howl());
		System.out.println(wolfOne.hunt());
	}
}