package org.example;

public class Operatorler {
    public static void main (String[] args){

        int a = 40;
        int b = 20;
        double c = 55.12;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a/c);

        // arttırma operatörleri ''++'' ve ''--'' olarak kullanılır. Bir arttırma ve bir eksiltme

        System.out.println(++a);
        System.out.println(++a);
        System.out.println(--b);
        System.out.println(--b);

        // atama operatörleri = şeklinde ifade edilir. Karşılaştırma operatörü ile karıştırmamalıdır.

        int d = 50;
        d += 3;
        System.out.println(d);
        d -= 2;
        System.out.println(d);

        // d +=3 ifadesi ile d=d+3 ifadesi aynı anlama gelmektedir.


    }

}
