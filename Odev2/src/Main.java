public class Main {
    public static void main(String[] args) {
        Ogrenci[] ogr = {
                new Ogrenci("Gökçe", "Bilgisayar Müh", "2022", 3.4, "102" ),
                new Ogrenci("Furkan", "Bilgisayar Müh", "2020", 2.9, "102"),
                new Ogrenci("Serkan","Makine Müh", "2023", 3.8, "104"),
                new Ogrenci("Nil", "Yapay Zeka Müh", "2023", 3.2, "113"),
        };

        for (Ogrenci ogrenci : ogr) {
            ogrenci.ogrenciBilgileri();
        }
        System.out.println();

        System.out.println(ogr[1].getOgrNo() + " numaralı öğrencinin ödeyeceği harç: " + ogr[1].harcHesapla(9,1));
        System.out.println(ogr[3].getOgrNo() + " numaralı öğrencinin ödeyeceği harç: " + ogr[3].harcHesapla(7));
    }
}