package com.wdpfm.line.stack;

import com.wdpfm.line.array.ArrayList;

/**
 * 描述:动态数组实现栈
 */
public class DynamicArrayStack<E> implements Stack<E> {
    private ArrayList<E> data;
    public DynamicArrayStack(int capacity){
        this.data=new ArrayList<>(capacity);
    }

    @Override
    public int getSize() {
        return data.getSize();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public void push(E e) {
        data.insertLast(e);
    }

    @Override
    public E pop() {
        return data.deleteLast();
    }

    @Override
    public E peek() {
        return data.getLast();
    }


    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("栈:[");
        for (int i = 0; i < data.getSize(); i++) {
            sb.append(data.get(i));
            if(i!=data.getSize()-1){
                sb.append(",");
            }
        }
        sb.append("] 栈顶");
        return sb.toString();
    }
}
