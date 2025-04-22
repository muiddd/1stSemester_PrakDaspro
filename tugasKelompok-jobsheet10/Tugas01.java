import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] responden = new String[10][];

        String namaResponden ;
        int i = 0, pilJawaban = 0;
        double rataResponden = 0, rataKeseluruhan, rataPertanyaan = 0;
        int[] totalPertanyaan = new int[6];

        for (i = 0; i < responden.length; i++) {
            System.out.print("Masukkan nama responden ke-" + (i + 1) + ": ");
            namaResponden = input.nextLine();
            int totalJawaban = 0;
            for (int j = 0; j < 6; j++) {
                System.out.print("Masukkan jawaban (1-5) untuk pertanyaan ke-" + (j + 1) + ": ");
                pilJawaban = input.nextInt();
                input.nextLine();
                totalJawaban += pilJawaban;
                totalPertanyaan[j] += pilJawaban;
            }
            rataResponden = (double) totalJawaban / 6;
            System.out.println("Rata rata survei per responden: " + rataResponden);
        }
        System.out.println("Rata rata per pertanyaan");
        for (int j = 0; j < 6; j++) {
            rataPertanyaan = (double) totalPertanyaan[j] / responden.length;
            System.out.println("Rata rata pertanyaan ke-" + (j + 1) + ": " + rataPertanyaan);
        }
        rataKeseluruhan = rataResponden + rataPertanyaan;
        System.out.println("Rata rata keseluruhan: " + rataKeseluruhan);

        input.close();
    }
}
