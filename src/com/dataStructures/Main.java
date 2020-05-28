package com.dataStructures;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Stack stack = new Stack();
    stack.bPush(10);
    stack.bPush(20);
    stack.bPush(30);
    System.out.println(stack);

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.print();
  }

}