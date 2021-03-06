package com.dataStructures;

import java.util.NoSuchElementException;

//lookup:
//  by index: O(n)
//  By value: O(n)
//insert:
//  Beginning/End: O(1)
//  Middle: O(n)
//delete
//  Beginning: O(1)
//  Middle:    O(n)
//  End:       O(n)/ O(1)

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

    public void reverse(){
        //reverse list in place
        var reversedList = new LinkedList();
        var current = first;
        while (current != null){
            reversedList.addFirst(current.value);
            current = current.next;
        }
        first = reversedList.first;
        last = reversedList.last;
    }

    public boolean currentHasValue(Node current){
        return current != null;
    }

    public void moshReverse(){
        // [10, -> 20, -> 30]
        //   p      c      n
        //      <-
        //  n = c.next
        // c.next = p
        //             <-
        // next is the node after the current node when
        // the link is changed on current node the next
        // nodes link is lost and therefore create var for
        // it before it get trashed by the garbage collector.

        if (isEmpty()) return;

        var previous = first;
        var current = first.next;
        while (currentHasValue(current)) {
            var next = current.next;
            current.next = previous;
            //have to set this before current otherwise they overwrite each other.
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
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

    public int getKthFromTheEnd(int k){
        // Find the kth node from the end
        // of a linked list IN ONE PASS
        // [10 -> 20 -> 30 -> 40 -> 50]
        //  *           *
        // k = 1 (50)
        // k = 2 (40)
        // k = 3 (30) (distance = 2)
        // therefore distance = (k - 1 )

        //validation if we know size of linkedList
//        if (k > size){
//            throw new IllegalArgumentException();
//        }
        //if not then:
        if (isEmpty()) return -1;

        var a = first;
        var b = first;
        for (int i = k - 1 ; i > 0; i--){
            b = b.next;

            // validation if size is unknown
            if (b == null){
                throw new IllegalArgumentException();
            }
        }

        while ( b.next != null){
            a = a.next;
            b = b.next;
        }

        System.out.println(a.value);
        return a.value;

    }

    public void printMiddle() {
        // create two pointers fast and slow
        // if the fast is moving at 2++ per loop
        // and if slow is moving at exactly 1++ per loop
        // then when the fast hits the end the slow will be
        // in the middle of the list.
        // if the size based on index created is even then the middle
        // will be the slow pointer node and the node previous of that one

        // refactored
        if (isEmpty()) throw new IllegalArgumentException();
        var a = first;
        var b = first;
        while (b != last && b.next != last){
            b = b.next.next;
            a = a.next.next;
        }
        if (b == last)
            System.out.println(a.value);
        else
            System.out.println(a.value + ", " + a.next.value);
    }

    public static LinkedList createWithLoop() {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        // Get a reference to 30
        var node = list.last;

        list.addLast(40);
        list.addLast(50);

        // Create the loop
        list.last.next = node;

        return list;
    }

    public boolean hasLoop(){
        var slow = first;
        var fast = first;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }
        return false;
    }

}
