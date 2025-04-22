import java.util.Scanner ;
public class Tugasno2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte jmljamkerja;
        double upah, totalgaji, totalgajistlhpajak, bonus = 0.1, totalbonus, pajak = 0.05, totalpajak;

        System.out.println("Masukkan jumlah jam kerja: ");
        jmljamkerja = sc.nextByte();
        System.out.println("Masukkan upah Rp: ");
        upah = sc.nextDouble();
        totalgaji = jmljamkerja*upah;
        totalbonus = totalgaji*bonus;
        totalpajak = (totalgaji+totalbonus)*pajak;
        totalgajistlhpajak = totalgaji+totalbonus-totalpajak;
        System.out.println("Total gaji bersih Rp: " + totalgajistlhpajak);
        
    }
}
