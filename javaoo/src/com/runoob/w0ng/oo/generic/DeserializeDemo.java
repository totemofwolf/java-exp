package com.runoob.w0ng.oo.generic;

import com.runoob.w0ng.oo.virtual.Employee;
import sun.tools.java.ClassNotFound;

import java.io.*;

/**
 * Created by w0ng on 16/10/31.
 */
public class DeserializeDemo {

    public static void main(String args[]) {
        Employee e = null;

        try {
            FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            e = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
            return;
        }

        System.out.printf("Deserialized Employee...\n");
        System.out.printf("Name: " + e.getName() + "\n");
        System.out.printf("Address: " + e.getAddress() + "\n");
        System.out.printf("Number: " + e.getNumber() + "\n");
    }
}
