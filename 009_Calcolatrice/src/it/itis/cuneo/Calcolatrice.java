package it.itis.cuneo;
import java.util.Scanner;

public class Calcolatrice {

    public Calcolatrice(int numero){}

    public int getSomma(int numero1, int numero2){
        int somma = 0;



        return somma;
    }

    public static void main(String[] args) {
        //Calcolatrice calc = new Calcolatrice();

        //System.out.println(calc.getSomma(1, 2));

        Scanner lettore = new Scanner(System.in);
        System.out.println("inserire il primo numero: ");
        int numero1 = lettore.nextInt();
        lettore.close();

        System.out.println("il numero è: " + numero1);
    }
}
