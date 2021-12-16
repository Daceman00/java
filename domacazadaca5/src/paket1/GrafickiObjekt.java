package paket1;

import paket1.Tocka;

public abstract class GrafickiObjekt {
    Tocka ishodiste;

    public Tocka getIshodiste() {
        return ishodiste;
    }

    public void setIshodiste(Tocka ishodiste) {
        this.ishodiste = ishodiste;
    }

    public GrafickiObjekt() {
        this.ishodiste = new Tocka();
    }

    public GrafickiObjekt(Tocka ishodiste) {
        this.ishodiste = ishodiste;
    }

    public void pomakni(int x, int y) {
        this.ishodiste = new Tocka(
                x, y
        );
    }

    abstract double povrsina();

    abstract double opseg();

    abstract void nacrtaj();
}