<?php

/**
 * Ordenação em um array
 * Encontrar o menor elemento do array e adicionar em um novo array.
 */

function findSmall($arr)
{
    $smallest = $arr[0];
    $smallestIndex = 0;

    for ($i = 0; $i < count($arr); $i++) {
        if ($arr[$i] < $smallest) {
            $smallest = $arr[$i];
            $smallestIndex = $i;
        }
    }

    return $smallestIndex;
}

function selectionSort($arr)
{
    $newArr = [];

    for ($i = 0, $lenght = count($arr); $i < $lenght; $i++) {
        $smallest = findSmall($arr);
        array_push($newArr, array_splice($arr, $smallest, 1)[0]);
    }

    return $newArr;
}

print_r(selectionSort([16, 5, 3, 12, 10, 2]));
