package Paket111;


public class Program {
    public static void main(String [] args){
        KompleksniBroj k1 = new KompleksniBroj(1,2);
        KompleksniBroj k2 = new KompleksniBroj(3,8);
        System.out.println("Kompleksni broj "+"("+k1.getRealniBroj() + "+i" + k1.getImaginarniBroj()+")");
        System.out.println("Kompleksni broj "+"("+k2.getRealniBroj() + "-i" + k2.getImaginarniBroj()+")");


    }
}
