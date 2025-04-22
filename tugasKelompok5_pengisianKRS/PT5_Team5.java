import java.util.Scanner;

public class PT5_Team5 {

    static String[][] krsData = new String[100][5];
    static int jumlahMahasiswa = 0;

    public static void tambahKRS(Scanner sc) {
        System.out.println("\n--- Tambah Data KRS ----");
        if (jumlahMahasiswa >= 100) {
            System.out.println("Data penuh. Tidak dapat menambahkan KRS baru.");
            return;
        }

        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("NIM: ");
        String nim = sc.nextLine();

        int totalSKS = 0;
        while (true) {
            System.out.print("Kode Mata Kuliah: ");
            String kodeMK = sc.nextLine();
            System.out.print("Nama Mata Kuliah: ");
            String namaMK = sc.nextLine();
            System.out.print("Jumlah SKS (1-3): ");
            int sks = sc.nextInt();
            System.out.println("Data mata kuliah berhasil ditambahakan.");
            sc.nextLine();

            if (sks < 1 || sks > 3) {
                System.out.println("Jumlah SKS tidak valid. Harus antara 1 dan 3.");
                continue;
            }

            if (totalSKS + sks > 24) {
                System.out.println("Total SKS melebihi batas maksimal (24).");
                break;
            }

            krsData[jumlahMahasiswa][0] = nim;
            krsData[jumlahMahasiswa][1] = nama;
            krsData[jumlahMahasiswa][2] = kodeMK;
            krsData[jumlahMahasiswa][3] = namaMK;
            krsData[jumlahMahasiswa][4] = String.valueOf(sks);

            jumlahMahasiswa++;
            totalSKS += sks;

            System.out.print("Tambah mata kuliah lagi? (y/n): ");
            if (!sc.nextLine().equalsIgnoreCase("y")) {
                break;
            }
        }
    }

    public static void tampilkanKRS(Scanner sc) {
        System.out.println("\n--- Tampilkan Daftar KRS Mahasiswa ---");
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = sc.nextLine();

        int totalSKS = 0;
        System.out.println("Daftar KRS Mahasiswa:");
        System.out.println("NIM\tNama\tKode MK\tNama MK\tSKS");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (krsData[i][0].equals(nim)) {
                System.out.printf("%s\t%s\t%s\t%s\t%s\n",
                        krsData[i][0], krsData[i][1], krsData[i][2], krsData[i][3], krsData[i][4]);
                totalSKS += Integer.parseInt(krsData[i][4]);
            }
        }
        System.out.println("Total SKS: " + totalSKS);
    }

    public static void analisisSKS() {
        System.out.println("\n--- Analisis Data KRS ---");

        int total = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            int totalSKS = 0;

            for (int j = 0; j < jumlahMahasiswa; j++) {
                if (krsData[i][0].equals(krsData[j][0])) {
                    totalSKS += Integer.parseInt(krsData[j][4]);
                }
            }

            if (totalSKS < 20) {
                total++;
            }
        }

        System.out.println("Jumlah mahasiswa yang mengambil SKS kurang dari 20: " + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== Sistem Pemantauan KRS Mahasiswa ===");
            System.out.println("1. Tambah Data KRS");
            System.out.println("2. Tampilkan Daftar KRS Mahasiswa");
            System.out.println("3. Analisis Data KRS");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tambahKRS(sc);
                    break;
                case 2:
                    tampilkanKRS(sc);
                    break;
                case 3:
                    analisisSKS();
                    break;
                case 4:
                    System.out.println("Terima Kasih!.");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid.");
            }
        }
    }
}
