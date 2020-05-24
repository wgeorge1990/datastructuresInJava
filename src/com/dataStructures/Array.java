package com.dataStructures;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public int indexOf(int item){
        // if we find return index
        // else return -1
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        return -1;
    }

    public int max(){
        var max = 0;
        for (int i = 0; i < count; i++)
            if(items[i] > max)
                max = items[i];
        return max;
    }

    public Array intersect(Array a){
        Array matches = new Array(a.length());
        for (int i = 0; i < count; i++){
            for (int y = 0; a.length() < y; y++ ){
                if(items[i] == a.atIndex(y)){
                    matches.insert(items[i]);
                }
            }
        }
        return matches;
    };

    public void reverse(){
        for (int i = 0; i < count; i++){
            items[0] = items[count - 1];
        }
    }

    public int atIndex(int index){
        return items[index];
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for ( int i = 0; i < count; i++ ){
                newItems[i] = items[i];
            }
            System.out.println("new items");
            System.out.println(newItems.toString());
            items = newItems;
        }
        items[count] = item;
        count++;
    }

    public int length(){
        return items.length;
    }

    public void print() {
       for (int i = 0; i < items.length; i++) {
           System.out.println(items[i]);
       }
    }

    public void removeAt(int index) {
        //validate index
        if (index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        //shift items to left to fill hole
        for (int i = index; i < count; i++){
            items[i] = items[i + 1];
        }
        count --;
    }



}
