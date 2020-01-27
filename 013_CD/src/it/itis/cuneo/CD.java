package it.itis.cuneo;

public class CD {
    private String titolo;
    private String autore;
    private int nBrani;
    private float durata;

    public CD(String titolo, String autore, int nBrani, float durata) {
        this.titolo = titolo;
        this.autore = autore;
        this.nBrani = nBrani;
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public int getNBrani() {
        return nBrani;
    }

    public float getDurata() {
        return durata;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setNBrani(int nBrani) {
        this.nBrani = nBrani;
    }

    public void setDurata(float durata) {
        this.durata = durata;
    }

    public String toString() {
        return "Cd{ titolo: " + this.titolo + "autore: " + this.autore + "numero di brani: " + this.nBrani + "durata: " + this.durata + "}";
    }

    public String confrontaDurata(CD cd) {
        String ris = "il secondo Cd dura di più ";

        if (this.getDurata() > cd.getDurata()) {
            ris = "il primo Cd dura di più";
        }

        return ris;
    }

}




