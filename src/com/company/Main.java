package com.company;

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Northwoods Cinema", 8, 12);
//        theatre.getSeats();
        if (theatre.reserveSeat("H01")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Can't sit here...");
        }

        if (theatre.reserveSeat("H01")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Can't sit here...");
        }

    }

}