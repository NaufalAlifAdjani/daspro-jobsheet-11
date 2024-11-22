package Pertemuan13;

import java.util.Scanner;
public class Percobaan616 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.println("Masukkan panjang");
        p=sc.nextInt();
        System.out.println("Masukkan lebar");
        l=sc.nextInt();
        System.out.println("Masukkan tinggi");
        t=sc.nextInt();

        // L=p*l; //sebelum menggunakan fungsi
        L=hitungLuas(p, l); //menggunakan fungsi
        System.out.println("Luas persegi panjang adalah "+L);

        // vol=p*l*t; //sebelum menggunakan fungsi
        vol = hitungVolume(t, p, l); //menggunakan fungsi
        System.out.println("Volume balok adalah "+vol);
    }

    static int hitungLuas(int pjg, int lb){
        int Luas=pjg*lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b){
        int volume=hitungLuas(a, b)*tinggi;
        return volume;
    }
}
