package com.company;

public class Main {

    public static void main(String[] args) {
        //test();
        int[] array = new int[] {20, 35, -15, 7, 55, 1, -22};
        // BubbleSorter sorter = new BubbleSorter();
        // SelectionSorter sorter = new SelectionSorter();
        // InsertionSorter sorter = new InsertionSorter();
        ShellSorter sorter = new ShellSorter();
        sorter.sort(array);
        printArray(array);
    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void test(){
        System.out.println("Hello world!");

        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }

        int index = -1;
        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] == 7){
                index = i;
                break;
            }
        }
        System.out.println("index = " + index);
    }
}
