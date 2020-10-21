package Source;

public class Vector2D extends Vectors {
    public Vector2D(){
        this.origin = new double[2];
        for(double i : origin){
            i = 0;
        }
    }
    public Vector2D(double x, double y){
        this.origin = new double[2];
        this.origin[0] = x;
        this.origin[1] = y;
    }

    public Vector2D CreateNewVector(){
        return (new Vector2D());
    }
}