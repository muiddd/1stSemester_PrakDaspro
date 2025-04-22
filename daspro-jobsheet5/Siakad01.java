import java.util.Scanner ;
public class Siakad01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian,  nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis+ nilaiTugas+ nilaiUjian) / 3 ;

        String huruf = " ",kualifikasi = " ";

        if (nilaiAkhir <= 100 && nilaiAkhir >80) {
            huruf = "A";
            kualifikasi = "sangat baik";
        } else if (nilaiAkhir <= 80 && nilaiAkhir > 73){
            huruf = "B+";
            kualifikasi = "lebih dari baik";
        } else if (nilaiAkhir <= 73 && nilaiAkhir > 65){
            huruf = "B";
            kualifikasi = "baik";
        } else if (nilaiAkhir <= 65 && nilaiAkhir > 60){
            huruf = "C+";
            kualifikasi = "lebih dari cukup";
        } else if (nilaiAkhir <= 60 && nilaiAkhir > 50){
            huruf = "C";
            kualifikasi = "cukup";
        } else if (nilaiAkhir <= 50 && nilaiAkhir > 39){
            huruf = "D";
            kualifikasi = "kurang";
        } else if (nilaiAkhir <= 39){
            huruf = "E";
            kualifikasi = "gagal";
        }
        
        System.out.println("Mahasiswa dengan nama " + nama + " (NIM "  + nim + ")" + " kelas " + kelas + " absen " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Akhir huruf: " + huruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    
    }
}