package com.company;

public class MergeSorter {
    public static void mergeSort(int[] array, int start, int end){
        if (end - start < 2) return;

        // partition the sections
        int mid = (start + end)/2;
        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
        merge(array, start, mid, end);
    }

    public static void merge(int[] array, int start, int mid, int end){
        if (array[mid - 1] <= array[mid]) return;

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end){
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }
        // if we have elements in the left partition, we copy them into the temp array
        // if we have elements in the right partition, we don't have to do anything
        // furthermore, we don't need to copy leftover elements in left into temp, they can go directly into the original array
        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, start, tempIndex);
    }
}
