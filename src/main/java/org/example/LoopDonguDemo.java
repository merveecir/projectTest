package org.example;

public class LoopDonguDemo {
    public static void main(String[] args) {
        for(double i = 0 ; i < 10 ; i+=0.25){
            System.out.println("degiskenin degeri " +  i);
            //0.25 li bir değer kullanılmak istendiği için double kullanıldı ancak normal durumlarda int ile yazılmalı.
        }
        System.out.println("--------------------");

        int sayfa = 5;
        for (int i = 1; i <= sayfa; i++){
            System.out.println("sayfa sayisi "+ i);
            if (i == 3){
                System.out.println("kosul saglandı " +i );
                break;


            }
        }

        System.out.println("------------------");



        String [] isimler ={"ozan","onur","ali","veli"};
        for(int i=0; i < isimler.length;i++){
            System.out.println("listemdeki isimler " + isimler[i]);
        }
        System.out.println("----------");
        for (String isim : isimler){
            System.out.println("gelismis döngü ile isimler " + isim);

            // gelismiş döngü yeni for döngüsüdür. type item:items şeklinde yazılır.

        }
    }
}
