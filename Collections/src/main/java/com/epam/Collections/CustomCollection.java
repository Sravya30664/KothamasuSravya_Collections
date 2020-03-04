package com.epam.Collections;
import java.util.*;
public class CustomCollection<Col> {
	private int size = 0;
    private static final int CAPACITY = 10;
    private Object elements[];
    public CustomCollection() {
        elements = new Object[CAPACITY];
        for(int i=0;i<10;i++)
        {
        	elements[size++] = i+1;
        }
    }
    public void add(Col c) {
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size++] = c;
    }
    public Col  retrieve(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (Col)elements[i];
    }
    public Col remove(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = elements[i];
        int numElts = elements.length - ( i + 1 ) ;
        System.arraycopy( elements, i + 1, elements, i, numElts ) ;
        size--;
        return (Col) item;
    }
    
    public int size() {
        return size;
    }
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         for(int i = 0; i < size ;i++) {
             sb.append(elements[i].toString());
             if(i<size-1){
                 sb.append(" ");
             }
         }
         return sb.toString();
    }
     
    private void increaseCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

}
