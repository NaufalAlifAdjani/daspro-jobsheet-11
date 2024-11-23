import java.util.Scanner;

public class Kubus16 {
    // Fungsi untuk menghitung volume
    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi; // Rumus volume = sisi × sisi × sisi
    }
    
        // Fungsi untuk menghitung luas permukaan
    public static double hitungLuasPermukaan(double sisi) {
        return 6 * (sisi * sisi); // Rumus luas permukaan = 6 × (sisi × sisi)
    }
            
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();
            
        // Membuat objek Kubus16
        Kubus16 kubus = new Kubus16();
            
        // Menampilkan hasil perhitungan
        System.out.println("Volume kubus: " + hitungVolume(sisi));
        System.out.println("Luas permukaan kubus: " + hitungLuasPermukaan(sisi));
    }
}
