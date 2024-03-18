package uygulama01Assacation;

import java.util.ArrayList;

// assacation da yapılacak olan class ıcınde yeni bir class acmaktır
public class Ogrenci {
    private String adı;
    private String soyadı;
    private ArrayList<String> telNumaraları;
    private Adres adres;

    public Ogrenci(){

    }
    public Ogrenci(String adı, String soyadı, ArrayList<String> telNumaraları, Adres adres){
        this.adı=adı;
        this.soyadı=soyadı;
        this.telNumaraları=telNumaraları;
        this.adres=adres;
    }
    public String getAdı(){
        return adı;
    }
    public void setAdı(String adı){
        this.adı=adı;
    }
    public String getSoyadı(){
        return soyadı;
    }
    public void setSoyadı(String soyadı){
        this.soyadı=soyadı;
    }
    public ArrayList<String> getTelNumaraları(){
        return telNumaraları;
    }
    public void setTelNumaraları(ArrayList<String> telNumaraları){
        this.telNumaraları=telNumaraları;
    }

    public Adres getAdres(){
        return adres;
    }
    public void setAdres(Adres adres){
        this.adres=adres;
    }


    public String toString() {
        return "Ogrenci{" +
                "adı='" + adı + '\'' +
                ", soyadı='" + soyadı + '\'' +
                ", telNumaraları=" + telNumaraları +
                ", adres=" + adres +
                '}';
    }
}



