import java.util.Scanner;
public class UKLsusah1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah siswa: ");
        int jumlahsiswa  = input.nextInt();
        int totalnilai = 0; // Harus di kasih nilai, kalau tidak, program tidak bisa berjalan karena tidak ada nilai awal di perhitungan

        int [] nilaisiswa = new int[jumlahsiswa];

        for(int i=0; i< jumlahsiswa; i++){ 

            System.out.println("Nilai siswa ke-" + (i + 1) + ": "); // tambahkan 1 biar outputnya ga aneh
            nilaisiswa [i]= input.nextInt();
            
            totalnilai += nilaisiswa [i]; // menambahkan semua nilai siswa dan disimpan di totalnilai
        }
        System.out.println("Data siswa :");
        for(int i=0; i< jumlahsiswa; i++){
            System.out.println("Siswa ke " + (i+1) + " Nilai: " + nilaisiswa[i]); // output data seluruh nilai siswa yang dimasukkan
         }
         double ratarata = totalnilai / jumlahsiswa; // total nilai seluruh siswa di bagi dengan banyaknya jumlah siswa
         System.out.println("rata rata nilai siswa adalah: " + ratarata);

    }
}
