package org.example;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] isimler = {"Ali","Mehmet","Ayşe","Ahmet"};
        int[] sayilar = {5,10,30,1203,124};

        System.out.println(isimler[1]);
        System.out.println(sayilar[3]);
        System.out.println(sayilar[0] + isimler[3]);

        isimler[3]= "Merve";
        System.out.println(isimler[3]);
        //isimler [3] stringi değiştirildi ve değiştikten sonra ona uygun olarak gelmeye başladı. Tanımlanan string öncesinde ilk tanımı gelmeye devam eder.

        String[] webUrl = {"www.sayfa1.com","www.sayfa2.com"};
        System.out.println(webUrl[0]);

        int diziUzunlugu = isimler.length;
        System.out.println(diziUzunlugu);

        for (int i=0;i < isimler.length; i++) {
            System.out.println(isimler[i]);
        }

    }
}
