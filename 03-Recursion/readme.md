# Recursion (recursão)

*Recursão é uma função que chama a si mesma.<br>*
*A recursão é utilizada para tornar a resposta mais clara. Não há nenhum benefício em termos de desempenho ao utlizar recursão, 
na verdade os loops (for, while ou do-while) algumas vezes são até melhores para desempenho.*

<br>
																																							 
## Stack (Pilha)

*Esta é uma estrutura de dados muito importante e simples, que se utiliza dos métodos push (para inserir valores na pilha) e o 
pop (para remover e ler valores em uma pilha de dados).*<br>
*Temos também um conceito muito importante que é call stack (chamada de pilha). Uma pilha pode ser usada para guardar variáveis (que também são funções ou métodos), de multiplas funções (métodos que invocam outros métodos), ao qual denominamos de call stack.*<br>
*Vale ressaltar que usar pilha é bom, mas existe um custo que é o uso excessivo de memória, e quando sua pilha está muito cheia é 
sinal que o computador está salvando muitas chamadas de funções. Neste caso reescrever o código utulizando loops, pode ajudar.*

<br>

## Overview

* Recursão é quando uma função chama a si mesma
* Toda função recursiva tem dois casos: o caso-base e o caso recursivo
* Existem duas operações: push (insere valores na pilha) e pop (remove e ler valores em uma pilha)
* Todas as chamadas de função vão para uma pilha de chamada
* A pilha de chamada pode ocupar muita memória