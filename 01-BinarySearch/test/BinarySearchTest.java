package test;

public class BinarySearchTest {

    public static void main(String[] args) {

        BinarySearch bSearch = new BinarySearch();

        int[] myLIst = {77, 51, 25, 3, 36, 56, 10};

        System.out.println(bSearch.binarySearch(myLIst, 23));
        System.out.println(bSearch.binarySearch(myLIst, 56));
    }
}