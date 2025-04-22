import java.util.Scanner ;
public class Tugas01 {
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in) ;

        String jenis ;
        int jml ;
        double disc = 0 , total_disc, harga = 20000, harga_sblm_disc, total_harga ;

        System.out.print("Masukkan jenis buku : ");
        jenis = input.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jml = input.nextInt();

        if (jenis.equalsIgnoreCase("Kamus")){
            disc = 0.1 ;
            if (jml > 2){
                disc += 0.02 ;
            } else {
                disc += 0 ;
            }
        }else if (jenis.equalsIgnoreCase("Novel")){
            disc = 0.07 ;
            if (jml > 3){
                disc += 0.02 ;
            } else {
                disc += 0.01 ;
            }
        }else {
            if (jml > 3){
                disc = 0.05 ;
            } else {
                disc += 0 ;
            }
        }
        
        harga_sblm_disc = jml * harga ;
        total_disc = disc * harga_sblm_disc ;
        total_harga = harga_sblm_disc - total_disc ;

        System.out.println("Anda mendapatkan diskon sebesar : Rp " + total_disc);
        System.out.println("Total yang harus anda bayar sebesar : Rp " + total_harga);
    }
    
}
