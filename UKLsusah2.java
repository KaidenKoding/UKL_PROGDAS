import java.util.Scanner;

public class UKLsusah2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); // input

        int kolom, baris;

        System.out.print("Masukkan banyaknya baris: ");
        baris = input.nextInt();

        System.out.print("Masukkan banyaknya kolom: ");
        kolom = input.nextInt();

        System.out.println();

        System.out.println(kolom+" angka pertama dihitung 1 baris dan "+kolom+" kolom (berlaku untuk kelipatannya!)\n");
        
        
        int [][] matriks1= new int [baris][kolom]; //  menggunakan array 2 dimensi
        int [][] matriks2= new int [baris][kolom];
        int [][] hasilmatriks= new int [baris][kolom];

        System.out.println("Masukkan angka matriks 1: "); // mengisi matrix
        for (int i = 0; i < baris; i++) {                  
            for (int j = 0; j < kolom; j++) {
                matriks1[i][j]=input.nextInt();
            }
        }

        System.out.println("Masukkan angka matriks 2: ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks2[i][j]=input.nextInt();
            }
        }

        System.out.println("Hasil Perkalian");

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasilmatriks[i][j] = 0;
                for (int j2 = 0; j2 < kolom; j2++) { // menghitung hasil [i][j]
                    hasilmatriks[i][j] += matriks1[i][j2] * matriks2[j2][j]; // hasil disimpan di hasilmatrix
                }
                System.out.print(hasilmatriks[i][j] + "   ");
            }
            System.out.println();
        }
    }
}