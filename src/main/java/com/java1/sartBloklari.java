package com.java1;

public class sartBloklari {
    public static void main(String[] args) {


        int not = 55;

        //50 ve üzeri :geçti
        //40-49 : bütünleme
        // 0-39 : Kaldı
        //synax
        if (not >= 50) {
            System.out.println("geçti");
        } else if (not >= 40 && not < 50) {
            System.out.println("bütünleme");
        } else {
            System.out.println("kaldı");
        }
    }
}
