package day04_dataCasting_wrapperClass;

public class C05_WrapperClasses {

    public static void main(String[] args) {

        String str1 = "Java Candır";

        System.out.println(str1.charAt(3)); //a

        int sayi = 20;

        /*
            Java primitive data turleri icin hazir method olusturamaz
            ANCAK
            primitive data turleri icin de hazir method'lar kullanabilecek
            Wrapper class'lar olusturmustur

            int ==> Integer
            char ==> Character
            short ==> Short
            double ==> Double ....
            Wrapper class'lar primitive data turleri ile hic problemsiz atama yapilabilir
        */

        int sayi2 = 5;

        Integer sayi3 = sayi2;

        int sayi4 = sayi3;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // Short sayi5 = (Short)sayi3; Wrapper class'lar arasinda casting OLMAZ

        System.out.println(Short.MIN_VALUE);

        // Icinde sadece sayisal ifadeler bulunan bir String verildiginde
        // Matematiksel islem yapmaniz gerekirse
        // Integer.parseInt() ile int'a cevirebiliriz

        String str2 = "22";
        String str3 = "33";

        System.out.println(str2 + str3); // 2233

        System.out.println(Integer.parseInt(str2) + Integer.parseInt(str3)); // 55

        char ch1 = '7';

        System.out.println(Character.isDigit(ch1));
        System.out.println(Character.isLetter(ch1));
        System.out.println(Character.isWhitespace(ch1));
        
    }

}
