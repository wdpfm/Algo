package com.wdpfm.line.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * 描述:Java内置栈
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        System.out.println(stack);
        stack.push(20);
        System.out.println(stack);
        stack.push(30);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
