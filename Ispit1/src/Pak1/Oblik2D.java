package Pak1;

abstract class Oblik2D extends Tocka2D{
    Tocka2D t1;
    abstract double opseg();
    abstract double povrsina();

    public Oblik2D(Tocka2D t1){
            this.t1 = t1;
        }
    }

