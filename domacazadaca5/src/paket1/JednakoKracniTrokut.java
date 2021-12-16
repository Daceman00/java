package paket1;

public class JednakoKracniTrokut extends GrafickiObjekt {
    private double a;
    private double b;

    public JednakoKracniTrokut() {
        this.a = 1;
        this.b = 1;
    }

    public JednakoKracniTrokut(double a, double b) {
        this.a = a;
        this.b = b;
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
