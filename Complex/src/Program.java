import math.*;

public class Program {

    public static void main(String[] args) {
        Complex z = new Complex();
        z.re = 1;
        z.im = 2;

        Complex c = new Complex();
        c.re = 3;
        c.im = 4;

        Complex w = Complex.add(z, c);
        System.out.println(w.re+" "+w.im+"j");

        w = Complex.sub(z, c);
        System.out.println(w.re+" "+w.im+"j");

        w = Complex.mul(z, c);
        System.out.println(w.re+" "+w.im+"j");

        w = Complex.div(z, c);
        System.out.println(w.re+" "+w.im+"j");
    }
}