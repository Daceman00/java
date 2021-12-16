package Paket111;

public class KompleksniBroj {
    public double realniBroj;
    public double imaginarniBroj;

    public KompleksniBroj() {
        this.realniBroj = 1.0;
        this.imaginarniBroj= 0.0;
    }
    public KompleksniBroj(double realniBroj, double imaginarniBroj) {
        this.realniBroj = realniBroj;
        this.imaginarniBroj = imaginarniBroj;
    }
    
    public double getRealniBroj() {
        return realniBroj;
    }

    public void setRealniBroj(double realniBroj) {
        this.realniBroj = realniBroj;
    }

    public double getImaginarniBroj() {
        return imaginarniBroj;
    }

    public void setImaginarniBroj(double imaginarniBroj) {
        this.imaginarniBroj = imaginarniBroj;
    }
    public String toString(){
        return "Kompleksni broj " +  "("+this.realniBroj + "i" + this.imaginarniBroj+")";
    }

}
