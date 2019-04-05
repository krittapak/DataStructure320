/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

/**
 *
 * @author KRITTAPAK
 */
public class RecursionEample {

    public static void main(String[] args) {
        int x = 3;
        System.out.println("s(" + x + ")=" + sum(x));
        System.out.println(x + "!=" + fact(x));
        System.out.println("binary of 16 = " + getBinary(16));
    }

    private static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return sum(n - 1) + n;
    }

    private static int fact(int x) {
        if (x <= 1) {
            return 1;
        }
        return x * fact(x - 1);
    }

    public static String getBinary(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n <= 1) {
            return "" + n;
        }
        return getBinary(n / 2) + (n % 2);
    }
}
