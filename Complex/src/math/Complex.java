package math;

public class Complex {
    public double re;
    public double im;

    //Pobranie 2 obiektów typu Complex i ich zsumowanie
    public static Complex add(Complex c1, Complex c2) {
        Complex result = new Complex();
        result.re = c1.re + c2.re;
        result.im = c1.im + c2.im;
        return result;
    }

    //Pobranie 2 obiektów typu Complex i zmniejszenie wartosci pierwszej o wartosci drugiej
    public static Complex sub(Complex c1, Complex c2) {
        Complex result = new Complex();
        result.re = c1.re - c2.re;
        result.im = c1.im - c2.im;
        return result;
    }

    //Pobranie 2 obiektów typu Complex i wymnożenie ich wartości
    public static Complex mul(Complex c1, Complex c2) {
        Complex result = new Complex();
        result.re = c1.re*c2.re - c1.im*c2.im;
        result.im = c1.re*c2.im + c1.im*c2.re;
        return result;
    }

    //Pobranie 2 obiektów typu Complex i dzielenie wartosci pierwszej przez wartosci drugiej
    public static Complex div(Complex c1, Complex c2) {
        Complex result = new Complex();
        result.re = 0;
        result.im = 0;
        result.re = (((c1.re*c2.re)+(c1.im*c2.im))/(c2.re*c2.re + c2.im*c2.im));
        result.im = (((c1.im*c2.re)-(c1.re*c2.im))/(c2.re*c2.re + c2.im*c2.im));
        return result;
    }

    //Zmiana wartości im na wartość o przeciwnym znaku
    public static Complex ConComplex(Complex x){
        Complex result = new Complex();
        result.re = x.re;
        result.im = -x.im;

        return result;
    }
}