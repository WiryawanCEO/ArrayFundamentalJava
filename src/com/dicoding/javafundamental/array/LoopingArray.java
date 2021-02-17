package com.dicoding.javafundamental.array;

public class LoopingArray {
    public static void main(String[] args) {
        int[] intArray = new int[1000000];

        for(int i = 0; i < intArray.length; i++){
            intArray[i] = i + 1;
            System.out.println(intArray[i]);
        }
    }
}
