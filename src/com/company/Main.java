package com.company;

public class Main {

    public static void main(String[] args) {
        UseLinkedLists();
    }

    private static void UseLinkedLists(){
        Employee jane = new Employee("Jane", "Jones", 123);
        Employee john = new Employee("John", "Doe", 4567);
        Employee mary = new Employee("Mary", "Smith", 22);
        Employee mike = new Employee("Mike", "Wilson", 3245);

        // EmployeeLinkedList list = new EmployeeLinkedList();
        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        System.out.println("Is this list empty? " + list.isEmpty());
        list.addToFront(jane);
        list.addToFront(john);
        list.addToFront(mary);
        list.addToFront(mike);

        System.out.println("Size: " + list.getSize());
        list.printList();

        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToEnd(billEnd);
        System.out.println("Size: " + list.getSize());
        list.printList();

        list.removeFromFront();
        System.out.println("Size: " + list.getSize());
        list.printList();

        list.removeFromEnd();
        System.out.println("Size: " + list.getSize());
        list.printList();

        EmployeeNode nodeToAdd = new EmployeeNode(new Employee("James", "Bond", 007));
        EmployeeNode existingNode = list.head.getNext().getNext();
        list.addBefore(nodeToAdd, existingNode);

        System.out.println("Size: " + list.getSize());
        list.printList();
        /*list.removeFromFront();
        System.out.println("Size: " + list.getSize());
        list.printList();*/
    }

    private static void UseSorters(){
        //test();
        int[] array = new int[] {20, 35, -15, 7, 55, 1, -22};
        BubbleSorter sorter = new BubbleSorter();
        // SelectionSorter sorter = new SelectionSorter();
        // InsertionSorter sorter = new InsertionSorter();
        // ShellSorter sorter = new ShellSorter();
        // sorter.sort(array);
        sorter.mySort(array);
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
