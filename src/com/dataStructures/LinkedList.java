package com.dataStructures;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    private boolean isEmpty(){
        return first == null;
    }

    public int indexOf(int item){
        //traverse list from beginning to end
        //as soon as we find matching value and return index
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public void removeLast(){
        // if list is empty throw exception
        if (isEmpty())
            throw new NoSuchElementException();

        //if there is only one node
        if (first == last)
            first = last = null;
        else {
        //if there are more than one node in linked:list
        var previous = getPrevious(last);
        last = previous;
        last.next = null;
        }
        size--;
    }

    private Node getPrevious(Node node){
        var current = first;
        while (current != null) {
            if (current.next == last) return current;
            current = current.next;
        }
        return null;
    }


    public void removeFirst() {
        // [ 1 , 2 , 3 ]
        if (isEmpty()) throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            return;
        }
        var second = first.next;
        first.next = null;
        first = second;
        size--;
    }

    public boolean cotains(int item){
        return indexOf(item) != -1;
    }

    public void addFirst(int item){
        var node  = new Node(item);
        if (isEmpty())       // If list is empty then point
            first = last = node; // first and last to new node
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public void addLast(int item){
        var node = new Node(item);

        // if list empty or not
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    //0(1)
    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        var index = 0;
            while (current != null){
                array[index] = current.value;
                index++;
                current = current.next;
            }
      return array;
    }

}
