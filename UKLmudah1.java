import java.util.Scanner;
public class UKLmudah1 {
    public static void main(String[] args) {
        int jarak, harga1, harga2, harga3, volume;
        jarak = 10;
        harga1 = 4250;
        harga2 = 6000;
        harga3 = 50000;
        volume = 100;

        Scanner input = new Scanner(System.in);

        System.out.println("masukkan berat paket");
        int berat = input.nextInt();

        System.out.println("masukkan jarak tempuh");
        int jrk = input.nextInt();

        System.out.println("masukkan tinggi barang");
        int t = input.nextInt();

        System.out.println("masukkan lebar barang");
        int l = input.nextInt();
        
        System.out.println("masukkan panjang barang");
        int p = input.nextInt();

        int volume1 = t * l * p;

        if (jrk <= jarak) {
            int biaya = harga1 * berat;
            if (volume1 > volume) {
                int total = biaya + harga3;
                System.out.println("biaya yang harus diayar adalah : " + total);
            }
            else{
                System.out.println("biaya yang harus diayar adalah : " + biaya);
            }
    
        }
        else if (jrk > jarak) {
            int biaya = harga2 * berat;
            if (volume1 > volume) {
                int total = biaya + harga3;
                System.out.println("biaya yang harus diayar adalah : " + total);
            }
    
        }

    }
}
