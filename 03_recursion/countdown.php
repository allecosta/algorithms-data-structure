<?php

/*
 * Recursão - É quando uma função chama a si mesma
 * Utilizada para tornar a resposta mais clara.
 *
 * */

function countdown($i)
{
    echo $i;

    if ($i <= 0) {
        return;
    } else {
        countdown($i - 1);
    }
}

countdown(10);
