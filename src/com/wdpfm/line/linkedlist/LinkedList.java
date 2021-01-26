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

    //修改指定索引的节点值
    public void update(int index,E e){//检查index合法性
        if (index<0||index>=size)
            throw new IllegalArgumentException("索引异常");
        Node current=head;
        for (int i = 0; i < index; i++) {
            current=current.next;
        }
        current.e=e;
    }

    //链表表头新增节点
    public void insertFirst(E e){
        Node newNode=new Node(e);
        newNode.next=head;
        head=newNode;
        //以上三行可合并为head=new Node(e,head);
        size++;
    }

    //链表表尾新增节点
    public void insertLast(E e){
        insert(size,e);
    }

    //指定索引插入新节点
    public void insert(int index,E e){
        if (index<0||index>size)
            throw new IllegalArgumentException("索引异常");
        if(index==0){
            insertFirst(e);
        }else{
            Node pre=head;
            for (int i = 0; i < index-1; i++) {
                pre=pre.next;
            }
            Node newNode=new Node(e);
            newNode.next=pre.next;
            pre.next=newNode;
            //以上三行可合并为pre.next=new Node(e,pre.next);
            size++;
        }
    }

    //删除链表头节点
    public E removeFirst(){
        if(head==null)
            return null;
        Node delNode=head;
        head=head.next;
        delNode.next=null;
        size--;
        return delNode.e;
    }
}
