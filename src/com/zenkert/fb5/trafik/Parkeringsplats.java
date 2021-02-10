package com.zenkert.fb5.trafik;

public class Parkeringsplats {
    private static int nextId = 0;
    int myId;

    private boolean isUpptagen = false;
    public Parkeringsplats(){
        myId = nextId;
        nextId++;
    }
    boolean upptagen(){
        return isUpptagen;
    }
//    void parkeraPå(Bil bil){
//        isUpptagen = true;
//    }
    void lämna(){
        isUpptagen = false;
    }
    int nummer(){
        return myId;
    }
}
