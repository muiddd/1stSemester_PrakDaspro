import java.util.Scanner;
public class Tugasno1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int jmlTiket, totalTiket=0;
        double hargaTiket = 50000,totalHarga, diskon = 0, hargaAwal, totalHargaPenjualan=0 ;

        do {
            System.out.print("Masukkan jumlah tiket (ketik 0 untuk menghentikan transaksi): ");
            jmlTiket = sc.nextInt();

            if (jmlTiket == 0){
                System.out.println("Transaksi dihentikan");
                break;
            }
            if (jmlTiket < 0){
                System.out.println("Jumlah tiket tidak valid. Masukkan ulang jumlah tiket");
                continue;
            }
            if (jmlTiket > 4 && jmlTiket <= 10 ){
                diskon = 0.1;
            } else if (jmlTiket > 10){
                diskon = 0.15;
            }

            hargaAwal = jmlTiket*hargaTiket;
            totalHarga = hargaAwal-(hargaAwal*diskon);
            totalTiket += jmlTiket;
            totalHargaPenjualan += totalHarga;

            System.out.println("Total harga untuk " + jmlTiket + " tiket: Rp " + totalHarga);
        } while(true);

        System.out.println("Total tiket yang terjual " + totalTiket);
        System.out.println("Total harga penjualan tiket: Rp " + totalHargaPenjualan);

        sc.close();
    }
}
