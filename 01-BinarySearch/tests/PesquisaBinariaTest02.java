package tests;

import java.util.Arrays;

public class PesquisaBinariaTest02 {

	private static Integer pesquisaBinaria(int lista[], int item) {
		int baixo = 0;
		int alto = lista.length - 1;

		while (baixo <= alto) {
			int meio = (baixo + alto) / 2;
			int chute = lista[meio];

			if (chute == item) {
				return meio;
			} else if (chute > item) {
				alto = meio - 1;
			} else {
				baixo = meio + 1;
			}
		}

		return null;
	}

	public static void main(String args[]) {

		int lista[] = {22, 4, 17, 15, 10 , 19}; // lista desordenada

		Arrays.sort(lista); // ordenando a lista

		System.out.println(pesquisaBinaria(lista, 4)); // 0
		System.out.println(pesquisaBinaria(lista, 15)); // 2
	}
}