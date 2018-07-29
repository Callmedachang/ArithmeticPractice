package chapter1;

/**
 * Created by bighandsome on 2018/7/29.
 */
public class EuclidArithmetic {
    public static void main(String[] args) {
        System.out.println(GetMaxMode(36, 24));
    }

    public static int GetMaxMode(int a, int b) {
        if (b == 0) {
            return a;
        }
        int r = a % b;
        return GetMaxMode(b, r);
    }
}

