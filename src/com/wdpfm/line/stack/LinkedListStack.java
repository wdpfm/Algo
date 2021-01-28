package com.wdpfm.line.stack;

import com.wdpfm.line.linkedlist.LinkedList;

/**
 * 描述:链表实现栈
 */
public class LinkedListStack<E> implements Stack<E> {
    private LinkedList<E> linkedList;
    public LinkedListStack(){
        linkedList=new LinkedList<>();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public void push(E e) {
        linkedList.insertFirst(e);
    }


    @Override
    public E pop() {
        return linkedList.deleteFirst();
    }

    @Override
    public E peek() {
        return linkedList.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("栈:[");
        //从链表表尾获取数据
        for (int i = linkedList.getSize()-1 ;i >=0; i--) {
            sb.append(linkedList.get(i));
            if(i!=0){
                sb.append(",");
            }
        }
        sb.append("] 栈顶");
        return sb.toString();
    }
}
