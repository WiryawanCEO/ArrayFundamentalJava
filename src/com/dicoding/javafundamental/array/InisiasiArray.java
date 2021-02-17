package com.dicoding.javafundamental.array;

public class InisiasiArray {
    public static void main(String[] args) {
        int[] arrInt = {1, 2, 3, 4, 5, 6};

        String[] arrString = new String[6];
        arrString[0] = "A";
        arrString[1] = "B";
        arrString[2] = "C";
        arrString[3] = "D";
        arrString[4] = "E";
        arrString[5] = "F";

        System.out.println(arrInt[0]+" "+arrString[0]);
        System.out.println(arrInt[1]+" "+arrString[1]);
        System.out.println(arrInt[2]+" "+arrString[2]);
        System.out.println(arrInt[3]+" "+arrString[3]);
        System.out.println(arrInt[4]+" "+arrString[4]);
        System.out.println(arrInt[5]+" "+arrString[5]);
    }
}
