package com.example.week1daily2;

import java.util.Scanner;

public class QuestionTwoCheckPalindrome {

    public static void main(String[] args) {

        String inputString = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a word to check for palindrome: ");
        inputString = scanner.nextLine();

        QuestionTwoCheckPalindrome palindromeObj = new QuestionTwoCheckPalindrome();

        if(palindromeObj.checkPalindrome(inputString)){
            System.out.println("The string is a palindrome!");
        }
        else {
            System.out.println("The string is NOT a palindrome!");
        }

    }

    public boolean checkPalindrome(String word){

        String reverseWord = "";
        int length = word.length();

        for(int i = length-1; i >= 0; i--){
            reverseWord += word.charAt(i);
        }

        if(reverseWord.equalsIgnoreCase(word)){
            return true;
        }
        else {
            return false;
        }
    }
}
