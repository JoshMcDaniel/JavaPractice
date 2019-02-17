package com.company;

import java.util.Scanner;

public class FindMinArray {

    //  Use the code below in the Main method
//    FindMinArray minArray = new FindMinArray();
//    int arrayLength = 5;
//    int minInt = minArray.findMin(minArray.readIntegers(arrayLength));
//    System.out.println("The minimum integer is " + minInt);

    public int[] readIntegers(int count) {
        System.out.println("Type " + count + " numbers, pressing ENTER after each one: \r");
        Scanner scanner = new Scanner(System.in);
        int[] newArray = new int[count];
        for (int i=0; i<count; i++) {
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }

    public int findMin(int[] arr) {
        int min = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
