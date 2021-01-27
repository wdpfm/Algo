package com.wdpfm.line.array;

/**
 * 描述:数组扩容测试类
 */
public class ArrayTest {
    public static void main(String[] args) {
        ArrayList<Integer> data=new ArrayList<>(7);
        data.insertLast(61);
        data.insertLast(24);
        data.insertLast(61);
        data.insertLast(12);
        data.insertLast(85);
        data.insertLast(37);
        data.insertLast(83);
        System.out.println(data);
        data.insertLast(15);
        System.out.println(data);
        data.deleteLast();
        data.deleteLast();
        data.deleteLast();
        System.out.println(data);
    }
}
