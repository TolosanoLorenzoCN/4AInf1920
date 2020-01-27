package it.itis.cuneo;

public class Bottiglia {
    private float altezza;
    private float capacita;

    public Bottiglia(float altezza, float capacita) {
        this.altezza = altezza;
        this.capacita = capacita;
    }

    public Bottiglia() {
    }

    public float getAltezza() {
        return altezza;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }

    public float getCapacita() {
        return capacita;
    }

    public void setCapacita(float capacita) {
        this.capacita = capacita;
    }
}
