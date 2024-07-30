package tests;

public class Fatorial {
	
	public int obterFatorial(int num) {
		if (eZeroOuUm(num)) {
			return 1;
		}
		
		return num * obterFatorial(num - 1);
	}
	
	public boolean eZeroOuUm(int num) {
		if (num > 1) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String args[]) {
		
		Fatorial fatorial = new Fatorial();
		
		System.out.println("O fatorial de 8 é: " + fatorial.obterFatorial(8));
	}
}
 
