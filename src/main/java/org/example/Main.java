package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static double medianMerged(int[] array1, int[] array2){
        int[] merged = new int[array1.length+array2.length];
        for (int i = 0; i < array1.length; i++) {
            merged[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            merged[i+array1.length] = array2[i];
        }
        Arrays.sort(merged);
        double retVal = 0;

        if (merged.length%2 == 1){
            retVal = merged[(merged.length/2)];
        } else {
            retVal = (merged[(merged.length/2)-1] + merged[(merged.length/2)]) / 2.0;
        }

        return retVal;
    }
}