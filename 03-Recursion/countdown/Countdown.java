public class Countdown {

	private static void countdown(int number) {

		System.out.println(number);

		if (number <= 0) {
			return;
		} else {
			countdown(number - 1);
		}
	}

	public static void main(String[] args) {
		
		countdown(10);
	}
}