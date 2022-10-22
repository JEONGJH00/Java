package test01;

import java.util.Arrays;

public class T21 {
    public static void main(String[] args) {
        String[][] s = new String[4][];
        s[0] = new String[] { "a", "b", "c" };
        s[1] = new String[] { "1", "2", "3", "4", "5" };
        s[3] = new String[] { "가" };

        for (String[] a : s)
            System.out.println(Arrays.toString(a));
    }
}