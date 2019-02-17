package com.company;

public class Main {

    public static void main(String[] args) {

        FindMinArray minArray = new FindMinArray();
        int arrayLength = 5;
        int minInt = minArray.findMin(minArray.readIntegers(arrayLength));
        System.out.println("The minimum integer is " + minInt);

    }

}