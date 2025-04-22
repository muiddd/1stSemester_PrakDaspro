import java.util.Scanner;
public class Tugas201 {
    static int[][] penjualan = new int[5][7];

    static String[] menu = {"Kopi\t", "Teh\t", "Es Degan", "Roti Bakar", "Gorengan"};

    public static void inputData() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("Masukkan penjualan " + menu[i] + " hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    public static void tampilData() {
        System.out.print("\nHari\t\t");
        for (int i = 1; i <= penjualan[0].length; i++) {
            System.out.print("H" + i + "\t");
        }
        System.out.println();
    
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void menuPenjualanTertinggi() {
        int maxPenjualan = 0;
        String menuTertinggi = "";

        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTertinggi = menu[i];
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi adalah " + menuTertinggi +" dengan total penjualan " + maxPenjualan + ".");
    }

    public static void rataPenjualan() {
        System.out.println("\nRata-rata penjualan untuk setiap menu:");
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = total / 7.0;
            System.out.println(menu[i] + ": " + rataRata);
        }
    }

    public static void main(String[] args) {
        inputData();
        tampilData();
        menuPenjualanTertinggi();
        rataPenjualan();
    }
}
