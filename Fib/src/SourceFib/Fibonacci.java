package SourceFib;

public class Fibonacci {

    public static long Fib(long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return (Fib(n - 2) + Fib(n - 1));
        }
    }

    public static long Fib2(long n, long liczba1, long liczba2) {
        if (n == 0) {
            return liczba2;
        } else {
            return Fib2(n - 1, liczba1 + liczba2, liczba1);
        }
    }

    public static long Fib3(long n) {
        long liczba1 = 0;
        long liczba2 = 1;
        int i = 0;

        long sum = 0;

        while (i < n) {
            sum = liczba1 + liczba2;
            liczba1 = liczba2;
            liczba2 = sum;

            i++;
        }
        return liczba1;
    }
}