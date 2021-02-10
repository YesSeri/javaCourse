package com.zenkert.fb7;

import java.util.Arrays;

public class Store<E> {
    private E store[];
    protected int size;

    public Store(int size) {
        this.size = size;
        store = (E[]) new Object[size];
    }

    public void set(int pos, E item) {
        store[pos] = item;
    }

    public E get(int pos) {
        return store[pos];
    }

    public String toString() {
        String s = "[";
        for (int i = 0; i < store.length; i++){
            if (store[i] == null){
                s += "(null)";
            } else {
                s += store[i];
            }
            if (i == store.length - 1){
                s += "]";
            } else{
                s += ", ";

            }
        }
        return s;
    }
    public static void main(String[]args){
        Store<String> s = new Store<String>(3);
        s.set(1, "Hejsan!");
        System.out.println(s.toString());
    }
}
