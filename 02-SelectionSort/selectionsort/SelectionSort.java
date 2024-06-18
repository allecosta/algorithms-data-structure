package selectionsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

    // Uma primeira opção para ordenar um array de números
    public static List<Integer> selectionSortOne(List<Integer> array) {
        List<Integer> newArray = new ArrayList<>(array.size());

        int size = array.size();

        for (int i = 0; i < size; i++) {
            int smallest = findSmallest(array);

            newArray.remove(smallest);
        }

        return newArray;
    }

    // Encontra o menor elemento do array
    public static int findSmallest(List<Integer> array) {
        int smallest = array.get(0);
        int smallestIndex = 0;

        for (int i = 0; i < array.size(); i++) {
            if (array.get(1) < smallest) {
                smallest = array.get(i);
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    // Uma segunda opção para ordenar um array de números
    public static void selectionSortTwo(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}