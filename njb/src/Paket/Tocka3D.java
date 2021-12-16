package Paket;

public class Tocka3D extends Tocka2D {
    private double z;

    public Tocka3D(){
        super();
        this.z = 0;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public Tocka3D(double x, double y, double z){
        super(x, y);
        this.z = z;
    }
    public static double udaljenost(Tocka3D t1, Tocka3D t2){
        return Math.sqrt(Math.pow(t1.getX()-t2.getX(), 2) + Math.pow(t1.getY()-t2.getY() , 2) + Math.pow(t1.z-t2.z , 2));
    }
}
