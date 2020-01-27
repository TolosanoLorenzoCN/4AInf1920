package it.itis.cuneo;

public class Angolo {

    private int gradi;
    private int primi;
    private int secondi;

    public Angolo(int g, int p, int s){
        this.gradi = g;
        this.primi = p;
        this.secondi = s;
    }

    public void setGradi(int g){
        this.gradi = g;
    }

    public void setPrimi(int p){
        this.primi = p;
    }

    public void setSecondi(int s){
        this.secondi = s;
    }

    public int getGradi(){
        return gradi;
    }

    public int getPrimi(){
        return primi;
    }

    public int getSecondi(){
        return secondi;
    }

    public int secondiAngolo(){

    }

    @Override
    public String toString(){
        return "gradi: " + this.gradi + ", primi: " + this.primi + ", secondi: " + this.secondi + "}";
    }



    public int aggiungiGradi(){



        return this.gradi;
    }

    public void sommaAngoli(){
        this.secondi = this.secondi + ;
    }

    public static void main(String[] args) {

        Angolo angolo1 = new Angolo(30, 30, 30);

        System.out.println("angolo{" + angolo1.toString());

        Angolo angolo2 = new Angolo(50,50,50);

        angolo1.sommaAngoli();
    }
}
