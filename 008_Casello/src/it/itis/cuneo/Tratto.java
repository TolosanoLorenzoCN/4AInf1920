package it.itis.cuneo;

import java.util.Calendar;

/**
 * Created by inf.tolosanol1412 on 21/10/2019.
 */
public class Tratto {

    //attributi
    private Casello ingresso;
    private Casello uscita;
    private int distanza;

    public Tratto(){

    }

    public Tratto(Casello ingresso, Casello uscita, int distanza) {
        this.ingresso = ingresso;
        this.uscita = uscita;
        this.distanza = distanza;
    }

    public double velocitaMedia(){
        double velocitaMedia = 0;

        long nMilliSecUscita = uscita.getDataUscita().getTimeInMillis();
        long nMilliSecIngresso = ingresso.getDataUscita().getTimeInMillis();

        velocitaMedia = (nMilliSecUscita - nMilliSecIngresso) / (distanza * 1000);

        return velocitaMedia;
    }

    public static void main(String[] args) {
        Casello ingresso = new Casello();
        Calendar cDataIngresso = InputOutputUtility.leggiDataOraCalendar("inserisci data di ingresso (dd/MM/yyyy HH:mm:ss): ");

        ingresso.setDataEntrata(cDataIngresso);

    }
}
