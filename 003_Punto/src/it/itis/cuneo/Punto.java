package it.itis.cuneo;
import java.lang.Math;

public class Punto {

    private int xPunto;
    private int yPunto;
    private int nQuadrante;

    public Punto(int x, int y, int q){
        this.xPunto = x;
        this.yPunto = y;
        this.nQuadrante = q;
    }

    public void setXPunto(int x){
        this.xPunto = x;
    }

    public void setYPunto(int y){
        this.yPunto = y;
    }

    public void setnQuadrante(int q){
        this.nQuadrante = q;
    }

    public int getXPunto(){
        return xPunto;
    }

    public int getYPunto(){
        return xPunto;
    }

    public int getQuadrante(){
        return nQuadrante;
    }

    public int getnNQuadrante(){

        int q = 0;

        if(this.xPunto > 0){
            if(this.yPunto > 0){
                q = 1;
            } else {
                q = 4;
            }
        } else {
            if(this.yPunto > 0){
                q = 2;
            } else {
                q = 3;
            }
        }

        return q;
    }

    public double getDistanza(Punto p2){
         return sqrt( ( (this.xPunto - p2.xPunto) * (this.xPunto - p2.xPunto) ) + ( (this.yPunto - p2.yPunto) * (this.yPunto - p2.yPunto) ) );
    }

    public boolean equals(Punto p2){
        boolean uguali = false;

        if(this.xPunto == p2.xPunto && this.yPunto == p2.xPunto){
            uguali = true;
        }

        return uguali;
    }

    @Override
    public String toString(){
        return "punto1{x: " + this.xPunto + ", y: " + this.yPunto + ", quadrante: " + this.nQuadrante + "}"
    }

    public static void main(String[] args) {

        Punto punto1 = new Punto(3, 2, 0);
        punto1.setnQuadrante(punto1.getQuadrante());

        Punto punto2 = new Punto(3, 5, 0);
        punto2.setnQuadrante(punto2.getQuadrante());

        double d = punto1.getDistanza(punto2);

        System.out.println("punto 1: " + punto1.toString());
        System.out.println("punto 2: " + punto2.toString());
        System.out.println("distanza: " + d);

        if(punto1.equals(punto2)){
            System.out.println("sono uguali");
        } else {
            System.out.println("non sono uguali");
        }
    }

}



















