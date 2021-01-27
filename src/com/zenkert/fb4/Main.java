package com.zenkert.fb4;

public class Main {
    public static void main(String[] args){
        Marble m1 = new Marble(2.0, 3.0, 0.0, 0.0);
        Marble m2 = new Marble(2.0, 0.0, 1.0, 2.0);
        boolean isColliding = Marble.collides(m1, m2);
        System.out.println(isColliding);
    }
}
