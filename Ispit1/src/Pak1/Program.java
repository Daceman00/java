package Pak1;

import static java.lang.System.*;

public class Program {
    public static void main(String [] args){
        Tocka2D t1 = new Tocka2D(2,3);
        Tocka2D t2 = new Tocka2D(2,4);
        System.out.println(t1.udaljenost(t2));
    }
}
