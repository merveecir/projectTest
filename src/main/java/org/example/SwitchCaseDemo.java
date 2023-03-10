package org.example;

public class SwitchCaseDemo {
    public static void main(String[] args){

        int sayi = 3;

        switch (sayi){
            case 1:
                System.out.println("verilen sayi 1 e esittir");
                break;
            case 2:
                System.out.println("verilen sayi 2 ye esittir");
                break;
            default:
                System.out.println("sayi 1e ya da 2 ye esit degildir");

        }

        int bulundugumuzAy = 1;

        switch (bulundugumuzAy){
            case 1:
                System.out.println("Bulundugumuz ay Ocaktir");
                break;
            case 2:
                System.out.println("Bulundugumuz ay Subattir");
                break;
            case 3:
                System.out.println("Bulundugumuz ay Marttir");
                break;
            default:
                System.out.println("yazılan deger dogru degildir");

                }

                String browser = "Chrome";

                switch (browser){
                    case "Chrome":
                        System.out.println("Chrome browserini baslat");
                        // webdriver.startDriver.startChrome
                        break;
                    case "Firefox":
                        System.out.println("Firefox browserini baslat");
                        //webdriver.startDriver.startFirefox
                        break;
                    default:
                        System.out.println("tanimsiz bir browser");
        }
    }
}
