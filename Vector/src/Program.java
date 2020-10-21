import Source.*;

public class Program {
    public static void main(String[] args){


        // iloczyn vectorowy
        Vector2D n = new Vector2D(1,2);
        Vector3D m = new Vector3D(4,5,6);

        Vector3D vectorx = Vectors.VectorProduct(n,m);
        vectorx.Show();
    }
}