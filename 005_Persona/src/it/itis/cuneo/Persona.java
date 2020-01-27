package it.itis.cuneo;

public class Persona {

    private int eta;
    private String sesso;
    private String nome;
    private String professione;

    public Persona(int e, String s, String n, String p){

        this.eta = e;
        this.sesso = s;
        this.nome = n;
        this.professione = p;
    }

    public void setEta(int e){
        this.eta = e;
    }

    public void setSesso(String s){
        this.sesso = s;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public void setProfessione(String p){
        this.professione = p;
    }

    public int getEta (){
        return this.eta;
    }

    public String getSesso (){
        return this.sesso;
    }

    public String getNome (){
        return this.nome;
    }

    public String getProfessione (){
        return this.professione;
    }

    public String chiSei(){
        return "Sono una persona di nome: " + this.nome + ", sesso: " + this.sesso + ", età: " + this.eta + ", professione: " + this.professione;
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona(17,"maschio","lorenzo tolosano","studente");

        System.out.println(persona1.chiSei());
    }
}
