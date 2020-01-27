import java.util.Objects;

public class Villa extends Abitazione{
    private int nPiani;
    private double superficieGiardino;
    private boolean piscina;

    public Villa() {
    }

    public Villa(int nStanze, double superficie, String indirizzo, String citta, int nPiani, double superficieGiardino, boolean piscina) {
        super(nStanze, superficie, indirizzo, citta);
        this.nPiani = nPiani;
        this.superficieGiardino = superficieGiardino;
        this.piscina = piscina;
    }

    public Villa(Villa villa) {
        super(villa);
        this.nPiani = villa.getnPiani();
        this.superficieGiardino = villa.getSuperficieGiardino();
        this.piscina = villa.getPiscina();
    }

    public int getnPiani() {
        return nPiani;
    }

    public void setnPiani(int nPiani) {
        this.nPiani = nPiani;
    }

    public double getSuperficieGiardino() {
        return superficieGiardino;
    }

    public void setSuperficieGiardino(double superficieGiardino) {
        this.superficieGiardino = superficieGiardino;
    }

    public boolean getPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString() +
                "nPiani=" + nPiani +
                ", superficieGiardino=" + superficieGiardino +
                ", piscina=" + piscina +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Villa villa = (Villa) o;
        return nPiani == villa.nPiani &&
                Double.compare(villa.superficieGiardino, superficieGiardino) == 0 &&
                piscina == villa.piscina;
    }

}
