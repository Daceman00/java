package paket1;

public class RaznoStranicniTrokut extends GrafickiObjekt {
    public double a;
    public double b;
    public double c;

    public RaznoStranicniTrokut() {
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }

    public RaznoStranicniTrokut(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double povrsina() {
        return (b/4)*Math.sqrt((4*a*a)-(b*b));
    }

    @Override
    public double opseg() {
        return a * (2*b);
    }

    @Override
    public void nacrtaj() {
        System.out.println("Ovo je jednakokracni trokut površine " + this.povrsina() + " i opsega " + this.opseg());
    }
}
