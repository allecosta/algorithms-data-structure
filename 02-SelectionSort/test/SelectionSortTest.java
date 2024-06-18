package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import selectionsort.SelectionSort;

public class SelectionSortTest {

    public static void main(String[] args) {

        SelectionSort number = new SelectionSort();

        List<Integer> listNumbersOne = new ArrayList<>(Arrays.asList(35, 25, 5, 7, 3));

        System.out.println(number.selectionSortOne(listNumbersOne));

        //int[] listNumbersTwo = {30, 5, 2, 6, 10};

        //System.out.println(number.selectionSortTwo(listNumbersTwo));
    }
}