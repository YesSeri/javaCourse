package com.zenkert.lab1part2;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        // Task 9
        double x = 1.5;
        for (int k = 1; k <= 15; k++) {
            Raise.recRaiseHalf(x, k);
            Raise.recRaiseOne(x, k);
            System.out.printf("Raise half executed: %d times\nRaise one executed: %d times\n",
                    Raise.recHalfCounter, Raise.recOneCounter);
        }
        createDataForGraph();
    }


    static void createDataForGraph() {
//         Problem 10, question 2
        double x = 1.01;
//        String fileName = "./lab1part2docs/dataRec.csv";
//        createFile(fileName);
//        writeToFile("k,halfCounter,oneCounter,x=" + x + "\n", fileName);
        int prevRecHalfCounter = 0;
        for (int k = 1; k <= 20; k++) {
            Raise.runBoth(x, k);
            int counter = Raise.recHalfCounter;
            System.out.println("k: " + k + ", counter:" + counter + ", counter - prevCounter:" + (counter - prevRecHalfCounter));
            prevRecHalfCounter = counter;
//            writeToFile(k + "," + Raise.recHalfCounter + "," + Raise.recOneCounter + '\n', fileName);
        }
        System.out.println("Finished");
    }

    static void createFile(String filename) {
        try {
            File myObj = new File(filename);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                throw new Exception("Please delete file first");
            }
        } catch (Exception e) {
            System.out.println("An error occurred." + e);
            e.printStackTrace();
        }
    }

    static void writeToFile(String data, String fileName) {
        try {
            FileWriter myWriter = new FileWriter(fileName, true);
            myWriter.write(data);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }
}
