import java.util.Arrays;

public class OrdenacaoPorSelecao {

	public static void ordenacaoPorSelecao(int array[]) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void main(String args[]) {

		int array[] = {15, 3, 7, 2, 10};

		ordenacaoPorSelecao(array);

		System.out.println(Arrays.toString(array)); // [2, 3, 7, 10, 15]
	}
}