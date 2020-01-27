package it.itis.cuneo;

import java.util.Date;

public class NavePasseggeri extends Nave{
    private int nPasseggeri;

    public int getnPasseggeri() {
        return nPasseggeri;
    }

    public void setnPasseggeri(int nPasseggeri) {
        this.nPasseggeri = nPasseggeri;
    }

    public NavePasseggeri(){
        super();
    }

    public NavePasseggeri(int tipoNave, double lunghezza, double larghezza, Date dataArrivo, Date dataPartenza, int nAttracco, String compagnia, int nPasseggeri) {
        super(tipoNave, lunghezza, larghezza, dataArrivo, dataPartenza, nAttracco, compagnia);
        this.nPasseggeri = nPasseggeri;
    }
}
