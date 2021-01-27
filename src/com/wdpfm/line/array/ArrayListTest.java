package com.wdpfm.line.array;

/**
 * 描述:测试类
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList();
        System.out.println(arrayList.isEmpty());
        arrayList.insertFirst(1);
        arrayList.insertLast(2);
        System.out.println(arrayList.isEmpty());
        arrayList.deleteElement(1);
        System.out.println(arrayList);

        ArrayList<String> arrayList1=new ArrayList();
        arrayList1.insertFirst("hello");
        arrayList1.insertLast("world");
        System.out.println(arrayList1);
    }
}
