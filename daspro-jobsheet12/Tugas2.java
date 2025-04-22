import java.util.Scanner;
public class Tugas2 {

    static int hitungPenjumlahan(int n) {
        if (n == 1) {
            System.out.print("1");
            return 1;
        } else {
            int hasilSebelum = hitungPenjumlahan(n - 1);
            System.out.print(" + " + n);
            return n + hasilSebelum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Masukkan bilangan: ");
        int bilangan = sc.nextInt();

        int hasil = hitungPenjumlahan(bilangan);
        System.out.println(" = " + hasil);

        sc.close();
    }
}
