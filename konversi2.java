import java.util.Scanner;

    public class konversi2 {
        static void matauang(){
            Scanner input = new Scanner(System.in);
            float jumlah;
            String jenis;
            System.out.println("Pilihan: \n 1. rupiah \n 2. dolar");
            System.out.println("pilih mata uang anda: ");
            jenis = input.next();
            switch (jenis) {
                case "rupiah" :
                    System.out.print("masukan jumlah uang: ");
                    jumlah = input.nextFloat();
                    System.out.println("mata uang anda: " + jenis);
                    System.out.println("Jumlah uang anda: $" + jumlah/14500);
                    break;
                case "dolar" :
                    System.out.print("masukan jumlah uang: ");
                    jumlah = input.nextFloat();
                    System.out.println("mata uang anda: " + jenis);
                    System.out.println("Jumlah uang anda: Rp." + jumlah*14500);
                    break;
                default:
                    System.out.println("=========================");
                    System.out.println("Mata uang tidak ditemukan");
                    break;
            }
            }
    public static void main(String[] args) {
        matauang();
    }
}
