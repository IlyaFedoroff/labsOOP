package lab2;

public class Complex {
    private double r;
    private double m;
    public Complex(){
        this.r=0.0;
        this.m=0.0;
    }
    public double getR(){
        return r;
    }
    public void setR(double r){
        this.r = r;
    }
    public double getM(){
        return m;
    }
    public void setM(double m){
        this.m = m;
    }
    public void setNumber(double r, double m){
        this.setR(r);
        this.setM(m);
    }

    public Complex(double r, double m){
        this.r=r;
        this.m=m;
    }
    public String toString(){
        return "(" + r + " + i" + m + ")";
    }
    public double Module() {
        return Math.sqrt(r * r + m * m);
    }
}
