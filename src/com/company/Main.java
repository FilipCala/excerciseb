package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pin = 1234;
        int chceck;
        int count = 0;
        System.out.println("Enter your pin code");
        Scanner input = new Scanner(System.in);
        chceck = input.nextInt(); //input of the user Pin
        while (chceck !=pin){ //if input is not equal to pin
            System.out.println("Wrong PIN try again");
            chceck = input.nextInt(); count++; // it's counting how many times user put input
            if (count == 2){
                System.out.println("Your account is blocked");
                break; //Breaks the loop when user was wrong 3 times
            }
        }
        if (chceck == pin){
            System.out.println("Correct pin");
        }

    }
}