import java.util.Scanner ;
public class Pemilihan2Percobaan201 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in) ;

        String  member; 
        int pilihan_menu, jml; 
        double diskon, harga, total_bayar = 0, total_Akhir = 0, potonganqris = 1000 ;

        System.out.println("---------------------------------------------");
        System.out.println("=============== MENU KAFE JTI ===============");
        System.out.println("---------------------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling ");
        System.out.println("---------------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input01.nextInt();
        input01.nextLine();
        System.out.print("Masukkan jumlah pembelian =  ");
        jml = input01.nextInt();
        input01.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input01.nextLine();
        System.out.println("---------------------------------------------");
        
        if (member.equals("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = Rp " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = Rp  " + harga); 
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = Rp " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            total_bayar = harga*jml - ((harga*jml) * diskon);
            System.out.println("Total bayar setelah diskon = Rp " + total_bayar);
        }   

        else if (member.equals("n")){
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = Rp " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = Rp " + harga); 
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = Rp " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            total_bayar = jml*harga;
            System.out.println("Total bayar = Rp " + total_bayar);

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("---------------------------------------------");

        System.out.print("Pilih metode pembayaran (Qris/Tunai) = ");
        String pembayaran = input01.nextLine();

        if (pembayaran.equalsIgnoreCase("Qris")){
            total_Akhir = total_bayar - potonganqris ;
            System.out.println("Mendapat potongan harga sebesar Rp 1000");
            System.out.println("Total yang harus anda bayar Rp " + total_Akhir);
        } else if (pembayaran.equalsIgnoreCase("Tunai")){
            System.out.println("Total yang harus anda bayar Rp : " + total_bayar);
        } else {
            System.out.println("Metode pembayaran tidak valid");
        }

        System.out.println("---------------------------------------------");

   }
}