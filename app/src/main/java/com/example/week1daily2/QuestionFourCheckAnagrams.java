package com.example.week1daily2;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionFourCheckAnagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String inputString1 = scanner.nextLine();
        System.out.print("Enter String 2: ");
        String inputString2 = scanner.nextLine();

        QuestionFourCheckAnagrams anagramsObj = new QuestionFourCheckAnagrams();
        boolean result = anagramsObj.checkAnagrams(inputString1, inputString2);

        if (result) {
            System.out.println(inputString1 + " and " + inputString2 + " are anagrams.");
        } else {
            System.out.println(inputString1 + " and " + inputString2 + " are NOT anagrams.");
        }

    }

    public boolean checkAnagrams(String word1, String word2){
        String string1 = word1.replaceAll("\\s", "");
        String string2 = word2.replaceAll("\\s", "");
        boolean result = true;

        if(string1.length() != string2.length()){
            result = false;
        } else {
            char[] array1 = string1.toLowerCase().toCharArray();
            Arrays.sort(array1);
            char[] array2 = string2.toLowerCase().toCharArray();
            Arrays.sort(array2);

            result = Arrays.equals(array1, array2);
        }

        return result;
    }

}
