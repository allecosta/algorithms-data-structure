package test;

import selectionsort.SelectionSortList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSortListTest {

    public static void main(String[] args) {

        SelectionSortList list = new SelectionSortList();

        List<Integer> numbers = new ArrayList<>(Arrays.asList(35, 25, 5, 7, 3));

        System.out.println(list.selectionSort(numbers)); // [3, 5, 7, 25, 35]

    }
}