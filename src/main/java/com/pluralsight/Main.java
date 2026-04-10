package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Math's App");

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("What would you like to do ?");
        System.out.println("1) Add");
        System.out.println("2) Subtract");
        System.out.println("3) Multiply");
        System.out.println("4) Divide");
        System.out.print("Enter your selection: ");
        int selection = scanner.nextInt();


        if(selection == 1) {
           double result = firstNumber + secondNumber;
            System.out.println("Your result is: " + result);

        }else if(selection == 2){
            double result = firstNumber - secondNumber;
            System.out.println("Your result is: " + result);

        }else if(selection == 3) {
            double result = firstNumber * secondNumber;
            System.out.println("Your result is: " + result);

        } else if(selection == 4) {
            double result = firstNumber / secondNumber;
            System.out.println("Your result is: " + result);

        } else {
            System.out.println("you made a BAD choice");
        }


    }
}
