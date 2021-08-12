package com.cgmouse.rwobjects;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class WriteObjects {

    public static void main(String[] args) throws IOException {
        ObjectOutputStream oStream = new ObjectOutputStream(new FileOutputStream("Objects.txt"));

        oStream.writeObject(new Animal("Cat", 1));
        oStream.writeObject(new Animal("Tiger", 90));
        oStream.writeObject(new Animal("Elephant", 1500));
        oStream.writeObject(new Animal("Cow", 700));

        System.out.println("Total 4 objects written to Objects.txt");
    }

}

class Animal implements Serializable {
    String name = "";
    int weight = 0;

    public Animal(String n, int w) {
        name = n;
        weight = w;
    }

    public String toString() {
        return (name + "  " + weight + " kg");
    }
}
