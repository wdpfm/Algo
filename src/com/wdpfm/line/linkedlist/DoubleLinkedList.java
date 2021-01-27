package com.wdpfm.line.linkedlist;

import java.util.NoSuchElementException;

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

    //找到指定索引所在节点的元素值
    //时间复杂度O(n)
    public E get(int index){
        Node node=node(index);
        if(node==null)
            throw new IllegalArgumentException("索引异常");
        return node(index).e;
    }

    //时间复杂度O(1)
    public E getFirst() {
        return first.e;
    }

    //时间复杂度O(1)
    public E getLast() {
        return last.e;
    }

    //获取指定索引节点
    //时间复杂度O(n)
    private Node node(int index){
        if (index<0||index>=size)
            return null;
        Node current;
        if(index<size/2){
            current=first;//从前找
            for (int i = 0; i < index; i++) {
                current=current.next;
            }
        }else{
            current=last;//从后找
            for (int i = 0; i < size-index-1; i++) {
                current = current.pre;
            }
        }
        return current;
    }

    //时间复杂度O(n)
    public void update(int index,E e){
        Node node=node(index);
        if(node==null)
            throw new IllegalArgumentException("参数异常");
        node.e=e;
    }

    //双向链表表头插入新节点
    //时间复杂度O(1)
    public void insertFirst(E e){
        Node newNode=new Node(e);
        if(first==null){
            //空链表
            first=newNode;
            last=newNode;
        }else{
            newNode.next=first;
            first.pre=newNode;
            first=newNode;
        }
        //first=newNode;公共部分提取出来简化代码
        size++;
    }

    //双向链表表尾插入新节点
    //时间复杂度O(1)
    public void insertLast(E e){
        Node newNode=new Node(e);
        if(first==null){
            //空链表
            first=newNode;
            last=newNode;
        }else{
            newNode.pre=last;
            last.next=newNode;
            last=newNode;
        }
        size++;
    }

    //双向链表插入中间节点
    //时间复杂度O(n)
    public void insert(int index,E e){
        if(index<0||index>size)
            throw new IllegalArgumentException("索引异常");
        if (index==0){
            insertFirst(e);
        }else if(index==size){
            insertLast(e);
        }else{
            Node oldNode=node(index);//当前节点
            Node preNode=oldNode.pre;//前一个节点
            Node newNode=new Node(e);//新节点
            preNode.next=newNode;
            newNode.pre=oldNode;
            newNode.next=oldNode;
            oldNode.pre=newNode;
            size++;
        }
    }

    ///删除双向链表头节点
    //时间复杂度O(1)
    public E deleteFirst(){
        if(first==null)
            throw new NoSuchElementException();
        E e=first.e;
        Node next=first.next;
        if(next==null){
            //链表仅有一个节点
            first=null;
            last=null;
        }else{
            first.next=null;
            next.pre=null;
            first=next;
        }
        size--;
        return e;
    }

    //删除双向链表尾结点
    //时间复杂度O(1)
    public E deleteLast(){
        if(last==null)
            throw new NoSuchElementException();
        E e=last.e;
        Node pre= last.pre;
        if(pre==null){
            //链表仅有一个节点
            first=null;
            last=null;
        }else{
            last.pre=null;
            pre.next=null;
            last=pre;
        }
        size--;
        return e;
    }

    //双向链表删除中间节点
    //时间复杂度O(n)
    public E delete(int index){
        if(index<0||index>=size)
            throw new IllegalArgumentException("索引异常");
        if (index == 0) {
            deleteFirst();
        }else if (index==size-1){
            deleteLast();
        }
        Node delNode=node(index);
        E e=delNode.e;

        //将删除节点的前后节点连接起来
        Node pre=delNode.pre;
        Node next=delNode.next;

        //将删除节点从链表中断开
        delNode.pre=null;
        delNode.next=null;

        pre.next=next;
        next.pre=pre;
        size--;
        return e;
    }
}
