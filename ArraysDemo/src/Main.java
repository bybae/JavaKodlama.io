public class Main {

    public static void main(String[] args) {
        String ogrenci1 ="Semoş";
        String ogrenci2 ="Beyzoş";
        String ogrenci3 ="Hiloş";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("-------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0]="Semoş";
        ogrenciler[1]="Beyzoş";
        ogrenciler[2]="Hiloş";
        ogrenciler[3]="Havvoş";


        for (int i=0;i<ogrenciler.length;i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("-------------------");

        for (String ogrenci:ogrenciler) {
            System.out.println(ogrenci);
        }
    }



}