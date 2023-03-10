package org.example;

public class VeriTipleriDemosu {
    public static void main(String[] args) {
        byte mybyte = 50;
        short myshort = 25000;
        int myInt = 150000000;
        long myLong = 1000000000000000L;
        float myFloat = 56.44f;
        double myDouble = 56.55;
        char myChar = 'B' ;
        boolean myBoolean = true;
        // en çok kullandığımız int,double ve boolean

        int veriGenisletme = mybyte;
        System.out.println(veriGenisletme);

        int veriDaraltma = (int) myDouble;
        System.out.println(veriDaraltma);

        int floatDaraltma = (int) myFloat;
        System.out.println(floatDaraltma);

        //Daha büyük bir değişkeni küçük bir değişkene atamak için önüne anahtar tipini yazıyoruz (int)
        //küçük bir değişkeni büyük bir değişkene atarken buna yazmamıza gerek yok otomatik olarak değişiyor.

    }
}
