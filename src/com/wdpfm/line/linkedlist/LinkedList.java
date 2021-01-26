package com.wdpfm.line.linkedlist;

/**
 * 描述:链表
 */

public class LinkedList<E> {
    private class Node {
        E e;
        Node next;

        public Node(E e,Node next){
            this.e=e;
            this.next=next;
        }

        public Node(E e){
            this(e,null);
        }

        public Node(){
            this(null,null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    //头结点
    private Node head;

    //链表长度
    private int size;

    public LinkedList(){
        head=null;
        size=0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    //查询指定索引的节点值
    public E get(int index){
        //检查index合法性
        if (index<0||index>=size)
            throw new IllegalArgumentException("索引异常");
        Node current=head;
        for (int i = 0; i < index; i++) {
            current=current.next;
        }
        return current.e;
    }

    public E getFirst(){
        return get(0);
    }

    public E getLast(){
        return get(size-1);
    }
}
