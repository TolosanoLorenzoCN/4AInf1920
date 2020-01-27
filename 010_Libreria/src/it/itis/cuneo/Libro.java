package it.itis.cuneo;

import java.util.Calendar;

/**
 * Created by inf.tolosanol1412 on 30/10/2019.
 */
public class Libro {
    private String titolo;
    private String autore;
    private String isbn;
    private Calendar dataPubblicazione;

    public Libro() {
    }

    public Libro(String titolo, Calendar dataPubblicazione, String autore, String isbn) {
        this.titolo = titolo;
        this.dataPubblicazione = dataPubblicazione;
        this.autore = autore;
        this.isbn = isbn;
    }

    public Libro(Libro libro) {
        this.titolo = libro.getTitolo();
        this.dataPubblicazione = libro.getDataPubblicazione();
        this.autore = libro.getAutore();
        this.isbn = libro.getIsbn();
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Calendar getDataPubblicazione() {
        return dataPubblicazione;
    }

    public void setDataPubblicazione(Calendar dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public boolean equals(Libro libro){
        boolean equals = false;

        if(this.titolo != null && this.titolo.equals(libro.getTitolo()) && this.autore != null &&this.autore.equals(libro.getAutore()) && this.isbn != null &&this.isbn.equals(libro.getIsbn()) && this.dataPubblicazione != null &&this.dataPubblicazione.equals(libro.getDataPubblicazione())){
            equals = true;
        }

        return equals;
    }


}
