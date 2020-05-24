package com.dataStructures;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
      LinkedList list = new LinkedList();
      list.addFirst(30);
      list.addFirst(20);
      list.addFirst(10);
      list.addFirst(5);
      list.addFirst(4);
      list.addFirst(3);
      list.addFirst(2);
      list.addFirst(1);


      list.getKthFromTheEnd(2 );
      list.printMiddle();


      //list.reverse();
      //Arrays.toString(list.toArray());
      //System.out.println(Arrays.toString(list.toArray()));
      //reverses list in place
      //System.out.println(Arrays.toString(list.reverse().toArray()));





    }
}
