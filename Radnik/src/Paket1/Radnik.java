package Paket1;

abstract class Radnik {
    double ime;
    double prezime;
    int JMBG;
    boolean radi;

    public Radnik(double ime, double prezime, double JMBG) {
        this.ime = ime;
        this.prezime = prezime;
        this.JMBG = (int) JMBG;

    }


    abstract double izracunPlace();
}

