package it.itis.cuneo;

/**
 * Created by inf.tolosanol1412 on 27/01/2020.
 */
public class Brano {
    private String idBrano;
    private int durata;
    private String artista;
    private String titolo;

    public Brano() {
    }

    public String getIdBrano() {
        return idBrano;
    }

    public void setIdBrano(String idBrano) {
        this.idBrano = idBrano;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Brano brano = (Brano) o;

        if (durata != brano.durata) return false;
        if (idBrano != null ? !idBrano.equals(brano.idBrano) : brano.idBrano != null) return false;
        if (artista != null ? !artista.equals(brano.artista) : brano.artista != null) return false;
        return titolo != null ? titolo.equals(brano.titolo) : brano.titolo == null;

    }

    @Override
    public String toString() {
        return "Brano{" +
                "idBrano='" + idBrano + '\'' +
                ", durata=" + durata +
                ", artista='" + artista + '\'' +
                ", titolo='" + titolo + '\'' +
                '}';
    }
}
