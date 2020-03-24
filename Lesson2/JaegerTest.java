public class JaegerTest {
	public static void main(String[] args) {

		Jaeger shadowFlare = new Jaeger();
		shadowFlare.setModelName("Shadow Flare");
		shadowFlare.setMark("Mark-4");
		shadowFlare.setOrigin("USA");
		shadowFlare.setHeight(114.3f);
		shadowFlare.setWeight(2.200f);
		shadowFlare.setSpeed(7);
		shadowFlare.setStrength(8);
		shadowFlare.setArmor(6);

		Jaeger hydraCorinthian = new Jaeger();
		hydraCorinthian.setModelName("Hydra Corinthiant");
		hydraCorinthian.setMark("Mark-4");
		hydraCorinthian.setOrigin("USA");
		hydraCorinthian.setHeight(79.24f);
		hydraCorinthian.setWeight(1.870f);
		hydraCorinthian.setSpeed(10);
		hydraCorinthian.setStrength(8);
		hydraCorinthian.setArmor(3);

		shadowFlare.drift();
		hydraCorinthian.useWeapon();
		shadowFlare.move();
		hydraCorinthian.scanKaiju();
		shadowFlare.useWeapon();
		hydraCorinthian.move();
		shadowFlare.scanKaiju();
		hydraCorinthian.drift();

		System.out.println(shadowFlare.modelName + " - " + shadowFlare.mark);
		System.out.println(hydraCorinthian.modelName + " - " + hydraCorinthian.mark);

		System.out.println(shadowFlare.modelName + " origin - " + shadowFlare.origin);
		System.out.println(hydraCorinthian.modelName + " origin - " + hydraCorinthian.origin);

		System.out.println(shadowFlare.modelName + " speed - " + shadowFlare.speed);
		shadowFlare.setSpeed(9);
		System.out.println(shadowFlare.modelName + " new speed - " + shadowFlare.speed);
		shadowFlare.move();

		System.out.println(hydraCorinthian.modelName + " armor - " + hydraCorinthian.armor);
		hydraCorinthian.setArmor(9);
		System.out.println(hydraCorinthian.modelName + " new armor - " + hydraCorinthian.armor);
		hydraCorinthian.useWeapon();
	}
}