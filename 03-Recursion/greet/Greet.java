public class Greet {

	private static void greeting(String name) {
		System.out.println("Olá, " + name + "!");

		greet(name);

		System.out.println("Me preparando para dizer tchau ...");

		bye();
	}
	
	private static void greet(String name) {
		System.out.println("Como vai " + name + "?");
	}

	private static void bye() {
		System.out.println("Okay, até mais ...");
	}

	public static void main(String[] args) {

		greeting("Mirella");
	}
}