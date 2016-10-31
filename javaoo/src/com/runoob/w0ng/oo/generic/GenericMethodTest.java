package com.runoob.w0ng.oo.generic;

/**
 * Created by w0ng on 16/10/31.
 */
//所有泛型方法声明都有一个类型参数声明部分（由尖括号分隔），该类型参数声明部分在方法返回类型之前（在下面例子中的<E>

public class GenericMethodTest {

    public static <E> void printArray(E[] inputArray)
    {
        for (E element : inputArray) {
            System.out.printf("%s\t", element);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer[] intArray =  { 1, 2, 3, 4,5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("整型数组元素为:");
        printArray(intArray);

        System.out.println("双精度型数组元素为:");
        printArray(doubleArray);

        System.out.println("字符串型数组元素为:");
        printArray(charArray);
    }
}
