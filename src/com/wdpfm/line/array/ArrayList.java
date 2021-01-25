package com.wdpfm.line.array;

/**
 * 描述:封装数组常用操作
 */
public class ArrayList {
     private int[] data;//数组
     private int capacity;//容量
     private int size;//存储的元素个数

    public ArrayList(int capacity){
        this.data=new int[capacity];
        this.capacity=capacity;
        this.size=0;
    }

    public ArrayList(){
        this(10);
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int getSize(){
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    //插入操作
    public void insert(int index,int e){
        if (size==data.length)
            throw new IllegalArgumentException("插入失败，数组已满");
        if (index<0||index>size){
            throw new IllegalArgumentException("索引异常");
        }
        //数组后移
        for (int i = size-1; i >= index ; i--) {
            data[i+1]=data[i];
        }
        data[index]=e;
        size++;
    }

    //头插
    public void insertFirst(int e){
        insert(0,e);
    }

    //尾插
    public void insertLast(int e){
        insert(size,e);
    }
}
