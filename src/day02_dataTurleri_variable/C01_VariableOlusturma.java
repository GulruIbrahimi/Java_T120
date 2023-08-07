package day02_dataTurleri_variable;

public class C01_VariableOlusturma {

    public static void main(String[] args) {

        int sayi;

        // deklerasyon sadece bir kez yapılabilir
        // ama değer ataması istendiği kadar yapılabilir

        // boolean sayi = 20;

        // bir variable değer atanmadan da deklare edilebilir
        // ancak değer atanmayan bir variable kullanılamaz
        // System.out.println(sayi);

        sayi = 20;

        System.out.println(sayi); // 21. satırda sayi variable'nın değeri 20

        sayi = sayi + 10;

        System.out.println(sayi); // 25. satırda sayi variable'nın değeri 30

    }
}
