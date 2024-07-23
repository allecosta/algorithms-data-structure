package tests;

public class PesquisaBinariaTest01 {

	public static int pesquisaBinaria(int lista[], int item) {
		if (listaVazia(lista)) {
			return -1;
		}

		int baixo = 0;
		int alto = lista.length - 1;

		while (baixo <= alto) {
			int meio = (baixo + alto) / 2;
			int chute = lista[meio];

			if (chuteIgualItem(chute, item)) {
				return meio;
			} else if (chuteMaiorItem(chute, item)) {
				alto = meio - 1;
			} else if (chuteMenorItem(chute, item)) {
				baixo = meio + 1;
			}
		}

		return -1; // utilizo o retorno -1 por está utilizando o retorno int neste método.
	}

	public static boolean listaVazia(int lista[]) {
		int tamanhoLista = lista.length;

		if (tamanhoLista == 0) {
			return true;
		}

		return false;
	}

	public static boolean chuteIgualItem(int chute, int item) {
		if (chute == item) {
			return true;
		}

		return false;
	}

	public static boolean chuteMaiorItem(int chute, int item) {
		if (chute > item) {
			return true;
		}

		return false;
	}

	public static boolean chuteMenorItem(int chute, int item) {
		if (chute < item) {
			return true;
		}

		return false;
	}

	public static void main(String args[]) {

		int lista[] = {7, 17, 21, 45, 63}; // lista ordenada

		System.out.println(pesquisaBinaria(lista, 63)); // 4
		System.out.println(pesquisaBinaria(lista, 17)); // 1
	}
}