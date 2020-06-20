package com.dataStructures;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {
    Queue<Integer> q = new ArrayDeque<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    System.out.println(q);
    reverse(q);
  }

  public static void reverse(Queue<Integer> q){
    //  add // remove // isEmpty
    //[ 10, 20, 30 ]
    java.util.Stack<Integer> stack = new java.util.Stack<Integer>();

    while (!q.isEmpty()){
      stack.push(q.remove());
    }

    while (!stack.isEmpty())
      q.add(stack.pop());
    System.out.println(q.toString());
  }

}