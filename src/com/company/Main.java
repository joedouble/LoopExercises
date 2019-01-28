package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int counter = 1;

        Scanner number = new Scanner(System.in);

        System.out.println("Please enter a number between 1-20.");
        int userNumber = number.nextInt();

        System.out.println("User input: " + userNumber);

        while (counter <= userNumber) {
            int math = 4 * counter;
            System.out.println("4 times " + counter + " is " + math);
            counter++;
        }
    }
}
