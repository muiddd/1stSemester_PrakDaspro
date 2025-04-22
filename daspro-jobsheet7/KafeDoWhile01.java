import java.util.Scanner;
public class KafeDoWhile01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        double hargakopi=12000, hargateh=7000, hargaroti=20000, totalharga;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = input.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")){
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("Masukkan jumlah kopi: ");
            kopi = input.nextInt();
            System.out.print("Masukkan jumlah teh: ");
            teh = input.nextInt();
            System.out.print("Masukkan jumlah roti: ");
            roti = input.nextInt();
            totalharga = (kopi*hargakopi) + (teh*hargateh) + (roti*hargaroti);
            System.out.println("Total yang harus dibayar: Rp " + totalharga);
            input.nextLine();
        } while(true);

        System.out.println("Semua transaksi selesai.");

        input.close();
    }  
}
