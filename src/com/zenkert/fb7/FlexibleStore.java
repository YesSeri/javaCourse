package com.zenkert.fb7;

public class FlexibleStore<E> extends WelldefinedStore<E> {
    private int currentSize;

    public FlexibleStore(int size) {
        super(size);
        this.currentSize = size;
    }
    public boolean inUse(int index){
        if (get(index) != null){
            return true;
        }
        return false;
    }

    public E get(int pos) {
        if (pos >= currentSize){
            throw new RuntimeException("illegal access");
        }
        return super.get(pos);
    }

    public void remove(int pos){
        int arr_idx = 0;
        E[] store = (E[]) new Object[size];
        E[] newStore = (E[]) new Object[size-1];
        for (int i =0; i < size; i++){
            store[i] = get(i);
        }

        for(int i = 0; i < store.length; i++){
            if (i != pos){
                newStore[arr_idx] = store[i];
                arr_idx++;
            }
        }
        currentSize--;
        for (int i =0; i < currentSize; i++) {
            set(i, newStore[i]);
        }
    }

    public static void main(String[]args){
        FlexibleStore<String> z = new FlexibleStore<String>(5);
        z.set(0, "1 string");
        z.set(1, "2 string");
        z.set(2, "3 string");
        z.set(3, "4 string");
        z.set(4, "5 string");
        System.out.println(z.currentSize);
        System.out.println(z);
        z.remove(3);
        System.out.println(z.currentSize);
        System.out.println(z);
        System.out.println(z.get(1));
        System.out.println(z.get(4));

    }
}
