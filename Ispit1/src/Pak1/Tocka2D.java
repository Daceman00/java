package Pak1;

public class Tocka2D {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public Tocka2D(){
        this.x = 1;
        this.y = 2;
    }
    public Tocka2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double  udaljenost(Tocka2D t2){
        double x_2 = Math.pow(this.x - t2.x, 2);
        double y_2 = Math.pow(this.y - t2.y, 2);
        return Math.sqrt(x_2 + y_2);
    }
    public String toString(){
        return "Tocka (" + this.x + "," + this.y + ")";
    }

}
