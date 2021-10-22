
import java.util.Scanner;
public class hitungan {
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        int P,L,T;
        System.out.print("masukkan nilai panjang: ");
        P = masukan.nextInt();
        System.out.print("masukkan nilai Lebar: ");
        L = masukan.nextInt();
        System.out.print("masukkan nilai tinggi: ");
        T = masukan.nextInt();
        int luas = P*L*T;
        System.out.println();
        System.out.println("Nilai Luas : ");
        System.out.println(luas);
    }
    }