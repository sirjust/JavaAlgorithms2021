package com.company;

public class CommonCode {
    public static int[] swap(int[] array, int i, int j){
        if (i == j) return array;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
}
