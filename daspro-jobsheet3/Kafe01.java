import java.util.Scanner ;
public class Kafe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti, nominalint;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar;
        float diskon = 10 / 100f;
        byte totalbyte;

        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = sc.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = sc.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = sc.nextInt();

        totalHarga = (jmlKopi * hargaKopi) + (jmlRoti * hargaRoti) + (jmlTeh * hargaTeh);
        nominalBayar = totalHarga - (diskon * totalHarga);
        nominalint = (int) nominalBayar;
        totalbyte = (byte) totalHarga;

        System.out.println("keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti, ");
        System.out.println("Nominal bayar Rp " + nominalBayar);
        System.out.println("NominalInt Rp " + nominalint);
        System.out.println("Total harga " + totalHarga);
        System.out.println("Total Byte " + totalbyte);

  


    }
}
    

