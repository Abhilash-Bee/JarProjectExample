package com.java.jar;

public class Series {

    public static int nSum(int n) {
        int sum = 0;
        for(int i=0; i<=n; i++)
            sum += i;

        return sum;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i=1; i<=n; i++)
            fact = fact * i;

        return fact;
    }

    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        if (n == 0)
            return a;
        else if (n == 1)
            return b;
        else {
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
        }
        return c;
    }

}
