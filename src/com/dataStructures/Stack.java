package com.dataStructures;

public class Stack {
    private Array items = new Array(3);
    private int count = 0;

    public void peek(){
        System.out.println(items.atIndex(count - 1));
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public int pop(){
        if (isEmpty()) throw new IllegalArgumentException();
        count--;
        int removed = items.atIndex(count);
        items.removeAt(count);
        return removed;
    }

    public void push(int item){
            count++;
            items.insert(item);
    }

    public Array getItems(){
        return items;
    }

}
