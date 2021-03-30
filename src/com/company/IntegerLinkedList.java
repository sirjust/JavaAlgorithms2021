package com.company;

public class IntegerLinkedList {
    private IntegerNode head;
    private int size;

    public void addToFront(int data){
        IntegerNode node = new IntegerNode(data);
        node.setNext(head);
        head = node;
        size++;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public IntegerNode removeFromFront(){
        if(isEmpty()) return null;

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void printList(){
        IntegerNode current = head;
        System.out.println("HEAD -> ");
        while (current != null){
            System.out.print(current.getData());
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public void insertSorted(int data){
        if(head == null || head.getData() >= data){
            addToFront(data);
            return;
        }

        // find the insertion point
        IntegerNode current = head.getNext();
        IntegerNode previous = head;

        while (current != null && current.getData() < data){
            previous = current;
            current = current.getNext();
        }
        IntegerNode newNode = new IntegerNode(data);
        newNode.setNext(current);
        previous.setNext(newNode);
        size++;
    }

    public void testInsertSorted(int value){
        if(head == null || head.getData() >= value){
            addToFront(value);
            return;
        }

        // find the insertion point
        IntegerNode current = head.getNext();
        IntegerNode previous = head;

        while(current != null && current.getData() < value){
            previous = current;
            current = current.getNext();
        }

        IntegerNode newNode = new IntegerNode(value);
        newNode.setNext(current);
        previous.setNext(newNode);
        size++;
    }

    public void insertSortedInstructor(int value){
        // assumption: the list is already sorted

        if(head == null || head.getData() >= value){
            addToFront(value);
            return;
        }

        // find the insertion point
        IntegerNode current = head.getNext();
        IntegerNode previous = head;
        while(current != null && current.getData() < value){
            previous = current;
            current = current.getNext();
        }
        IntegerNode newNode = new IntegerNode(value);
        newNode.setNext(current);
        previous.setNext(newNode);
        size++;
    }
}
