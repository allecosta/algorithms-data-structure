<?php

/**
 * Quicksort - Algoritmo de ordenação que utiliza a técnica dividir para conquistar
 * Esta técnica não é um simples algoritmo que se aplica em um problema, mas sim uma maneira de pensar sobre o problema
 */

function sum($array)
{
    $total = 0;

    for ($i = 0; $i < count($array); $i++) {
        $total += $array[$i];
    }

    return $total;
}

echo sum([3, 7, 10,]);
