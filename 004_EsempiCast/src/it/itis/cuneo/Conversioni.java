package it.itis.cuneo;

/**
 * Created by inf.tolosanol1412 on 30/09/2019.
 */
public class Conversioni {

    //conversione tra wrapper
    public static void main(String[] args) {

        //'Float' è una classe wrapper, che continene nu primitivo e i metodi che ne permettono l'elaborazione
        //'float' è un tipo primitivo, una variabile semplice
        float f;
        f = new Float(0.52d);
        System.out.println(f);//'system.out.println' prende una stringa

        int n;
        String quanteMele = "8";
        n = Integer.parseInt(quanteMele);   
        System.out.println(n);


    }

}
