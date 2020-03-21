public class WolfTest1 {

	public static void main(String[] args) {
		Wolf1 wolfOne = new Wolf1();

		//printing out initial values in console
		System.out.println("Old Name: " + wolfOne.getName());
		System.out.println("Old Sex: " + wolfOne.getSex());
		System.out.println("Old Weight: " + wolfOne.getWeight());
		System.out.println("Old Age: " + wolfOne.getAge());
		System.out.println("Old Color: " + wolfOne.getColor());

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

		//calling object methods
		/*
		wolfOne.go();
		System.out.println(wolfOne.sit());
		wolfOne.run();
		System.out.println(wolfOne.howl());
		System.out.println(wolfOne.hunt());*/
	}
}