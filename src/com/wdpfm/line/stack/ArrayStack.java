package com.wdpfm.line.stack;

import java.util.NoSuchElementException;

/**
 * 描述:java内置静态数组实现栈 缺点：数组一旦初始化容量固定
 */
public class ArrayStack<E> implements Stack<E>{
    private E[] data;
    private int size;
    public ArrayStack(int capacity){
        data=(E[])new Object[capacity];
        this.size=0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void push(E e) {
        if(size==data.length){
            throw new RuntimeException("栈满");
        }
        data[size]=e;
        size++;
    }

    @Override
    public E pop() {
        if(isEmpty()){
            throw new NoSuchElementException("栈空");
        }
        E ret=data[size-1];
        size--;
        return data[size-1];
    }

    @Override
    public E peek() {
        if(isEmpty()){
            throw new NoSuchElementException("栈空");
        }
        return data[size-1];
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("栈:[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if(i!=size-1){
                sb.append(",");
            }
        }
        sb.append("] 栈顶");
        return sb.toString();
    }
}
