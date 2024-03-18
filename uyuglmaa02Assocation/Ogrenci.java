package uyuglmaa02Assocation;

import java.util.ArrayList;

// Not: bu uygulmada class icinde liste turunde bir class kullanıcaz.
public class Ogrenci {
    private String adı;
    private String soyadı;
    private ArrayList<String> telNumaraları;
    private ArrayList<Araba> araba;

    public Ogrenci(){

    }
    public Ogrenci(String adı, String soyadı){
        this.adı=adı;
        this.soyadı=soyadı;
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

    public ArrayList<Araba> getAraba(){
        return araba;
    }
    public void setAraba(ArrayList<Araba> araba){
        this.araba=araba;
    }


    public String toString() {
        return "Ogrenci{" +
                "adı='" + adı + '\'' +
                ", soyadı='" + soyadı + '\'' +
                ", telNumaraları=" + telNumaraları +
                ", araba=" + araba +
                '}';
    }
}
