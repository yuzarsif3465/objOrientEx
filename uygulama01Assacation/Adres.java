package uygulama01Assacation;

public class Adres {
    private String evNo;
    private String mahalle;
    private String ilce;
    private static String il;

    public Adres(){
    }
    public Adres(String evNo, String mahalle,String ilce, String il){
        this.evNo=evNo;
        this.mahalle=mahalle;
        this.ilce=ilce;
        Adres.il=il;
    }
    public String getEvNo(){
        return evNo;
    }
    public void setEvNo(String evNo){
        this.evNo=evNo;
    }
    public String getMahalle(String mahalle){
        return mahalle;
    }
    public void setMahalle(String mahalle){
        this.mahalle=mahalle;
    }
    public String getIlce(String ilce){
        return ilce;
    }
    public void setIlce(String ilce){
        this.ilce=ilce;
    }
    public String getIl(String il){
        return il;
    }
    public void setIl(String il){
        Adres.il=il;
    }


    public String toString() {
        return "Adres{" +
                "evNo='" + evNo + '\'' +
                ", mahalle='" + mahalle + '\'' +
                ", ilce='" + ilce + '\'' +
                '}';
    }
}
