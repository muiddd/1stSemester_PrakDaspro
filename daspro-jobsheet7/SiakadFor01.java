import java.util.Scanner;
public class SiakadFor01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jmlLulus=0, jmlTidakLulus=0;
        double nilai, tertinggi = 0, terendah = 100 ;

        for (int i=1; i<= 10; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = input.nextDouble();
            if (nilai > tertinggi){
                tertinggi = nilai;
            }if (nilai < terendah){
                terendah = nilai;
            }if (nilai >= 60){
                jmlLulus++;
            }else {
                jmlTidakLulus++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + jmlLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + jmlTidakLulus);
        input.close();
    }
}