package com.wdpfm.line.array;

/**
 * 描述:测试类
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        System.out.println(arrayList.isEmpty());
        arrayList.insertFirst(1);
        arrayList.insertLast(2);
        System.out.println(arrayList.isEmpty());
        arrayList.removeElement(1);
        System.out.println(arrayList);

    }
}
