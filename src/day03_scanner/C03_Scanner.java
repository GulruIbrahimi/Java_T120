package day03_scanner;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir double, bir de int sayi alip
        // bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir double sayi giriniz");

        double girilenDouble = scanner.nextDouble();

        System.out.println("lutfen bir tam sayi giriniz");

        int girilenTamSayi = scanner.nextInt();

        System.out.println("Girilen iki sayinin toplamı : " + (girilenDouble + girilenTamSayi));
        System.out.println("Girilen iki sayının çarpımı : " + girilenDouble * girilenTamSayi);

    }
}
