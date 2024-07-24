public class Saudacao {

	private static void breveSaudacao(String nome) {
		System.out.println("Como você vai, " + nome + "?");
	}

	private static void tchau() {
		System.out.println("Okay, bye bye!!");
	}

	private static void saudacao(String nome) {
		System.out.println("Olá, " + nome + "!");
		
		breveSaudacao(nome);
		
		System.out.println("É hora de partir ...");

		tchau();
	}

	public static void main(String args[]) {

		saudacao("Milenna");
	}
}