package com.wdpfm.line.linkedlist;

/**
 * 描述:双向链表
 */
public class DoubleLinkedList<E>{
    private class Node {
        E e;
        Node pre;
        Node next;

        public Node(Node pre,E e,Node next){
            this.pre=pre;
            this.e=e;
            this.next=next;
        }

        public Node(E e){
            this(null,e,null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
    private Node first;
    private Node last;
    private int size;

    public DoubleLinkedList(){
        first=null;
        last=null;
        size=0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }
}
