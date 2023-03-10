package org.example;

import javafx.scene.chart.ScatterChart;

public class TryCatchDemo {
    public static void main(String[] args) {
        int [] sayilar = {1,2,3423,34,3232};
        try{
            System.out.println(sayilar [33]);
            catch (Exception e){
                System.out.println(getMessage());
            }
            System.out.println("hata sonrasi konsola yazdir");
        }
    }
}
