package com.cgmouse.rwobjects;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObjects {

    public static void main(String[] args) throws Exception {
        ObjectInputStream oStream = new ObjectInputStream(new FileInputStream("Objects.txt"));
        int oCount = 0;
        try {
            while (true) {
                System.out.println(oStream.readObject());
                oCount++;
            }
        } catch (EOFException e) {
            System.out.println("Total read " + oCount + " objects");
        }
    }

}
