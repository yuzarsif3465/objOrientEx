package uygulama01Assacation;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Adres adres1= new Adres("85","icadiye","uskudar","istanbul");
        System.out.println(adres1);
        // not: adres1 ogrenci1 kısmına direk buradan eklenebilr veya ogrenci1 deki yer null olarak bırakılır set metoduyla adres1 eklenebilir(ogrenci1.setAdres(adres1))

        Ogrenci ogrenci1= new Ogrenci("yusuf","zorlu",null, adres1);

        //Not: numaralar kıdmı null oldugundan set metoduyla bunları alamak gerek.
        //numara ekleme kısmı ogrenci1 den once olsaydı null yerine numaralar yazman yeterli olurdu.
        ArrayList<String> numaralar= new ArrayList<>();
        numaralar.add("5466871719");
        numaralar.add("5054877167");
        ogrenci1.setTelNumaraları(numaralar);

        System.out.println(ogrenci1);

    }
}
