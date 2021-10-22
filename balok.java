import java.util.Scanner;

public class balok {
    static void bangun_ruang(){
        int P, L, T, Luas, keliling, volume;
        Scanner masukan= new Scanner(System.in);
        System.out.print("masukkan nilai panjang: ");
        P = masukan.nextInt();
        System.out.print("masukkan nilai Lebar: ");
        L = masukan.nextInt();
        System.out.print("masukkan nilai tinggi: ");
        T = masukan.nextInt();
        Luas = (P*L)+(P*T)+(L*T);
        keliling = 4*(P+L+T);
        volume = (P*L*T);
        System.out.println("Hasil Perhitungan bangun ruang:");
        System.out.println("Luas:" + Luas);
        System.out.println("Keliling:" + keliling);
        System.out.println("Volume:" + volume);
    }
    public static void main(String[] args) {
    bangun_ruang();    
    }
}
