public class Spelare {
    public String namn;
    public String val;
    public int vinst;

    public Spelare(){
        //this.namn = namn;
        //this.val = val;
    }
    
    public void setNamn(String namn){
        this.namn = namn;
    }

    public void setVal(String val){
        this.val = val;
    }

    public void addVinst(int vinst){
        this.vinst = vinst;
    }

    public int getVinst() {
        return vinst;
    }

    public String getNamn() {
        return namn;
    }
    
    public String getVal() {
        return val;
    }
}
