package Source;

abstract public class Vectors {
    public double[] origin;

    Vectors(){}

    abstract public <C extends Vectors> C  CreateNewVector();

    public void Show() {
        System.out.println("Współrzędne wektora to :");
        for (double x : origin) {
            System.out.println(x);
        }
    }

    public static <F extends Vectors, T extends Vectors> void Convert(F _from, T _to){
        System.arraycopy(_from.origin, 0, _to.origin, 0, (_from.origin.length > _to.origin.length ? _to.origin.length : _from.origin.length));
    }

    public static <F extends Vectors, S extends Vectors> double ScalarProduct(F _first, S _second){
        double obliczenia_w_toku = 0;
        for(int i = 0; i < ((_first.origin.length > _second.origin.length) ? _second.origin.length : _first.origin.length) ;i++){
            obliczenia_w_toku+=_first.origin[i] * _second.origin[i];
        }
        return(obliczenia_w_toku);
    }

    public static <C extends Vectors, F extends Vectors, S extends Vectors> C VectorProduct(F _first, S _second) {
        C product = (_first.origin.length > _second.origin.length ? _first.CreateNewVector() : _second.CreateNewVector());
        //////////////// do przemyślenia
        C first = product.CreateNewVector();
        C second = product.CreateNewVector();

        Convert(_first, first);
        Convert(_second, second);
        ///////////
        int n = 0 ;
        int m = 1;

        for(int i = 0; i < product.origin.length; i++){

            n++;
            m++;
            if(n == product.origin.length) { n = 0;}
            if(m == product.origin.length) { m = 0;}

            product.origin[i] = first.origin[n]*second.origin[m] - first.origin[m]*second.origin[n];
        }

        return product;
    }
}