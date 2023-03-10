public class İlkStringDemo {
    public static void main(String[] args) {

        String ilkMetin = "Test Otomasyonu";
        System.out.println(ilkMetin);

        String sonMetin = "Selenium";
        System.out.println(sonMetin);

        int metinUzunlugu = ilkMetin.length();
        System.out.println(metinUzunlugu);

        String kucukHarf = ilkMetin.toLowerCase();
        System.out.println(kucukHarf);

        String buyukHarf = sonMetin.toUpperCase();
        System.out.println(kucukHarf + buyukHarf);
        System.out.println(kucukHarf + buyukHarf + metinUzunlugu);

        String yeniString = "En sevdigim \n\"film\" Avatar";
        System.out.println(yeniString);
        // \n\ ile alt satıra geçilir.
        // yeni string değişkeni tanımlarken tırnak içerisinde belirtilirse \ kullanılmalıdır.


    }
}
