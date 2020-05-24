package com.dataStructures;

import java.util.Stack;

public class ReverseString {
    public static String reverseString(String word) {
        if (word == null) throw new IllegalArgumentException();
//    Stack<Character> reversedStack = new Stack<>();
//      for (int i = word.length() - 1; i >= 0; i--){
//        reversedStack.push(word.charAt(i));
//      }
//    System.out.println(reversedStack);
//  }

        // or

        Stack<Character> reversedStack = new Stack<>();
        for (char ch : word.toCharArray())
            reversedStack.push(ch);

        StringBuffer reversed = new StringBuffer();

        while( !reversedStack.empty())
            reversed.append(reversedStack.pop());

//    System.out.println(reversedStack);
//    System.out.println(reversed);
        return reversed.toString();

    } // ReverseString() end
}
