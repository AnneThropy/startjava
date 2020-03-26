public class JaegerTest {
	public static void main(String[] args) {
		Jaeger shadowFlare = new Jaeger("Shadow Flare", "Mark-4", "USA", 114.3f, 2.200f, 7, 8, 6);
		
		Jaeger hydraCorinthian = new Jaeger("Hydra Corinthiant", "Mark-4", "USA", 79.24f, 1.870f, 10, 8, 3);

		shadowFlare.drift();
		hydraCorinthian.useWeapon();
		shadowFlare.move();
		hydraCorinthian.scanKaiju();
		shadowFlare.useWeapon();
		hydraCorinthian.move();
		shadowFlare.scanKaiju();
		hydraCorinthian.drift();

		System.out.println(shadowFlare.getModelName() + " - " + shadowFlare.getMark());
		System.out.println(hydraCorinthian.getModelName() + " - " + hydraCorinthian.getMark());

		System.out.println(shadowFlare.getModelName() + " origin - " + shadowFlare.getOrigin());
		System.out.println(hydraCorinthian.getModelName() + " origin - " + hydraCorinthian.getOrigin());

		System.out.println(shadowFlare.getModelName() + " speed - " + shadowFlare.getSpeed());
		shadowFlare.setSpeed(9);
		System.out.println(shadowFlare.getModelName() + " new speed - " + shadowFlare.getSpeed());
		shadowFlare.move();

		System.out.println(hydraCorinthian.getModelName() + " armor - " + hydraCorinthian.getArmor());
		hydraCorinthian.setArmor(9);
		System.out.println(hydraCorinthian.getModelName() + " new armor - " + hydraCorinthian.getArmor());
		hydraCorinthian.useWeapon();
	}
}