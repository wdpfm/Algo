package com.wdpfm.line.linkedlist;

/**
 * 描述:链表测试类
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insertLast(5);
        System.out.println(linkedList);

        linkedList.insertFirst(10);
        System.out.println(linkedList);

        linkedList.insert(2, 34);
        System.out.println(linkedList);

        System.out.println(linkedList.get(1));

        linkedList.insertFirst(50);
        System.out.println(linkedList);


        linkedList.remove(2);
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);


        linkedList.removeLast();
        System.out.println(linkedList);
    }
}
