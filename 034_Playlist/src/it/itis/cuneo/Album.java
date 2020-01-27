package it.itis.cuneo;

import java.util.List;

/**
 * Created by inf.tolosanol1412 on 27/01/2020.
 */
public class Album {
    private List<Brano> aBrano;
    private String idAlbum;

    public Album() {
    }

    public Album(List<Brano> aBrano, String idAlbum) {
        this.aBrano = aBrano;
        this.idAlbum = idAlbum;
    }

    public List<Brano> getaBrano() {
        return aBrano;
    }

    public void setaBrano(List<Brano> aBrano) {
        this.aBrano = aBrano;
    }

    public String getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(String idAlbum) {
        this.idAlbum = idAlbum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Album album = (Album) o;

        if (aBrano != null ? !aBrano.equals(album.aBrano) : album.aBrano != null) return false;
        return idAlbum != null ? idAlbum.equals(album.idAlbum) : album.idAlbum == null;

    }

    @Override
    public String toString() {
        return "Album{" +
                "aBrano=" + aBrano +
                ", idAlbum='" + idAlbum + '\'' +
                '}';
    }
}
