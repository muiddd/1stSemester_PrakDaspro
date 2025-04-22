import java.util.Scanner ;
public class Siakad01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS,  nilaiAkhir;

        System.out.println("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.println("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.println("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.println("Masukkan nilai UAS: ");

        nilaiUAS = sc.nextDouble();
        nilaiAkhir = (nilaiKuis*0.20 + nilaiTugas*0.15 + nilaiUTS*0.30 + nilaiUAS*0.35) ;
        
        System.out.println("Nama: " + nama + "NIM: "  + nim);
        System.out.println("Kelas: " + kelas + "Absen: "  + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}