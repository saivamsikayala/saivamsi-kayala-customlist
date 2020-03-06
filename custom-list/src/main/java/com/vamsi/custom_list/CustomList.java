package com.vamsi.custom_list;

import java.util.Arrays;

public class CustomList<E> 
{
    private int size = 0;
    private static final int def_cap = 10;
    private Object arr[];
    public CustomList() {
        arr = new Object[def_cap];
    }
    public void add(E e) {
        if (size == arr.length) {
            changeCap();
        }
        arr[size++] = e;
    }
    @SuppressWarnings("unchecked")
    public E get(int i) {
        if (i>=size || i<0) {
            throw new IndexOutOfBoundsException("Index: "+i+", Size "+i);
        }
        return (E) arr[i];
    }
    @SuppressWarnings("unchecked")
    public E remove(int i) {
        if (i>=size || i<0) {
            throw new IndexOutOfBoundsException("Index: "+i+", Size "+i);
        }
        Object item = arr[i];
        int no_ele = arr.length-(i+1);
        System.arraycopy(arr,i+1,arr,i,no_ele);
        size--;
        return (E) item;
    }
    public int size() {
        return size;
    }
    @Override
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(arr[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
     
    private void changeCap() {
        int newSize = arr.length * 2;
        arr = Arrays.copyOf(arr, newSize);
    }
}