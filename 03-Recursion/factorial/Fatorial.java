public class Fatorial {
	
	private static int fatorial(int num){
		if (num == 1) {
			return 1;
		} else {
			return num * fatorial(num - 1);
		}
	}
	
	public static void main(String args[]) {
		
		System.out.println(fatorial(8));
	}
}