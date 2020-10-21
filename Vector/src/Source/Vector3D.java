package Source;

public class Vector3D extends Vectors {
    public Vector3D(){
        this.origin = new double[3];
        for(double i : origin){
            i = 0;
        }
    }
    public Vector3D(double x, double y, double z){
        this.origin = new double[3];
        this.origin[0] = x;
        this.origin[1] = y;
        this.origin[2] = z;
    }

    public Vector3D CreateNewVector(){
        return (new Vector3D());
    }
}