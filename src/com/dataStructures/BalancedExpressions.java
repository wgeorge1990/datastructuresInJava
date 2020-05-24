package com.dataStructures;

import java.util.Stack;

public class BalancedExpressions {
    public static boolean isBalancedExpression(String expression){
        //solve with stack "((sbdks)[])"
        //iterate string and for each char
        // if (openingBracket) or (closedBracket) push onto stack
        // if anything else ignore
        Stack<Character> brackets = new Stack<>();
        for (char c: expression.toCharArray()){
            if(c == '(' ){
                brackets.push(c);
            }
            if(c == ')'){
                if(brackets.empty()) return false;
                brackets.pop();
            }
        }
        return brackets.empty();
    }
}
