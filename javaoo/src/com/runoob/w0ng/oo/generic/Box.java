package com.runoob.w0ng.oo.generic;

/**
 * Created by w0ng on 16/10/31.
 */
public class Box<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String args[]) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("noob"));

        System.out.printf("整数: %d\n", integerBox.get());
        System.out.printf("字符串为: %s\n", stringBox.get());
    }
}
