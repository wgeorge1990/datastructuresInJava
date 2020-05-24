package com.dataStructures;

public class Main {

  public static void main(String[] args) {
    System.out.println(BalancedExpressions.isBalancedExpression("(william)"));
    System.out.println(BalancedExpressions.isBalancedExpression("((william))"));
    System.out.println(BalancedExpressions.isBalancedExpression("(((william))"));
    System.out.println(BalancedExpressions.isBalancedExpression(")william)"));
    System.out.println(BalancedExpressions.isBalancedExpression(")william("));

  }

}