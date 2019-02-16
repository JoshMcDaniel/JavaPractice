package com.company;

public class Main {

    public static void main(String[] args) {

        //  Instantiates the SortArray class
        SortArray sort = new SortArray();
        int arrayLength = 5;
        int[] unsortedArray = sort.setUnsortedArray(arrayLength);
        sort.sortArray(unsortedArray);

    }

}