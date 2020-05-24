package com.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
      LinkedList list = new LinkedList();
      list.addFirst(30);
      list.addFirst(20);
      list.addFirst(10);
      list.addFirst(5);
      Arrays.toString(list.toArray());
      System.out.println(Arrays.toString(list.toArray()));
    }
}
