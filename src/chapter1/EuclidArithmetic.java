package chapter1;

/**
 * Created by bighandsome on 2018/7/29.
 */
public class EuclidArithmetic {
    public static void main(String[] args) {
//        a:36
//        b:24
//        r:12
//        a:24
//        b:12
//        r:0
        System.out.println(GetMaxMode(36, 24));
//        a:105
//        b:24
//        r:9
//        a:24
//        b:9
//        r:6
//        a:9
//        b:6
//        r:3
//        a:6
//        b:3
//        r:0
        System.out.println(GetMaxMode(105, 24));
        System.out.println(GetMaxMode(1111111, 1234567));
    }

    //求最大公约数(欧几里得算法)
    public static int GetMaxMode(int a, int b) {
        if (b == 0) {
            return a;
        }
        int r = a % b;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("r:" + r);
        return GetMaxMode(b, r);
    }
}

