package com.runoob.w0ng.oo.generic;

/**
 * Created by w0ng on 16/10/31.
 */
public class MaximumTest {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z)
    {
        T max = x;
        if ( y.compareTo(x) > 0) {
            max = y;
        }
        if ( z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String args[]) {
        System.out.printf("%d, %d 和 %d中最大的数为: %d\n\n", 3, 4, 5, maximum(3, 4, 5));

        System.out.printf("%.1f, %.1f 和 %.1f中最大的数为: %.1f\n\n", 3.1, 4.2, 5.1, maximum(3.1, 4.2, 5.1));

        System.out.printf("%s, %s 和 %s中最大的数为: %s\n", "pie", "apple", "orange", maximum("pie", "apple", "orange"));
    }
}
