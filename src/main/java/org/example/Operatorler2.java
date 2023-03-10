package org.example;

public class Operatorler2 {
    public static void main (String[] args){
        int a = 30;
        int b = 40;

        //karşılaştırma operatörleri
        // == eşittir , != eşit değildir,> büyüktür,< küçüktür,>= büyük veya eşittir,<= küçük veya eşittir

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        // karşılaştırma yaparken && ve , || veya anlamına gelmektedir.

        if (a < 40 || b > 10){
            System.out.println("kosul saglandi");
        }

    }
}
