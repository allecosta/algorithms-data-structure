/**
    Algoritmo: Pesquisa Binária

    Sua entrada é em uma lista ORDENADA de elementos, onde é realizada uma busca intermediaria eliminatoria.

*/

#include "iostream"

using namespace std;

void pesquisaBinaria(int array[], int elemento, int tamanho) 
{
    int baixo = 0;
    int alto = tamanho;

    while (baixo <= alto) {
        int meio = (baixo + alto) / 2;
        int advinhar = array[meio];

        if (advinhar == elemento) {
            cout <<"Elemento encontrado no indice: "<< meio <<endl;

            return;

        } else if (advinhar > elemento) {
            alto = meio - 1;

        } else {
            baixo = meio + 1;
        }
    }

    cout <<"OPS! Elemento não encontrado :)"<<endl;

    return;
}

int main() 
{
    int array[] = {2, 10, 15, 54, 88, 100, 110};
    int tamanho = sizeof(array) / sizeof(int);

    pesquisaBinaria(array, 15, tamanho);
    pesquisaBinaria(array, 88, tamanho);
    pesquisaBinaria(array, 201, tamanho);

    return 0;
}