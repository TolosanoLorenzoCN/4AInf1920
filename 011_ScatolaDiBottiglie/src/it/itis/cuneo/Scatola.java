import it.itis.cuneo.ScatolaPienaException;

import java.util.Arrays;

package it.itis.cuneo;

public class Scatola {
    public static final int MAX_BOTTIGLIE = 5;
    private Bottiglia[] vBottiglie;
    private int cBottiglie;

    public Scatola(){
        vBottiglie = new Bottiglia[MAX_BOTTIGLIE];
        cBottiglie = 0;
    }

    public void addBottiglia(Bottiglia bottiglia) throws ScatolaPienaException{
        if(cBottiglie > MAX_BOTTIGLIE){
            throw new ScatolaPienaException(1, "troppe bottiglie!");
        }
        vBottiglie[cBottiglie] = bottiglia;
        cBottiglie++;
    }
}
