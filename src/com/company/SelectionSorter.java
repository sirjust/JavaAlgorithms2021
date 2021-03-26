package com.company;

import static com.company.CommonCode.swap;

public class SelectionSorter {
    public int[] sort(int[] array){
        for(int lastUnsortedIndex = array.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;
            for(int i = 1; i <= lastUnsortedIndex; i++){
                if(array[i] > array[largest]){
                    largest = i;
                }
            }
            array = swap(array, largest, lastUnsortedIndex);
        }
        return array;
    }
}
