package it.itis.cuneo;

public class Punto {

    private int xPunto;
    private int yPunto;

    public Punto(int x, int y){
        this.xPunto = x;
        this.yPunto = y;
    }

    public Punto(Punto punto){

    }

    public void setXPunto(int x){
        this.xPunto = x;
    }

    public void setYPunto(int y){
        this.yPunto = y;
    }

    public int getXPunto(){
        return xPunto;
    }

    public int getYPunto(){
        return xPunto;
    }
}
