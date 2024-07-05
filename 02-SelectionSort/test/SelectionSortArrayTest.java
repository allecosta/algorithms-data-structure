package test;

import java.util.Arrays;

public class SelectionSortArrayTest {

    public static void main(String[] args) {

        SelectionSortArray array = new SelectionSortArray();

        int[] numbers = { 15, 3, 16, 21, 10};

        array.selectionSort(numbers);

        System.out.println(Arrays.toString(numbers)); // [3, 10, 15, 16, 21]

    }
}