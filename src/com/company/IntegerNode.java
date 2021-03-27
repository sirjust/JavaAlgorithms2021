package com.company;

public class IntegerNode {
    private int data;
    private IntegerNode next;

    public IntegerNode() {}
    public IntegerNode(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setEmployee(int data) {
        this.data = data;
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }
}
