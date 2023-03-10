package org.example;

public class SwitchCaseOdev {
    public static void main(String [] args){

        int haftaninGunu = 1;
        switch (haftaninGunu){
            case 1:
                System.out.println("Bugun gunlerden Pazartesidir");
                break;
            case 2:
                System.out.println("Bugun gunlerden Salidir");
                break;
            case 3:
                System.out.println("Bugun gunlerden carsambadir");
            case 4:
                System.out.println("Bugun gunlerden Persembedir");
                break;
            case 5:
                System.out.println("Bugun gunlerden cumadir");
                break;
            case 6:
                System.out.println("Bugun gunlerden cumartesidir");
                break;
            case 7:
                System.out.println("bugun gunlerden pazardir");

                // java 14 ve üzerinde case 1 ->sout şeklinde yazılır.


        }

    }
}
