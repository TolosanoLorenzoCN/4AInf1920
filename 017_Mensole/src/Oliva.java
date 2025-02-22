import java.util.Calendar;
import java.util.Objects;

public class Oliva {

    private ColoreOliva coloreOliva;
    private MaturazioneOliva maturazioneOliva;
    private String codiceOliva;
    private Calendar dataRaccolta;

    public Oliva() {
    }

    public Oliva(ColoreOliva coloreOliva, MaturazioneOliva maturazioneOliva, String codiceOliva, Calendar dataRaccolta) {
        this.coloreOliva = coloreOliva;
        this.maturazioneOliva = maturazioneOliva;
        this.codiceOliva = codiceOliva;
        this.dataRaccolta = dataRaccolta;
    }

    public Oliva(Oliva oliva) {
        this.coloreOliva = getColoreOliva();
        this.maturazioneOliva = getMaturazioneOliva();
        this.codiceOliva = getCodiceOliva();
        this.dataRaccolta = getDataRaccolta();
    }

    public ColoreOliva getColoreOliva() {
        return coloreOliva;
    }

    public void setColoreOliva(ColoreOliva coloreOliva) {
        this.coloreOliva = coloreOliva;
    }

    public MaturazioneOliva getMaturazioneOliva() {
        return maturazioneOliva;
    }

    public void setMaturazioneOliva(MaturazioneOliva maturazioneOliva) {
        this.maturazioneOliva = maturazioneOliva;
    }

    public String getCodiceOliva() {
        return codiceOliva;
    }

    public void setCodiceOliva(String codiceOliva) {
        this.codiceOliva = codiceOliva;
    }

    public Calendar getDataRaccolta() {
        return dataRaccolta;
    }

    public void setDataRaccolta(Calendar dataRaccolta) {
        this.dataRaccolta = dataRaccolta;
    }

    @Override
    public String toString() {
        return "Oliva{" +
                "coloreOliva=" + coloreOliva +
                ", maturazioneOliva=" + maturazioneOliva +
                ", codiceOliva='" + codiceOliva + '\'' +
                ", dataRaccolta=" + dataRaccolta +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Oliva oliva = (Oliva) o;

        return coloreOliva == oliva.coloreOliva &&
                maturazioneOliva == oliva.maturazioneOliva &&
                Objects.equals(codiceOliva, oliva.codiceOliva) &&
                Objects.equals(dataRaccolta, oliva.dataRaccolta);
    }

}
