import java.util.Scanner;

public class CafeSales3 {
    String[] menu;
    int[][] sales;

    public CafeSales3(int numMenus, int numDays) {
        menu = new String[numMenus];
        sales = new int[numMenus][numDays];
    }

    public void inputSalesData(Scanner scanner) {
        System.out.println("Masukkan data penjualan:");
        for (int i = 0; i < menu.length; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            menu[i] = scanner.next();
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print("Penjualan " + menu[i] + " pada hari ke-" + (j + 1) + ": ");
                sales[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
    }

    public void displayAllSales() {
        System.out.println("\nData Penjualan:");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print(sales[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void displayHighestSales() {
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

    public void displayAverageSales() {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int numMenus = scanner.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int numDays = scanner.nextInt();

        CafeSales3 cafeSales = new CafeSales3(numMenus, numDays);

        System.out.println();
        cafeSales.inputSalesData(scanner);
        cafeSales.displayAllSales();
        cafeSales.displayHighestSales();
        cafeSales.displayAverageSales();
    }
}
