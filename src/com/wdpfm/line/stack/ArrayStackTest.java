package com.wdpfm.line.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 描述:
 */
public class ArrayStackTest {
    public static void main(String[] args) {
        //Stack<Integer> stack = new ArrayStack<>(5);
        Stack<Integer> stack = new DynamicArrayStack<>(5);
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
