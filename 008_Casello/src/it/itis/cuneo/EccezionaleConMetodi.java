package it.itis.cuneo;

/**
 * Created by inf.tolosanol1412 on 24/10/2019.
 */
public class EccezionaleConMetodi {

    public void metodo1() throws Exception{
        metodo1();
    }

    public void metodo2() throws Exception{
        throw new Exception("sus");
    }


    public static void main(String[] args) throws Exception{
        EccezionaleConMetodi eccezionaleConMetodi = new EccezionaleConMetodi();

        eccezionaleConMetodi.metodo1();
    }
}
