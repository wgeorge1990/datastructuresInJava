package com.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpressions {

    private static List<Character> leftBrackets;
    private static List<Character> rightBrackets;

    //REFACTORED SOLUTION
    public static boolean newIsBalancedExpression(){

        return false;
    }

    private static boolean isLeftBracket(char c) {
        //If you create this way you cant pass args to construcor
//        ArrayList<Character> leftBrackets = new ArrayList();

        leftBrackets = Arrays.asList('(', '<', '[', '{');
        return leftBrackets.contains(c);
    }

    private static boolean isRightBracket(char c) {
        rightBrackets = Arrays.asList(')', '>', ']', '}');
        return rightBrackets.contains(c);
    }

    private static boolean bracketsMatch(char left, char right) {
      return    (right == ')' && left != '(') ||
                (right == '>' && left != '<') ||
                (right == ']' && left != '[') ||
                (right == '}' && left != '{');
    }

    //CLASSIC SOLUTION BASED ON MOST ALGORITHM BOOKS
    public static boolean isBalancedExpression(String expression){
        //solve with stack "((sbdks)[])"
        //iterate string and for each char
        // if (openingBracket) or (closedBracket) push onto stack
        // if anything else ignore

        Stack<Character> brackets = new Stack<>();
        for (char c: expression.toCharArray()){
            if(isLeftBracket(c)){ brackets.push(c); }
            if(isRightBracket(c)){
                if(brackets.empty()) return false;
                var top = brackets.pop();
                if (bracketsMatch(top, c)) return false;
            }
        }
        return brackets.empty();
    }
}
