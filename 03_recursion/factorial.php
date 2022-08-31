<?php

/*
 * Pilha de chamada com recursão
 * Funções recursivas utilizam pilha de chamada, como exemplo, calculando fatorial.
 * */

function fact($x)
{
    if ($x === 1) {
        return 1;
    }

    return $x * fact($x - 1);
}

echo fact(3);
