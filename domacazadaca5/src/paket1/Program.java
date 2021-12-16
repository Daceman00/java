package paket1;

public class Program {
    public static void main(String[] args) {
        JednakoStranicniTrokut t = new JednakoStranicniTrokut();
        t.nacrtaj();
        t.povrsina();
        t.opseg();
        t.nacrtaj();

        JednakoKracniTrokut t1 = new JednakoKracniTrokut();
        t1.nacrtaj();
        t1.povrsina();
        t1.opseg();

        RaznoStranicniTrokut t2 = new RaznoStranicniTrokut();
        t2.nacrtaj();
        t2.povrsina();
        t2.opseg();
    }
}
