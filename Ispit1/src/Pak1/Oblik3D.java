package Pak1;

abstract class Oblik3D extends Tocka2D{
    Tocka3D t1;
    abstract double opseg();
    abstract double povrsina();
    abstract double volumen();

    public Oblik3D(Tocka3D t1){
        this.t1 = t1;
    }
}
