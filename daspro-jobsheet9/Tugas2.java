import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();  

        String[] namaPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga untuk " + namaPesanan[i] + " : Rp");
            hargaPesanan[i] = sc.nextInt();
            sc.nextLine();  
        }

        int totalBiaya = 0;
        for (int harga : hargaPesanan) {
            totalBiaya += harga;
        }

        System.out.println("--- Daftar Pesanan ---");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " : Rp" + hargaPesanan[i]);
        }
        System.out.println("Total Biaya: Rp" + totalBiaya);
    }
}
