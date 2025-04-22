import java.util.Scanner ;
public class Tugasno1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int tarifListrik = 1500;
        boolean penggunaanListrik;
        double totalTagihan, jmlPenggunaan;

        System.out.println("Masukkan jumlah penggunaan listrik (kwh): ");
        jmlPenggunaan = sc.nextDouble();

        penggunaanListrik = jmlPenggunaan > 500;
        totalTagihan = tarifListrik * jmlPenggunaan;
        System.out.println(" Total tagihan Rp " + totalTagihan);
        System.out.println(" Apakah Penggunaan Listrik lebih dari 500 " + penggunaanListrik);

        //input : jumlah penggunaan
        /*
         * 
         */
    }
}