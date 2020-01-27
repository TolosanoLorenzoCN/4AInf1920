package it.itis.cuneo;

import java.util.List;

/**
 * Created by inf.tolosanol1412 on 27/01/2020.
 */
public class Playlist {
    private List<Album> aAlbum;

    public Playlist(List<Album> aAlbum) {
        this.aAlbum = aAlbum;
    }

    public Playlist() {
    }

    public List<Album> getaAlbum() {
        return aAlbum;
    }

    public void setaAlbum(List<Album> aAlbum) {
        this.aAlbum = aAlbum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Playlist playlist = (Playlist) o;

        return aAlbum != null ? aAlbum.equals(playlist.aAlbum) : playlist.aAlbum == null;

    }

    @Override
    public String toString() {
        return "Playlist{" +
                "aAlbum=" + aAlbum +
                '}';
    }
}
