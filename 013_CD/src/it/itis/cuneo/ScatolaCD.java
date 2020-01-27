import it.itis.cuneo.CD;

public class ScatolaCD {

    private CD[] v_cd;
    private static final int MAX_CD = 5;
    private int cCd;

    public ScatolaCD(CD[] v_cd, int cCd) {
        this.v_cd = v_cd;
        this.cCd = cCd;
    }

    public CD[] getV_cd() {
        return v_cd;
    }

    public int getCCd() {
        return cCd;
    }

    public void setV_cd(CD[] v_cd) {
        this.v_cd = v_cd;
    }

    public void setCCd(int cCd) {
        this.cCd = cCd;
    }

    public void killCd(){
        this.cCd--;

        this.setV_cd(null);
    }

    public int confrontaCollezione(CD cd){

        boolean trovato = false;
        int i;

        for(i=0; i<MAX_CD; i++){
            if(v_cd[i].equals(cd))
            {

            }
        }
        if(trovato == true)
        {
            i = -1;
        }

        return i;
    }
}
