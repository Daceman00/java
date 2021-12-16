package Pak1;

public class Trokut extends Oblik2D {
    private double t2;
    private double t3;

    public Trokut(Tocka2D t1) {
        super(t1);
    }

    @Override
    double opseg() {
        return 0;
    }

    @Override
    double povrsina() {
        return 0;
    }
}
