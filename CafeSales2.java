import java.util.Scanner;

public class CafeSales2 {
    public static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    public static int[][] sales = new int[5][7]; // 5 menu, 7 hari
    
        // Fungsi untuk menampilkan seluruh data penjualan
        public static void displayAllSales() {
            System.out.println("\nData Penjualan:");
            for (int i = 0; i < menu.length; i++) {
                System.out.print(menu[i] + ": ");
                for (int j = 0; j < sales[i].length; j++) {
                System.out.print(sales[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan menu dengan penjualan tertinggi
    public static void displayHighestSales() {
        String topMenu = "";
        int maxSales = 0;
        for (int i = 0; i < menu.length; i++) {
            int totalSales = 0;
            for (int j = 0; j < sales[i].length; j++) {
                totalSales += sales[i][j];
            }
            if (totalSales > maxSales) {
                maxSales = totalSales;
                topMenu = menu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi: " + topMenu + " dengan total penjualan " + maxSales);
    }

    // Fungsi untuk menampilkan rata-rata penjualan setiap menu
    public static void displayAverageSales() {
        System.out.println("\nRata-rata penjualan setiap menu:");
        for (int i = 0; i < menu.length; i++) {
            int totalSales = 0;
            for (int j = 0; j < sales[i].length; j++) {
                totalSales += sales[i][j];
            }
            double average = (double) totalSales / sales[i].length;
            System.out.println(menu[i] + ": " + average);
        }
    }

    // Fungsi untuk memasukkan data penjualan
    public static void inputSalesData(Scanner scanner) {
        System.out.println("\nMasukkan data penjualan:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                sales[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan data penjualan
        inputSalesData(scanner);

        // Menampilkan seluruh data penjualan
        displayAllSales();

        // Menampilkan menu dengan penjualan tertinggi
        displayHighestSales();

        // Menampilkan rata-rata penjualan setiap menu
        displayAverageSales();
    }
}
