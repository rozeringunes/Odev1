package com.java1;

public class donguler {
    public static void main(String[] args) {
        String urun="Telefon";
        for (int i=1;i<=100;i++){
            System.out.println(urun + i);
        }
        for (int i =1;i<=10; i++){
            System.out.println(i);
        }
        int sayi =10;
        while (sayi <= 100) {
            System.out.println(sayi);
            sayi = sayi+10;
        }
        //şartı görmeden bir kere çalışır
        int sayi2 = 11;
        do{
            System.out.println(sayi2);
            sayi = sayi+10;
        }while(sayi2>100);
    }
}
