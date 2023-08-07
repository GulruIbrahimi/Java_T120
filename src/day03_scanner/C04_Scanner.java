package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip,
        // asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");

        String girilenIsim = scanner.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");

        String girilenSoyisim = scanner.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");

        int girilenYas = scanner.nextInt();

        /*
        System.out.println("Isminiz : " + girilenIsim);
        System.out.println("Soyisminiz : " + girilenSoyisim);
        System.out.println("Yaşınız : " + girilenYas);
        System.out.println("Kaydınız başarı ile alınmıştır");
         */

        // sout icerisindeki bir String'in yazdirilmasina
        // alt satirdan devam edilmesini isterseniz
        // String'in alt satira gecmesini istediginiz kisminda \n yazin

        System.out.println("Isminiz :" + girilenIsim +
                "\nSoyisminiz :" + girilenSoyisim +
                "\nYaşınız :" + girilenYas +
                "\nKaydınız başarı ile alınmıştır");
    }
}
