package com.example.week1daily2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QuestionOneFindDuplicates {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Mobile");
        strings.add("Hello");
        strings.add("Android");
        strings.add("Android");
        strings.add("Mobile");
        strings.add("Money");

        QuestionOneFindDuplicates findObject = new QuestionOneFindDuplicates();
        findObject.findDuplicates(strings);

    }

    public void findDuplicates(List<String> strings){
        Set<String> stringSet = new HashSet<>();

        System.out.println("My List containing duplicates: ");
        System.out.println(strings);
        System.out.println();
        System.out.println("The duplicate elements are:");

        for(String aString : strings){
            if(!stringSet.add(aString)){
                System.out.println(aString);
            }
        }

    }
}
