package com.zenkert.lab1part1;

public class Main {
    /**
     * This is a test of javadocs documentation. Collatz conjecture.
     * @param args
     *  The input should be two int values. Only case 3 need the 2nd argument, for the others one argument is enough
     */
    public static void main(String[] args) {
        int argOne = Integer.parseInt(args[0]);
        int argTwo = Integer.parseInt(args[1]);
        System.out.printf("argOne: %d, argTwo: %d\n", argOne, argTwo);
        int n = 6;

        switch (n){
            case 1:
                taskOne(argOne);
                break;
            case 2:
                taskTwo(argOne);
                break;
            case 3:
                taskThree(argOne, argTwo);
                break;
            case 4:
                taskFour(argOne);
                break;
            case 6:
                taskSix(argOne);
                break;
            default:
                try {
                    throw new Exception("the value of n is invalid. 1-4, and 6 are valid. ");
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
    }

    static void taskOne(int arg) {
        System.out.println(LifeLength.f1(arg));
    }

    static void taskTwo(int arg) {
        int a1 = LifeLength.f1(arg);
        int a2 = LifeLength.f2(arg);
        int a4 = LifeLength.f4(arg);
        int a8 = LifeLength.f8(arg);
        int a16 = LifeLength.f16(arg);
        int a32 = LifeLength.f32(arg);
        System.out.printf("f1=%d f2=%d f4=%d f8=%d f16=%d f32=%d\n",
                a1, a2, a4, a8, a16, a32);

    }

    static void taskThree(int argOne, int argTwo) {

        int a0 = 3; int n = 5;
        System.out.printf("a0=%d, f%d=%d\n",a0, n, LifeLength.iterateF(a0, n));

        a0=1; n=3;
        System.out.printf("a0=%d, f%d=%d\n",a0, n, LifeLength.iterateF(a0, n));

        a0=42; n=3;
        System.out.printf("a0=%d, f%d=%d\n",a0, n, LifeLength.iterateF(a0, n));

//        System.out.printf("f%d=%d\n", argTwo, LifeLength.iterateF(argOne, argTwo));
    }

    static void taskFour(int arg) {
        for (int i = 1; i <= 15; i++) {
            System.out.printf("Itr method - Lifelength of %d is %d\n", i, LifeLength.iterLifeLength(i));
        }
    }
    static void taskSix(int arg) {
        for (int i = 1; i <= 15; i++) {
            System.out.printf("Rec method - Lifelength of %d is %d\n", i, LifeLength.recLifeLength(i));
        }
    }
}
