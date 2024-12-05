import java.util.Scanner;
public class UKLsedang1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan bilangan bulat positif yang ingin di faktorial: ");
        int bilangan = input.nextInt();
        int faktorial = 1;

        for (int i=1; i <= bilangan; i++){
            faktorial *=i;
        }

        System.out.println("faktorial dari " + bilangan + " adalah " + faktorial);
    }
}
