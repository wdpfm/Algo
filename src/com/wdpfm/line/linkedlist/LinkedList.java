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
}
