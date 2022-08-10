<?php

/**
 * Pesquisa Binaria usando array
 * A função binarySearch() pega um array ordenado e um item
 * Se o item estiver no array, a função retorna a sua posição.
 *
 */

function binarySearch($needle, $array)
{
    $low = 0;
    $high = count($array) - 1;

    while ($low <= $high) {
        $middle = floor(($low + $high) / 2);

        if ($array[$middle] == $needle) {
            return $middle;
        }

        if ($array[$middle] > $needle) {
            $high = $middle - 1;
        } else {
            $low = $middle + 1;
        }
    }

    //return null;

    echo $needle . " - valor não encontrado no array!";
}

$array = [2, 13, 15, 17, 19, 31];

echo binarySearch(17, $array) . PHP_EOL;
echo binarySearch(5, $array) . PHP_EOL;
