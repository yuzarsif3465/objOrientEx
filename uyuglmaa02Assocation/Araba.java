package uyuglmaa02Assocation;

public class Araba {
    private String model;
    private String marka;
    private int uretimYIlı;

    public Araba(){

    }
    public Araba(String marka,String model,int uretimYIlı){
        this.marka=marka;
        this.model=model;
        this.uretimYIlı=uretimYIlı;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getMarka(){
        return marka;
    }
    public void setMarka(String  marka){
        this.marka= marka;
    }

    public int getUretimYIlı() {
        return uretimYIlı;
    }

    public void setUretimYIlı(int uretimYIlı) {
        this.uretimYIlı = uretimYIlı;
    }

    public String toString() {
        return "Araba{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", uretimYIlı='" + uretimYIlı + '\'' +
                '}';
    }
}
