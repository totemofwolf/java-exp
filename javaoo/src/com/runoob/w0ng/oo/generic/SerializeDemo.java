package com.runoob.w0ng.oo.generic;

import com.runoob.w0ng.oo.virtual.Employee;

import java.io.*;

/**
 * Created by w0ng on 16/10/31.
 */
public class SerializeDemo {

    public static void main(String args[]) {
        Employee e = new Employee("Reyanlee", "Beijing", 101);
//        序列化对象,需要类implements java.io.Serializable

        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(e);
            out.close();
            fileOut.close();

            System.out.printf("Serialized data is saved in /tmp/employee.ser \n");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

}
