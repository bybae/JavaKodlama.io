public class Main2 {

    public static void main(String[] args) {

        int sayi1 = 25;
        int sayi2 = 27;

        int toplam = sayi1 + sayi2;
        int cıkarma = 0;
        if (sayi1 - sayi2 < 0) {
            cıkarma = (sayi1 - sayi2) * -1;

        } else {
            cıkarma = sayi1 - sayi2;

        }
        System.out.println("Çıkarma İşleminin Sonucu : " + cıkarma);
    }
}
