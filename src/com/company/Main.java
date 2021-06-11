package com.company;

public class Main {

    public static void main(String[] args) {
        useTree();
        // useSorters();
        // useLinkedLists();
        // insertLinkedListSorted();
        // useFactorialCalculator();
    }

    private static void useFactorialCalculator(){
        System.out.println(FactorialCalculator.factorialIterative(10));
        System.out.println(FactorialCalculator.factorialRecursive(10));
    }

    private static void insertLinkedListSorted(){
        IntegerLinkedList list = new IntegerLinkedList();
        list.testInsertSorted(4);
        list.testInsertSorted(2);
        list.testInsertSorted(1);
        list.testInsertSorted(5);
        list.testInsertSorted(3);

        list.printList();
    }

    private static void useLinkedLists(){
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

        Employee newEmployee = new Employee("James", "Bond", 007);
        // EmployeeNode nodeToAdd = new EmployeeNode(newEmployee);
        // EmployeeNode existingNode = list.head.getNext().getNext();
        // list.addBefore(nodeToAdd, existingNode);

        list.addBeforeInstructor(newEmployee, john);
        list.addBeforeInstructor(new Employee("Mark", "Newton", 505), mary);
        System.out.println("Size: " + list.getSize());
        list.printList();
        /*list.removeFromFront();
        System.out.println("Size: " + list.getSize());
        list.printList();*/
    }

    private static void useSorters(){
        //test();
        int[] array = new int[] {20, 35, -15, 7, 55, 1, -22};
        // BubbleSorter sorter = new BubbleSorter();
        // SelectionSorter sorter = new SelectionSorter();
        // InsertionSorter sorter = new InsertionSorter();
        // ShellSorter sorter = new ShellSorter();
        // sorter.mySort(array);
        // sorter.sort(array);
        MergeSorter sorter = new MergeSorter();
        sorter.mergeSort(array, 0, array.length);

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

    private static void useTree(){
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
    }
}
