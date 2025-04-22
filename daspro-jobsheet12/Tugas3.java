import java.util.Scanner;
public class Tugas3 {

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Masukkan bulan (1-12): ");
        int bulan = sc.nextInt(); 
        int jumlahPasangan = fibonacci(bulan);

        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + " adalah " + jumlahPasangan);

        sc.close();
    }    
}
