package com.dataStructures;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.getItems().print();
    stack.pop();
    System.out.println(stack.isEmpty());
    stack.push(2345);
    stack.push(11111);
    stack.pop();
    stack.peek();


  }

}