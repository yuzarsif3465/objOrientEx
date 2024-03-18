package uyuglmaa02Assocation;


import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // not: ortak bir ozellik olsaydı okul gibi bunu eklemek icin; Ogrenci.setOkul("medeniyet")

        // once sadece adı ve soyadı girilsin. tel ve araba bos suanlık
        Ogrenci ogrenci1= new Ogrenci("ferhat","aykan");
        System.out.println(ogrenci1);

        Araba araba1= new Araba("mercedes","cla",2012);
        Araba araba2= new Araba("togg","suv",2022);
        ArrayList<Araba> arabalra= new ArrayList<>();
        arabalra.add(araba1);
        arabalra.add(araba2);
        ogrenci1.setAraba(arabalra);

        ArrayList<String> telNumaraları= new ArrayList<>();
        telNumaraları.add("772947525");
        ogrenci1.setTelNumaraları(telNumaraları);

        System.out.println(ogrenci1);
        bilgileriYazdır(ogrenci1);

        /* (*1*) static yazmazsak bir class tanımlayarak bilgileriYazdır metoduna ulaşabiliriz.
        Test test = new Test();
        test.bilgileriYzadır(ogrenci1);
         */
    }
    //Not: burada yeni bir metod ekliyoruz daha detaylı yazdırabilmmek adına
    // bu metodu statıc turunde yazmazsak --->(*1*)
    public static void bilgileriYazdır(Ogrenci ogr){
        System.out.println("adı: "+ogr.getAdı());
        System.out.println("soyadı: "+ ogr.getSoyadı());
        System.out.println("Arabası: "+ ogr.getAraba());
        System.out.println("telefon: "+ogr.getTelNumaraları());

        ArrayList<Araba> arabalar=ogr.getAraba();
        System.out.println("Araba markaları: ");
        // bu metot icinde daha deeteylı ozellikelre de ulaşabilirsin
        for(Araba araba:arabalar){
            System.out.println(araba.getMarka());
        }


    }
}
