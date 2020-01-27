/**
 * Created by inf.tolosanol1412 on 13/11/2019.
 */
public class ArchivioPienoException extends Exception{
    private int codice;
    private String descrizione;

    public ArchivioPienoException(){

    }

    public ArchivioPienoException(int codice, String descrizione){
        this.codice = codice;
        this.descrizione = descrizione;
    }
}
