package com.zenkert.fb5.trafik;

/**
 * @author Henrik Zenkert
 * This class handles intersections. You can get current intersection id, and the id of the next intersection.
 */
public class TX {
    private static int nextId = 0;
    private int id;
    private TX left, middle, right;

    public TX() {
        id = nextId;
        left = this;
        middle = this;
        right = this;
        nextId++;
    }

    public void connect(TX left, TX middle, TX right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    public void connect(TX left, TX middle) {
        this.left = left;
        this.middle = middle;
    }

    public void connect(TX left) {
        this.left = left;
    }

    public TX getLeft() {
        return left;
    }

    public TX getMiddle() {
        return middle;
    }

    public TX getRight() {
        return right;
    }


    public String toString() {
        return "Id: " + id + " - leftId: " + left.id + " - rightId: " + right.id + " - middleId: " + middle.id;
    }

    public static void main(String[] args) {
        TX obj1 = new TX();
        System.out.println(obj1);
        TX obj2 = new TX();
        TX obj3 = new TX();
        TX obj4 = new TX();
        obj1.connect(obj2, obj3, obj4);
        System.out.println(obj2);
        System.out.println(obj1.left);

    }
}
