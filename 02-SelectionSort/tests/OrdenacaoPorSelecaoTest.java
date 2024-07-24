package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrdenacaoPorSelecaoTest {

	private static List<Integer> ordenacaoPorSelecao(List<Integer> array ) {

		List<Integer> novoArray = new ArrayList<>(array.size());

		int tamanho = array.size();

		for (int i = 0; i < tamanho; i++) {
			int menor = buscarMenor(array);
			novoArray.add(array.get(menor));
			array.remove(menor);
		}

		return novoArray;
	}

	private static int buscarMenor(List<Integer> array) {
		int menor = array.get(0);
		int menorIndice = 0;

		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) < menor) {
				menor = array.get(i);
				menorIndice = i;
			}
		}

		return menorIndice;
	}

	public static void main(String args[]) {

		List<Integer> array = new ArrayList<>(Arrays.asList(15, 3, 6, 22, 10));

		System.out.println(ordenacaoPorSelecao(array)); // [3, 6, 15, 10, 22]
	}
}

