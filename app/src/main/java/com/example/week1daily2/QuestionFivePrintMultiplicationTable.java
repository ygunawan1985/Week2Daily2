package com.example.week1daily2;

public class QuestionFivePrintMultiplicationTable {

    public static void main(String[] args) {

        QuestionFivePrintMultiplicationTable multiplicationTableObj = new QuestionFivePrintMultiplicationTable();
        multiplicationTableObj.printTables();
    }

    public void printTables(){

        int[][] array = new int[10][10];

        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++) {
                array[i - 1][j - 1] = i * j;
            }
        }

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


    }

}
