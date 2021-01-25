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

    //指定位置插入元素
    //时间复杂度O(n)
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

    //查询操作
    public int get(int index){
        if(index<0||index>=size)
            throw new IllegalArgumentException("索引异常");
        return data[index];
    }

    //查找操作 查找元素e所在的索引，如果元素e不存在，则返回-1
    public int find(int e){
        for (int i = 0; i < size; i++) {
            if (data[i]==e)
                return i;
        }
        return -1;
    }

    //判断是否存在
    public boolean contain(int target){
        for (int num:data){
            if (num==target)
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();//用于拼接字符串
        sb.append(String.format("数组大小:%d，数组容量:%d\n",size,capacity));
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i!=size-1)
                sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}
