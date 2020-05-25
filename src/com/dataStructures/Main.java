package com.dataStructures;

public class Main {

  public static void main(String[] args) {
    BalancedExpressions be = new BalancedExpressions();
    System.out.println(be.isBalancedExpression("(william)")); //true
    System.out.println(be.isBalancedExpression("(william)")); //true
    System.out.println(be.isBalancedExpression("((william))")); //true
    System.out.println(be.isBalancedExpression("(((william))")); //false
    System.out.println(be.isBalancedExpression(")william)")); //false
    System.out.println(be.isBalancedExpression(")william(")); //false
    System.out.println(be.isBalancedExpression("{[[asdfasdf]]}")); //true

  }

}