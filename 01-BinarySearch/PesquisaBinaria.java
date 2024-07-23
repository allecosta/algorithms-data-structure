public class PesquisaBinaria {

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

		return null; // é seguro retornar "null" por está utlizando o retorno Integer neste método.

	}

	public static void main(String args[]) {

		int lista[] = {1, 4, 10, 22, 29};

		System.out.println(pesquisaBinaria(lista, 10)); // 2
		System.out.println(pesquisaBinaria(lista, 0)); // null
	}
}