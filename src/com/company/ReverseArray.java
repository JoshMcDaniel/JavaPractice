package com.company;

public class ReverseArray {

    //  Place the code below in the Main method
//    int[] arr = new int[] {1,2,3,4,5};
//    ReverseArray reverseArray = new ReverseArray();
//    reverseArray.reverse(arr);

    public void reverse(int[] arr) {
        int[] reversedArray = new int[arr.length];

        for (int i=0, j=arr.length-1; i<arr.length; i++, j--) {
            reversedArray[i] = arr[j];
        }
        printArrays(arr, reversedArray);
    }

    private void printArrays(int[] original, int[] reversed) {
        System.out.println("Original array:");
        for (int i=0; i<original.length; i++) {
            System.out.println("Element " + i + ": " + original[i]);
        }

        System.out.println("Reversed array:");
        for (int i=0; i<reversed.length; i++) {
            System.out.println("Element " + i + ": " + reversed[i]);
        }
    }

}
