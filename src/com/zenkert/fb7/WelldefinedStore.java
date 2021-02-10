package com.zenkert.fb7;

public class WelldefinedStore<E> extends Store<E> {

    public WelldefinedStore(int size) {
        super(size);
    }

    public void set(int pos, E item) {
        if (item == null){
            throw new RuntimeException("null cannot be stored");
        } else {
            super.set(pos, item);
        }

    }
    public static void main(String[]args){
        WelldefinedStore<String> z = new WelldefinedStore<String>(4);
        z.set(1, "random string");

        z.set(2, null);
    }
}
