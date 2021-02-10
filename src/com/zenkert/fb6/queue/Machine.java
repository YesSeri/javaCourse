package com.zenkert.fb6.queue;

public class Machine {
    int nextNumber = 1;
    static int nextId = 1;
    int myId;
    public Machine(){
        myId = nextId;
        nextId++;
    }
    int nextNum(){
        return nextNumber++;
    }
}
