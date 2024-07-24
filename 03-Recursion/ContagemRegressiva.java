public class ContagemRegressiva {

	private static void contagemRegressiva(int number) {
		System.out.println(number);

		if (number <= 0) {
			return;
		} else {
			contagemRegressiva(number - 1);
		}
	}

	public static void main(String args[]) {

		contagemRegressiva(10); // 10, 9 ,8, 7, 6, 5, 4, 3, 2, 1, 0
	}
}