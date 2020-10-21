package math;

public class PolarComplex {
    public static double modul = 0.0;
    public static double angle = 0.0;

    public static void ComplexTry(Complex x){
        modul = Math.sqrt(Math.pow(x.re,2)+Math.pow(x.im,2));

        angle = Math.atan2(x.im, x.re);
    }
    public static void ComplexTry(double x, double y){
        modul = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));

        angle = Math.atan2(y,x);
    }
}