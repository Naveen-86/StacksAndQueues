package com.bridgelabz;

public class StackClass {
    private final NewLinkedList linkedList;

    public StackClass() {
        this.linkedList = new NewLinkedList();
    }

    public void push(INode node) {
        linkedList.add(node);
    }

    public INode peak() {
        return linkedList.head;
    }

    public INode pop() {
        return linkedList.pop();
    }


    public void printStack() {
        linkedList.printNodes();
    }

    public byte lastestElementOfStack() {
        return 0;
    }
}