import java.util.Scanner;
public class UKLmudah2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka");
        int angka = input.nextInt();
        if (angka % 2 == 0) { //Jika angka yang di modulus 2 sama dengan 0 maka angka itu genap
            System.out.println("genap");
        }
        else{ // Jika hasil modulus tidak 0 maka angka itu ganjil
            System.out.println("ganjil");
        };



    }
}