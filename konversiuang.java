import java.util.Scanner;
public class konversiuang {
    static void matauang(){
        int jumlah, uang;
        String duit;
        Scanner alat = new Scanner(System.in);
        Scanner konversi = new Scanner(System.in);
        duit = alat.nextLine();
        jumlah = konversi.nextInt();
        System.out.println("pilih mata uang: ");{
            if (duit.equalsIgnoreCase("rupiah")){
                System.out.print("Masukkan Jumlah uang anda");
                uang = jumlah/14500;
                System.out.println("Jumlah uang anda: $"+ uang);
            }
        }
            if (duit.equalsIgnoreCase("dolar")){
                System.out.print("Masukkan Jumlah uang anda");
                uang = jumlah*14500;
                System.out.println("Jumlah uang anda: Rp." + uang);
            }
        }
        public static void main(String[] args) {
            matauang();
        }
    }