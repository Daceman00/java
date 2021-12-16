package paket1;

import paket1.Tocka;

abstract class Trokut extends GrafickiObjekt {
    Tocka t1;
    Tocka t2;
    Tocka t3;

    public Trokut(Tocka t1, Tocka t2, Tocka t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    public Tocka getT1() {
        return t1;
    }

    public void setT1(Tocka t1) {
        this.t1 = t1;
    }

    public Tocka getT2() {
        return t2;
    }

    public void setT2(Tocka t2) {
        this.t2 = t2;
    }

    public Tocka getT3() {
        return t3;
    }

    public void setT3(Tocka t3) {
        this.t3 = t3;
    }

    public double dajPovrsinu() {
        double a = t1.udaljenost(t2);
        double b = t2.udaljenost(t3);
        double c = t3.udaljenost(t1);
        double s = (a+b+c)/2;
        return Math.sqrt(
                s * (s-a) * (s-b) * (s-c)
        );
    }

    public double dajOpseg() {

        return t1.udaljenost(t2) + t2.udaljenost(t3) + t3.udaljenost(t1);
    }
}
