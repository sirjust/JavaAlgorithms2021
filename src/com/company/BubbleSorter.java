package com.company;

import static com.company.CommonCode.swap;

public class BubbleSorter {
    public int[] sort(int[] array){
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for (int i = 0; i < lastUnsortedIndex; i++){
                if(array[i] > array[i+1]){
                    array = swap(array, i, i+1);
                }
            }
        }
        return array;
    }
}
