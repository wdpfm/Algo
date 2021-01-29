package com.wdpfm.leetcode;

import java.util.Stack;

/**
 * 描述:给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 */
public class lc20 {
    public static void main(String[] args) {
        System.out.println(isValid("{}("));
    }

    private static boolean isValid(String s) {
        if (s == null)
            return true;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                //如果是左括号，则直接入栈
                stack.push(c);
            } else {
                //如果栈空 直接返回false
                if (stack.isEmpty())
                    return false;
                //判断栈顶元素是否等于左括号对应的右括号
                char topElement = stack.pop();
                char matched;
                if (c == ')')
                    matched = '(';
                else if (c == ']')
                    matched = ']';
                else
                    matched = '{';

                if (matched != topElement)
                    return false;
            }
        }
        //如果栈不为空，name也算没有匹配好
        return stack.isEmpty();
    }
}

