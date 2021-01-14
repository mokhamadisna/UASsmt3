package com.isna.jawaban2;

public class Main {
    
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        bd.HitungLuas();
        bd.HitungKeliling();
        
        System.out.println("NIM SAYA 201969040032");
        System.out.println("=========================");
        System.out.println("===> LUAS DAN KELILING SEGITIGA <===");
        
        Segitiga st = new Segitiga();
        st.HitungLuas();
        System.out.println("================");
        st.HitungKeliling();
        
        System.out.println("================");
        System.out.println("================");
        System.out.println("================");
        
        System.out.println("LUAS DAN KELILING PERSEGI");
        Persegi kotak = new Persegi ();
        kotak.HitungLuas();
        System.out.println("================");
        kotak.HitungKeliling();
        
        System.out.println("================");
        System.out.println("================");
        System.out.println("================");
        
        System.out.println("LUAS DAN KELILING LINGKARAN");
        Lingkaran bundar = new Lingkaran();
        bundar.HitungLuas();
        System.out.println("================");
        bundar.HitungKeliling();
        
    }
}
