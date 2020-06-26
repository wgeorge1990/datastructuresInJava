package com.dataStructures;

public class Main {
  public static void main(String[] args) {
    //ArrayQueue (ArrayDeque)
//    ArrayQueue queue = new ArrayQueue(5);
//    queue.enqueue(10);
//    queue.enqueue(20);
//    queue.enqueue(30);
//    queue.enqueue(40);
//    System.out.println(queue.toString());
      QueueTwoStack qts = new QueueTwoStack();
      qts.enqueue(1);
      qts.enqueue(23);
      qts.enqueue(3425);
      qts.enqueue(234623251);
      var first = qts.dequeue();
      var second = qts.dequeue();
      System.out.println(first);
      System.out.println(second);
      System.out.println(qts.peek());
      System.out.println(qts.peek());
  }

}