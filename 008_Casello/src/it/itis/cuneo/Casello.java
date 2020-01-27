package it.itis.cuneo;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ParseException;
import com.sun.xml.internal.ws.api.server.SDDocumentFilter;
import org.w3c.dom.CDATASection;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringJoiner;

/**
 * Created by inf.tolosanol1412 on 21/10/2019.
 */
public class Casello {

    private String id;
    private Calendar dataEntrata;
    private Calendar dataUscita;

    //metodi
    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public void setDataEntrata(Calendar dataEntrata){
        this.dataEntrata = dataEntrata;
    }

    public Calendar getDataEntrata(){
        return this.dataEntrata;
    }

    public void setDataUscita(Calendar dataUscita){
        this.dataUscita = dataUscita;
    }

    public Calendar getDataUscita(){
        return this.dataUscita;
    }

    public Casello(Calendar dataEntrata, Calendar dataUscita, String id){
        this.id = id;
        this.dataEntrata = dataEntrata;
        this.dataUscita = dataUscita;
    }

    public Casello(Casello casello){
        this.id = new String(casello.getId()); //tutte le stringhe hanno bisogno del new string

        Calendar cDataIngresso = Calendar.getInstance();
        cDataIngresso.setTime(casello.getDataEntrata().getTime());
        this.dataEntrata = cDataIngresso;

        Calendar cDataUscita = Calendar.getInstance();
        cDataUscita.setTime(casello.getDataUscita().getTime());
        this.dataUscita = cDataUscita;
    }

    public static void main(String[] args){
        //stringa ->    data (simpleDateFormat)
        //esempio:      23/10/2019 09:25:43
        //pattern ->    dd/MM/yyyy hh24:mi:ss (formato della data in una stringa)

        final String FORMATO_DMY_HMS = "dd/MM/yyyy HH:mm:ss";
        String Data = "14/12/2002 23:30:40";
        Calendar dataEntrata = Calendar.getInstance();
        SimpleDateFormat formato = new SimpleDateFormat(FORMATO_DMY_HMS);
        //eccezione -> anomalia software che si verifica quando il codice genera un errore in tempo di esecuzione
        //parse exeption -> la stringa non rispetta il formato atteso
        Date dataPartenza = null;

        try {
            formato.parse(Data);
        } catch (java.text.ParseException e) {
            //errore nel formato della stringa
            //stackTrace -> traccia dello stack (elenco delle chiamate)
            e.printStackTrace();
        }
        dataEntrata.setTime(dataPartenza);

        //System.out.println(sdf.format(dataEntrata));

        //Casello casello1 = new Casello("A1", );
    }
}
