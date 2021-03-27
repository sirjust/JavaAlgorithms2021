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
        IntegerNode newNode = new IntegerNode(data);
        if(isEmpty()) {
            head = newNode;
            return;
        }

        IntegerNode current = head;
        while(current != null){
            if(newNode.getData() < current.getData()){
                if(head == current) {
                    head = newNode;
                    newNode.setNext(current);
                    break;
                }
            }
            else if(current.getNext() == null){
                    current.setNext(newNode);
                    break;
                }
            else{
                current = current.getNext();
            }
        }
    }
}
