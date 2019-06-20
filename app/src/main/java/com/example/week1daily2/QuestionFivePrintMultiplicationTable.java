package com.example.week1daily2;

public class QuestionFivePrintMultiplicationTable {

    public static void main(String[] args) {

        QuestionFivePrintMultiplicationTable multiplicationTableObj = new QuestionFivePrintMultiplicationTable();
        multiplicationTableObj.printTables();
    }

    public void printTables(){
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print((i*j) + " ");
            }
            System.out.println();
        }
    }

}
