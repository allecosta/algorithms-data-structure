<?php

/*
 * Pilha - Estrutura de dados
 * Fluxo do algoritmo:
 * 1 - Faz a chamada da função greet() e executa a primeira frase
 * 2 - Faz a chamada da função greet2() e executa a frase referente a esta função
 * 3 - Execcuta a frase "Se preparando..."
 * 4 - Faz a chamada da função bye().
 *
 * */

function greetTwo($name)
{
    echo "Como vai você, " . $name . "?" . PHP_EOL;
}

function bye()
{
    echo "Okay tchau . . .";
}

function greet($name)
{
    echo "Olá, " . $name . "!" . PHP_EOL;
    greetTwo($name);
    echo "Se preparando para dizer adeus . . ." . PHP_EOL;

    bye();
}

greet("Alexandre");
