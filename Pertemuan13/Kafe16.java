package Pertemuan13;
import java.util.Scanner;

public class Kafe16 {
    public static void Menu(String namaPelanggan, boolean isMember){
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam   - Rp 15,000");
        System.out.println("2. Cappuccino   - Rp 20,000");
        System.out.println("3. Latte        - Rp 22,000");
        System.out.println("4. Teh Tarik    - Rp 12,000");
        System.out.println("5. Roti Bakar   - Rp 10,000");
        System.out.println("6. Mie Goreng   - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan");

        System.out.println();
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaitems = {15000, 20000, 22000, 10000, 12000, 18000};
        return hargaitems[pilihanMenu - 1] * banyakItem;
    }

    public static int hitungTotalDenganPromo(int totalHarga, String kodePromo) {
        if (kodePromo.equals("DISKON50")) {
            totalHarga *= 0.5; // Diskon 50%
        } else if (kodePromo.equals("DISKON30")) {
            totalHarga *= 0.7; // Diskon 30%
        } else if (!kodePromo.equals("")) {
            System.out.println("Kode promo tidak valid, tidak ada diskon.");
        }
        return totalHarga;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Menu("Andi",false);


        int totalKeseluruhan = 0;

        System.out.println("\nMasukkan jumlah jenis menu yang ingin dipesan: ");
        int jumlahPesanan = sc.nextInt();

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\nMasukkan nomor menu ke-" + (i + 1) + ": ");
            int pilihanMenu = sc.nextInt();

            System.out.println("\nMasukkan jumlah item untuk menu ke-" + (i + 1) + ": ");
            int banyakItem = sc.nextInt();

            totalKeseluruhan += hitungTotalHarga(pilihanMenu, banyakItem);
        }

        System.out.println("\nMasukkan kode promo (jika ada, tekan ENTER jika tidak ada): ");
        sc.nextLine(); // Consume newline
        String kodePromo = sc.nextLine();

        int totalSetelahPromo = hitungTotalDenganPromo(totalKeseluruhan, kodePromo);

        System.out.println("\nTotal keseluruhan pesanan Anda setelah diskon (jika berlaku): Rp" + totalSetelahPromo);
    }
}
