package paket1;

public class Tocka {
    private double x;
    private double y;

    public Tocka(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Tocka() {
        this.x = 0;
        this.y = 0;
    }

    public double udaljenost(Tocka t2) {
        return Math.sqrt(
                Math.pow(this.x - t2.x, 2) + Math.pow(this.y - t2.y, 2)
        );
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}
