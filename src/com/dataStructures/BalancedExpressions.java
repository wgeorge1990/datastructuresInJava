package com.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpressions {

    private  List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
    private List<Character> rightBrackets = Arrays.asList(')', '>', ']', '}');

    //REFACTORED SOLUTION
    public boolean newIsBalancedExpression(){

        return false;
    }

    private boolean isLeftBracket(char c) {
        //If you create this way you cant pass args to construcor
//        ArrayList<Character> leftBrackets = new ArrayList();
        return leftBrackets.contains(c);
    }

    private boolean isRightBracket(char c) {
        return rightBrackets.contains(c);
    }

    private boolean bracketsMatch(char left, char right) {
//      return    (right == ')' && left != '(') ||
//                (right == '>' && left != '<') ||
//                (right == ']' && left != '[') ||
//                (right == '}' && left != '{');
      return rightBrackets.indexOf(right) != leftBrackets.indexOf(left);
    }

    //CLASSIC SOLUTION BASED ON MOST ALGORITHM BOOKS
    public boolean isBalancedExpression(String expression){
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
