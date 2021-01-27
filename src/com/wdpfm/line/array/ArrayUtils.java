package com.wdpfm.line.array;

/**
 * 描述:数组工具类
 */
public class ArrayUtils {
    //将指定的元素插入到指定数组的指定位置上
    //时间复杂度O(n)
    //空间复杂度O(n)
    public static int[] insertElement(int[] src,int index,int element){
        int length=src.length;
        //创建比原数组大1的新数组
        int[] dest=new int[length+1];

        //前面部分复制到新数组
        for (int i = 0; i < index; i++) {
            dest[i]=src[i];
        }

        //新元素复制到新数组
        dest[index]=element;

        //后面部分复制到新数组
        for (int i = index; i < length; i++) {
            dest[i+1]=src[i];
        }
        return dest;
    }

    //从数组中删除指定位置的元素
    //时间复杂度O(n)
    //空间复杂度O(n)
    public static int[] deleteElement(int[] src,int index){
        int length=src.length;
        //创建比原数组小1的新数组
        int[] dest=new int[length-1];

        //前面部分复制到新数组
        for (int i = 0; i < index; i++) {
            dest[i]=src[i];
        }

        //后面部分复制到新数组
        for (int i = index; i < src.length -1; i++) {
            dest[i]=src[i+1];
        }
        return dest;
    }
}
