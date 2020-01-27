public class Appartamento extends Abitazione{

    private int piano;
    private boolean lift;
    private int nBalconi;

    public Appartamento() {
    }

    public Appartamento(int piano, boolean lift, int nBalconi) {
        this.piano = piano;
        this.lift = lift;
        this.nBalconi = nBalconi;
    }

    public Appartamento(int nStanze, double superficie, String indirizzo, String citta, int piano, boolean lift, int nBalconi) {
        super(nStanze, superficie, indirizzo, citta);
        this.piano = piano;
        this.lift = lift;
        this.nBalconi = nBalconi;
    }

    public Appartamento(Abitazione abitazione, int piano, boolean lift, int nBalconi) {
        super(abitazione);
        this.piano = piano;
        this.lift = lift;
        this.nBalconi = nBalconi;
    }

    public int getPiano() {
        return piano;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }

    public boolean isLift() {
        return lift;
    }

    public void setLift(boolean lift) {
        this.lift = lift;
    }

    public int getnBalconi() {
        return nBalconi;
    }

    public void setnBalconi(int nBalconi) {
        this.nBalconi = nBalconi;
    }

    @Override
    public String toString() {
        return "Appartamento{" +
                super.toString() +
                "piano=" + piano +
                ", lift=" + lift +
                ", nBalconi=" + nBalconi +
                '}';
    }


}
