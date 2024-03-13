package com.java1;

public class workshop1 {

        public static  void main (String[]  args){
            int [] sayilar = new int [] {2,3,4,5,9,8,7,10,15};
            int aranacak = 15;
            boolean varMi = sayiBul(sayilar,15);
            mesajVer (varMi ,aranacak);
        }
        public static void mesajVer (boolean varMi , int aranacak){
            String mesaj = " ";
            if (varMi==true){
                mesaj = "Sayı mevcuttur :"+aranacak;
                System.out.println(mesaj);
            }else{
                mesaj ="Sayı mevcut değildir:"+aranacak;
                System.out.println(mesaj);
            }
        }
        public static boolean sayiBul (int [] sayilar,int aranacak) {
            boolean varMi = false;
            for (int sayi : sayilar) {
                if (sayi == aranacak) {
                    varMi = true;
                    break;
                }
            }
            return varMi;
        }
    }


