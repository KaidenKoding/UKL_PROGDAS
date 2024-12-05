import java.util.Arrays;
import java.util.Scanner;
public class UKLsusah3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("masukkan jumlah angka dalam array"); // Input jumlah
        int jumlah = input.nextInt();

        int [] angka = new int [jumlah];
        boolean[] sudahdihitung = new boolean[jumlah]; // Untuk memastikan nanti


        for(int i=0; i< jumlah; i++){ // Perulangan sebanyak jumlah yang dimasukkan
            System.out.println("angka ke-" + (i + 1) + ": "); // Untuk memasukkan angka
            angka [i]= input.nextInt();
            
        }
        
        System.out.println("Array: " + Arrays.toString(angka)); // Memunculkan array datar

        for (int i = 0; i< jumlah; i++){ // Perulangan di lakukan sebanyak jumlah
            if (!sudahdihitung[i]) { // Di jalankan jika angka belum di hitung atau false
                int hitung = 1; // Karena pasti angka nya ada yang cuman 1 atau dirinya sendiri
                for (int j = i + 1; j < jumlah; j++) { // Mencari angka sama
                    if (angka[i] == angka[j]) { // Jika angka ada yang sama maka di tambahkan ke hitung
                        hitung++; // Di tambah setiap ada angka yang sama
                        sudahdihitung[j] = true; // Angka yang sudah di hitung akan di lewati
                    }
        }
        System.out.println(angka[i] + " muncul " + hitung + " kali"); // Menampilakan sout

        
    }
}
    }
}