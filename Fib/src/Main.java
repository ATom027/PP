import SourceFib.Fibonacci;

class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(Fibonacci.Fib(50));
        System.out.println("Czas wykonania : " + (System.currentTimeMillis() - start) + " ms");
        start = System.currentTimeMillis();
        System.out.println(Fibonacci.Fib2(50, 1, 0));
        System.out.println("Czas wykonania : " + (System.currentTimeMillis() - start) + " ms");
        start = System.currentTimeMillis();
        System.out.println(Fibonacci.Fib3(50));
        System.out.println("Czas wykonania : " + (System.currentTimeMillis() - start) + " ms");
    }
}