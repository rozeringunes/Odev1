package com.java1;

    public class metotlar {
    public static void main(String[] args) {
        mesajVer("Rozerin");
        mesajVer("Ali");

        hesapla();
        hesapla();
        hesapla();
       System.out.println( topla(9,7));
       System.out.println(toplananIkiSayininYuzdeOnu(100,200));
}
public static void mesajVer(String isim ){
        System.out.println("Hello " + isim);

}
public static void hesapla(){
        System.out.println("Hesaplandı");
}
//return ifadeli metotlar
public static  int topla(int sayi1, int sayi2){
         int toplam = sayi1+sayi2;
   return toplam;
}
//toplanan iki sayinin %10 unu bul
        public static double toplananIkiSayininYuzdeOnu (int sayi1,int sayi2) {
            int toplam = topla(sayi1, sayi2);
            double sonuc = toplam * 10 / 100;
            return sonuc;
        }
        public static double krediHesapla (double krediMiktari){
        //hesaplar yapılır
            return 125000;

        }
//DRY -Do not Repeat Yourself
}
