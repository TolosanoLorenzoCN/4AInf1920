import java.awt.print.PrinterGraphics;

/**
 * Created by inf.tolosanol1412 on 13/11/2019.
 */
public class Archivio {
    public static final int MAX_PROGRAMMI = 10;
    private int cProgrammi;
    private Programma[] vProgrammi;
    private int nProgrammi;

    public Archivio(){
        vProgrammi = new Programma[MAX_PROGRAMMI];
        nProgrammi = MAX_PROGRAMMI;
        cProgrammi = 0;
    }

    public Archivio(int nProgrammi) throws ArchivioPienoException {
        if(this.nProgrammi > MAX_PROGRAMMI){
            throw new ArchivioPienoException(1, "limite massimo ");
        }
        vProgrammi = new Programma[nProgrammi];
        this.nProgrammi = nProgrammi;
        cProgrammi = 0;
    }

    public Programma getProgramma(int posizione){
        Programma programma = null;

        if(posizione > 0 && posizione < nProgrammi)
            programma = this.vProgrammi[posizione];

        return programma;

    }

    public void setProgramma(Programma programma, int posizione){
        int esito = 0;
        if(posizione > 0 && posizione < nProgrammi) {
            this.vProgrammi[posizione] = programma;
            if (this.vProgrammi[posizione] == null) {
                this.cProgrammi++;
                this.vProgrammi[posizione] = programma;
                esito = posizione;
            } else {
                esito = -2;
            }
        } else {
            esito = -1;
        }
    }

    public void killProgramma(int posizione){
        if(posizione > 0 && posizione < nProgrammi) {
            this.vProgrammi[posizione] = null;
            this.cProgrammi--;
        }
    }

    public int getN(){
        return this.nProgrammi;
    }

    public Programma cercaProgramma(String nome){
        Programma programma = null;
        boolean trovato = false;

        for(int cProgramma = 0; cProgramma < this.nProgrammi && !trovato; cProgramma++){
            programma = this.vProgrammi[cProgramma];
            if(programma != null && nome.equalsIgnoreCase(programma.getNome())){}
        }

        return programma;
    }

    public boolean confrontaContenitore(Archivio archivio){
        boolean uguali = true;

        if(this.nProgrammi == archivio.getN()){
            for(int cProgramma = 0; cProgramma < this.nProgrammi && !uguali; cProgramma++){
                Programma programmaInterno = this.getProgramma(cProgramma);
                Programma programmaEsterno = archivio.getProgramma(cProgramma);
                if(!programmaInterno.equals(programmaEsterno)){
                    uguali = false;
                }
            }
        } else {
            uguali = false;
        }

        return uguali;
    }

    public int contaProgrammiUguali(Archivio archivio){
        int ret = 0;

        for (int cProgramma = 0; cProgramma < this.nProgrammi; cProgramma++) {
            Programma programmaInterno = this.getProgramma(cProgramma);
            for(int cntProgramma = 0; cntProgramma < archivio.nProgrammi; cntProgramma++){
                Programma programmaEsterno = archivio.getProgramma(cntProgramma);
                if (programmaInterno.equals(programmaEsterno)) {
                    ret++;
                }
            }
        }

        return ret;
    }

    public void caricaArchivio(){
        this.nProgrammi = InputOutputUtility.leggiNumero("Quanti programmi vuoi? ");

        for(cProgrammi = 0; cProgrammi < nProgrammi; cProgrammi++){
            Programma programma = new Programma();
            System.out.println("\nInserisci programma...");
            programma.caricaProgramma();
            this.setProgramma(programma, cProgrammi);
        }
    }

    public void stampaMenu(){
        String menu = "\t0: esci\n" + "\t1: carica archivio\n" + "\t2: elimina programma\n" + "\t3: ricerca programma\n" + "\t4: stampa archivio\n";

        System.out.println(menu);
    }

    public void simulaArchivio(){
        Programma programma1 = new Programma(1995, 2, "linux", "marco", "autocad", 2546);

        this.setProgramma(programma1, 0);

        Programma programma2 = new Programma(1995, 2, "linux", "marco", "autocad", 2546);

        this.setProgramma(programma2, 1);
    }

    public static void main(String[] args) {
        Archivio archivio = new Archivio();

        boolean esci = false;
        int sceltaMenu = -1;

        while(!esci){
            archivio.stampaMenu();
            sceltaMenu = InputOutputUtility.leggiNumero("inserisci la scelta: ");
            switch(sceltaMenu){
                case 0:
                    esci = true;
                    break;
                case 1:
                    archivio.caricaArchivio();
                    break;
                case 2:
                    int posDeleteProgram = InputOutputUtility.leggiNumero("inserisci la posizione da cancellare: ");
                    archivio.killProgramma(posDeleteProgram);
                    break;
                case 3:
                    String nome = InputOutputUtility.leggiNome("inserisci nome: ");
                    Programma programma = archivio.cercaProgramma(nome);
                    break;
                case 4:
                    System.out.println(archivio.toString());
                    break;
                case 99:
                    archivio.simulaArchivio();
                    break;
            }
        }
    }
}
