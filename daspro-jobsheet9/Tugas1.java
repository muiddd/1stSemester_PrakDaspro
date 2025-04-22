import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai mahasiswa yang akan diinput: ");
        int jumlahMahasiswa = sc.nextInt();
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        int total = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
            total += nilaiMahasiswa[i]; 
        }

        double rataRata = (double) total / jumlahMahasiswa;

        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];

        for (int i = 1; i < jumlahMahasiswa; i++) {
            if (nilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa[i];
            }
        }

        System.out.println("--- Hasil ---");
        System.out.print("Nilai Mahasiswa: ");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print(nilaiMahasiswa[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Nilai Rata-Rata : " + rataRata);
        System.out.println("Nilai Tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai Terendah  : " + nilaiTerendah);
    }
}
