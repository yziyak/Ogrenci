public class Ogrenci {
    private static class KayitSirasi {
        private int siradakiKayit = 1;
        public int getSiradakiKayit() {
            return siradakiKayit++;
        }
    }
    // Farklı bölümler yazmak için buraya ekle.
    private static final KayitSirasi bilgisayarMuhKayitSirasi = new KayitSirasi();
    private static final KayitSirasi makineMuhKayitSirasi = new KayitSirasi();
    private static final KayitSirasi yapayZekaMuhKayitSirasi = new KayitSirasi();
    private String ad;
    private String bolum;
    private String girisYili;
    private String ogrNo;
    private double gano;
    private String bolumKodu;
    private static int sira = 0;
    public Ogrenci(String ad, String bolum) {
        this.ad = ad;
        this.ad = bolum;
    }

    public Ogrenci(Ogrenci tumBilgiler) {
        this.ad = tumBilgiler.ad;
        this.bolum = tumBilgiler.bolum;
        this.girisYili = tumBilgiler.girisYili;
        this.ogrNo = tumBilgiler.ogrNo;
        this.gano = tumBilgiler.gano;
        this.bolumKodu = tumBilgiler.bolumKodu;
    }

    public Ogrenci(String ad, String bolum, String girisYili, double gano, String bolumKodu) {
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("Gano 0-4 aralığında olmalıdır.");
        }
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.gano = gano;
        this.bolumKodu = bolumKodu;
    }

    public Ogrenci() {
        this.ad = "İsim girilmedi";
        this.bolum = "Bölüm girilmedi";
        this.girisYili = "Giriş yılı girilmedi";
        this.bolumKodu = "Bölüm kodu girilmedi";
    }

    public double harcHesapla(int dersSayisi) {
        return 275*dersSayisi;
    }

    public double harcHesapla(int dersSayisi, double yil) {
        double extra = 275*dersSayisi*yil;
        return 275*dersSayisi+extra;
    }

    public String ogrenciNoOlustur() {
        //Farklı bölümler yazmak için buraya ekle.
        if (bolum.equals("Bilgisayar Müh")) {
            ogrNo = girisYili+bolumKodu+String.format("%03d", bilgisayarMuhKayitSirasi.getSiradakiKayit());
        }
        else if (bolum.equals("Makine Müh")) {
            ogrNo = girisYili+bolumKodu+String.format("%03d", makineMuhKayitSirasi.getSiradakiKayit());
        }
        else if (bolum.equals("Yapay Zeka Müh")) {
            ogrNo = girisYili+bolumKodu+String.format("%03d", yapayZekaMuhKayitSirasi.getSiradakiKayit());
        }
        else throw new IllegalArgumentException("'" + bolum + "' listede yok. Bölüm adını hatalı yazmadıysanız listeye ekleyin.");
        return ogrNo;
    }

    public void ogrenciBilgileri() {
        if (sira == 0) System.out.println("\n   Öğrencilerin Bilgileri");
        sira++;
        System.out.println("OGR-" + sira + " " + ad + " " + bolum +
                " " + ogrenciNoOlustur() + " " + gano);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(String girisYili) {
        this.girisYili = girisYili;
    }

    public String getOgrNo() {
        return ogrNo;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public String getBolumKodu() {
        return bolumKodu;
    }

    public void setBolumKodu(String bolumKodu) {
        this.bolumKodu = bolumKodu;
    }
}