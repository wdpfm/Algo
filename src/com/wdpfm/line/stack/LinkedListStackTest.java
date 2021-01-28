package com.wdpfm.line.stack;

/**
 * 描述:
 */
public class LinkedListStackTest {
    public static void main(String[] args) {
        Stack<Integer> stack=new LinkedListStack<>();
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
