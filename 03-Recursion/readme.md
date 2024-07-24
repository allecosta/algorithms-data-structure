# Recursion (recursão)

*Recursão é uma função que chama a si mesma.<br>*
*A recursão é utilizada para tornar a resposta mais clara. Não há nenhum benefício em termos de desempenho ao utlizar recursão, na verdade os loops (for, while ou do-while) algumas vezes são até melhores para desempenho.*<br>

```java

/*
* Neste exemplo o método contagemRegressiva() invoca a si mesmo, isso é recursividade.
*/ 

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
		contagemRegressiva(10);
	}
}
```
																																							 
## Stack (Pilha)

*Esta é uma estrutura de dados muito importante e simples, que se utiliza dos métodos push (para inserir valores na            pilha) e o pop (para remover e ler valores em uma pilha de dados).*<br>
*Temos também um conceito muito importante que é call stack (chamada de pilha). Uma pilha pode ser usada para guardar variáveis (que também são funções ou métodos), de multiplas funções (métodos que invocam outros métodos), ao qual denominamos de call stack.*<br>

```java

/*
* Aqui temos um exemplo de uso de pilha (stack) e call stack (chamada de pilha), onde um método chama outros métodos.
*/ 

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

```