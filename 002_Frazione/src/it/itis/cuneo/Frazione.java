package it.itis.cuneo;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by inf.tolosanol1412 on 23/09/2019.
 */
public class Frazione {
    //attributi
    private int numeratore;
    private int denominatore;

    //metodi
    public Frazione() {

        //serve per istanziare
        super();
    }

    public Frazione(int numeratore, int denominatore) {

        super();
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    public void setNumeratore(int numeratore) {

        this.numeratore = numeratore;
    }

    public int getNumeratore() {

        return numeratore;
    }

    public void setDenominatore(int denominatore) {

        this.denominatore = denominatore;
    }

    public int getDenominatore() {

        return denominatore;
    }

    //restituisce una stringa con lo stato dell'oggetto
    public String toString() {

        return "Frazione {numeratore: " + numeratore + ", denominatore: " + denominatore + "}";
    }

    public boolean equals(Frazione frazione){
        boolean uguali = false;

        if((this.numeratore == frazione.getNumeratore()) && (this.denominatore == frazione.getDenominatore())){
            uguali = true;
        }

        return uguali;
    }

    public static void main(String args[]) {

        Frazione frazioneUnknownState = new Frazione();
        System.out.println(frazioneUnknownState.toString());

        Frazione frazione1 = new Frazione(2, 5);
        System.out.println(frazione1.toString());

        boolean confrontoUguali = frazione1.equals(frazioneUnknownState);
        System.out.println("Sono uguali? " + confrontoUguali);
    }

}

