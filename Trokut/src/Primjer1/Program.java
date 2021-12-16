package Primjer1;

public class Program {
    public static void main(String [] args) {
        Trokut t1 = new Trokut(new Tocka(), new Tocka(1,1), new Tocka(1, -1));
        System.out.println("Opseg trokuta je: " + t1.dajOpseg());
        System.out.println("Povrsina trokuta je: " + t1.dajPovrsinu());
    }

        
}
