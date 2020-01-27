package it.itis.cuneo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Nave {
    public static final int NAVE_PASSEGGERI = 0;
    public static final int NAVE_MERCI = 1;

    private int tipoNave;
    private double lunghezza;
    private double larghezza;
    private Date dataArrivo;
    private Date dataPartenza;
    private int nAttracco;
    private String compagnia;

    public int getTipoNave() {
        return tipoNave;
    }

    public void setTipoNave(int tipoNave) {
        this.tipoNave = tipoNave;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(double lunghezza) {
        this.lunghezza = lunghezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public Date getDataArrivo() {
        return dataArrivo;
    }

    public void setDataArrivo(Date dataArrivo) {
        this.dataArrivo = dataArrivo;
    }

    public Date getDataPartenza() {
        return dataPartenza;
    }

    public void setDataPartenza(Date dataPartenza) {
        this.dataPartenza = dataPartenza;
    }

    public int getnAttracco(){
        return nAttracco;
    }

    public void setnAttracco(int nAttracco) {
        this.nAttracco = nAttracco;
    }

    public String getCompagnia() {
        return compagnia;
    }

    public void setCompagnia(String compagnia) {
        this.compagnia = compagnia;
    }

    public Nave() {
    }

    public Nave(int tipoNave, double lunghezza, double larghezza, Date dataArrivo, Date dataPartenza, int nAttracco, String compagnia) {
        this.tipoNave = tipoNave;
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
        this.dataArrivo = dataArrivo;
        this.dataPartenza = dataPartenza;
        this.nAttracco = nAttracco;
        this.compagnia = compagnia;
    }

    public void caricaNave(Nave elencoNavi[], int cNave){
        System.out.println("inserire 0 se è una nave passeggeri e 1 se è una nave merci: ");
        int tipoNave = InputOutputUtility.leggiNumero();
        if(tipoNave){
            if(tipoNave == 1){

            }else{
                System.out.println("inserire un numero tra 0 e 1 ");
            }
        }else{
            elencoNavi[cNave] = new NavePasseggeri();
            System.out.println("numero passeggeri: ");


        }
    }
}
