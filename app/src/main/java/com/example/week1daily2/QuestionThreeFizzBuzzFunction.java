package com.example.week1daily2;

import java.util.Scanner;

public class QuestionThreeFizzBuzzFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int inputNumber = scanner.nextInt();

        if ((inputNumber % 3 == 0) && (inputNumber % 5 == 0)){
            System.out.println("fizzbuzz");
        } else if (inputNumber % 3 == 0){
            System.out.println("fizz");
        } else if (inputNumber % 5 == 0) {
            System.out.println("buzz");
        } else {
            System.out.println(inputNumber + " is not divisible by 3 or 5.");
        }
    }
}
