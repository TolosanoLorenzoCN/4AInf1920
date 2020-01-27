package it.itis.cuneo;

/**
 * Created by inf.tolosanol1412 on 21/09/2019.
 */
public class Numero {
    //attributo
    private int valore;

    //metodi
    public Numero(int valore){
        this.valore = valore;
    }

    public void setValore(int valore){
        this.valore = valore;
    }

    public int getValore(){
        return this.valore; //meglio esplicito
    }

    public static void main(String args[]){ //come se fosse esterno alla classe
        int x;
        Numero numero = new Numero(5);
        x = numero.getValore();

        System.out.println(x);
    }
}
