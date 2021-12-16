package domacazadaca02;
public class Kvadrat {
    private float a;

    public Kvadrat (float a) {

        this.a = a;
    }

    public float getA() {

        return this.a;
    }

    public void setA(float a) {

        this.a = a;
    }

    public float povrsina(float a) {
        return a*a;

    }

    public float opseg(float a) {
        return 4*a;
    }


}
