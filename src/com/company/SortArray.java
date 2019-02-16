package com.company;

import java.util.Scanner;

public class SortArray {

//    *****Place the commented code below into the main class to use*****
//    SortArray sort = new SortArray();
//    int arrayLength = 5;
//    int[] unsortedArray = sort.setUnsortedArray(arrayLength);
//        sort.sortArray(unsortedArray);

    public int[] setUnsortedArray(int length) {
        System.out.println("Type 5 numbers: \r");
        Scanner scanner = new Scanner(System.in);
        int[] newArray = new int[length];
        for (int i=0; i<length; i++) {
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }

    //  This method takes an array and swaps values around within the elements
    public void sortArray(int[] unsortedArray) {

        boolean stillNeedsSorting = true;
        int[] sortedArray = unsortedArray.clone();

        //  Will continue to run as long as the internal if statement is executed and sets the boolean back to true
        while (stillNeedsSorting) {
            stillNeedsSorting = false;
            int temp;
            for (int i=0; i<sortedArray.length-1; i++) {
                if (sortedArray[i] > sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    stillNeedsSorting = true;
                }
            }
        }
        printSortedArray(sortedArray, unsortedArray);
    }

    //  Prints the content of both arrays
    private void printSortedArray(int[] sortedArray, int[] unsortedArray) {
        System.out.println("Unsorted Array:");
        for (int i=0; i<unsortedArray.length; i++) {
            System.out.println("Index " + i + " is " + unsortedArray[i]);
        }

        System.out.println("\nHere, let me sort that for you... \nBEEP BOOP BOP\n");

        System.out.println("Sorted Array:");
        for (int i=0; i<sortedArray.length; i++) {
            System.out.println("Index " + i + " is " + sortedArray[i]);
        }
    }
}
