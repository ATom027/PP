package Source;

public class Vector extends Vectors {
    public Vector(){
        this.origin = new double[2];
        for(double i : origin){
            i = 0;
        }
    }
    public Vector(double x) {
        this.origin = new double[1];
        this.origin[0] = x;
    }

    public Vector CreateNewVector(){
        return (new Vector());
    }
}