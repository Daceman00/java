package Paket1;

abstract class Programer extends Radnik implements Rad {
    double programskiJezik;
    double osnovica;
    double placa;
    public Programer(double ime, double prezime, double JMBG) {
        super(ime, prezime, JMBG);
    }


    @Override
    public void zapocmi() {
        this.radi = true;

    }

    @Override
    public void zavrsi() {
        this.radi = false;

    }

    public double getOsnovica() {
        return osnovica;
    }

    public double getProgramskiJezik() {
        return programskiJezik;
    }

    public void setOsnovica(double osnovica) {
        this.osnovica = osnovica;
    }

    public void setProgramskiJezik(double programskiJezik) {
        this.programskiJezik = programskiJezik;
    }

    @Override
    public double izracunPlace(){
        return this.osnovica * 3.2;
    }

    public double osnovica(){
        return this.osnovica = placa;
    }

    public double toString(){
        return this.ime + this.prezime + this.programskiJezik + this.placa;
    }
}
