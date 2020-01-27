/**
 * Created by d.claudio.borgogno on 13/11/2019.
 */
public class Programma {
    private String nome;
    private int codice;
    private String produttore;
    private String sistemaOperativo;
    private int versione;
    private int anno;

    public Programma(){

    }

    public Programma(int anno, int versione, String sistemaOperativo, String produttore, String nome, int codice) {
        this.anno = anno;
        this.versione = versione;
        this.sistemaOperativo = sistemaOperativo;
        this.produttore = produttore;
        this.nome = nome;
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getVersione() {
        return versione;
    }

    public void setVersione(int versione) {
        this.versione = versione;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Programma{" +
                "nome='" + nome + '\'' +
                ", codice=" + codice +
                ", produttore='" + produttore + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", versione=" + versione +
                ", anno=" + anno +
                '}';
    }

    public void caricaProgramma(){
        this.codice = InputOutputUtility.leggiNumero("\tinserisci codice: ");
        this.nome = InputOutputUtility.leggiNome("\tinserisci nome: ");
        this.produttore = InputOutputUtility.leggiNome("\tinserisci produttore: ");
        this.sistemaOperativo = InputOutputUtility.leggiNome("\tinserisci sistema operativo: ");
        this.versione = InputOutputUtility.leggiNumero("\tinserisci la versione: ");
        this.anno = InputOutputUtility.leggiNumero("\tinserisci l'anno di uscita: ");
    }
}
