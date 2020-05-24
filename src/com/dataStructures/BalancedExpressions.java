package com.dataStructures;

import java.util.Stack;

public class BalancedExpressions {

    //CLASSIC SOLUTION BASED ON MOST ALGORITHM BOOKS
    public static boolean isBalancedExpression(String expression){
        //solve with stack "((sbdks)[])"
        //iterate string and for each char
        // if (openingBracket) or (closedBracket) push onto stack
        // if anything else ignore
        Stack<Character> brackets = new Stack<>();
        for (char c: expression.toCharArray()){
            if(c == '(' || c == '<' || c == '[' || c =='{' ){
                brackets.push(c);
            }

            if(c == ')' || c == '>' || c == ']' || c =='}' ){
                if(brackets.empty()) return false;
                var top = brackets.pop();
                if (
                        (c == ')' && top != '(') ||
                        (c == '>' && top != '<') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')
                ) return false;
            }
        }
        return brackets.empty();
    }
}
