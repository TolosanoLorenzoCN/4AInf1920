packageit.itis.cuneo;

/**
 * Created by inf.tolosanol1412 on 24/10/2019.
 */
public class EccezionaleRIcevitore {

    public int divisione(int numeratore, int denominatore) throws ArithmeticException{
        int quoto = 0;

        quoto = numeratore/denominatore;

        return quoto;
    }

    public static void main(String[] args) {
        EccezionaleRIcevitore eccezionaleRIcevitore = new EccezionaleRIcevitore();

        try{
            eccezionaleRIcevitore.divisione(5, 0);
        } catch (ArithmeticException aEx){
            System.out.println("arit");
            aEx.printStackTrace();
        } catch (Exception ex){
            System.out.println("fra");
            ex.printStackTrace();
        } finally {
            System.out.println("ne esco sempre bene");
        }
    }
}
