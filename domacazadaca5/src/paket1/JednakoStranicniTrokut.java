package paket1;

public class JednakoStranicniTrokut extends GrafickiObjekt {
    private double a;

    public JednakoStranicniTrokut() {
        this.a = 1;
    }

    public JednakoStranicniTrokut(double a, double b) {
        this.a = a;
    }

    @Override
    public double povrsina() {
        return (Math. sqrt(3)/4)*(a*a);
    }

    @Override
    public double opseg() {
        return a * 3;
    }

    @Override
    public void nacrtaj() {
        System.out.println("Ovo je jednakostranicni trokut površine " + this.povrsina() + " i opsega " + this.opseg());
    }

}

