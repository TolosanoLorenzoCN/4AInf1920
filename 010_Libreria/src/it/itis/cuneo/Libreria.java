package it.itis.cuneo;

/**
 * Created by inf.tolosanol1412 on 30/10/2019.
 */
public class Libreria {
    public static final int MAX_LIBRI = 10;
    private Libro[] vLibri;
    private int cLibri; // cLibri <= MAX_LIBRI


    public Libreria(){
        //costruttore di array[]
        vLibri = new Libro[MAX_LIBRI];
        cLibri = 0;
    }

    public void addLibro(Libro libro) throws LibreriaPienaException{

        if(cLibri > MAX_LIBRI) throw new LibreriaPienaException(1, "Troppi libri");

        vLibri[cLibri] = libro;
        cLibri++;

    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("alice", )
    }
}
