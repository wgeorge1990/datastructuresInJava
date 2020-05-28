package com.dataStructures;

import java.util.Arrays;

public class Stack {
    private Array items = new Array(3);
    private int count = 0;
    private int bCount = 0;
    private int[] bItems = new int[3];

    public void peek(){
        if (count == 0)
            System.out.println("Stack is Empty");
        else
            System.out.println(items.atIndex(count - 1));
    }

    public void bPeek(){
        if (bCount == 0)
            System.out.println("BStack is Empty");
        else
            System.out.println(bItems[count - 1]);
    }

    public boolean isEmpty(){
        return count == 0;
    }
    public boolean isBEmpty(){
        return bCount == 0;
    }

    public void pop(){
        if (isEmpty()) throw new IllegalStateException();
        count--;
        int removed = items.atIndex(count);
        items.removeAt(count);
    }

    public void bPop(){
        if (bItems.length == 0) throw new IllegalStateException();
        bCount--;
        int bRemoved = bItems[count];
        bItems[count] = 0;
    }

    public void push(int item){
            count++;
            items.insert(item);
    }

    public void bPush(int item){
        var newBItems = new int[count * 2];
        if (count > bItems.length){
            for (int i = 0; i < bItems.length; i++){
                newBItems[i] = bItems[i];
            }
            bItems = newBItems;
            bItems[count - 1] = item;
        } else
            bItems[bCount] = item;
        bCount++;
    }

    public void print(){
        for (int i = 0; i < items.length(); i++){
            System.out.print(bItems[i] + " ");
        }
    }

    @Override
    public String toString(){
        var content = Arrays.copyOfRange(bItems, 0, bCount);
        return Arrays.toString(content);
    }

}
