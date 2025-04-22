import java.util.Scanner;
public class PemilihanHariDenganIf01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.print("Masukkan hari (1-7): ");
    int hari = sc.nextInt(); 

    if (hari >=1 && hari <=5){
        System.out.println("Hari tersebut merupakan weekday");
    }else if (hari == 6 || hari == 7){
        System.out.println("Hari tersebet merupakan hari weekend");
    }else {
        System.out.println("Invalid Number");
    }
    }
}