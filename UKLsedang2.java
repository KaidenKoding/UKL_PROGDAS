public class UKLsedang2 {
    static double hitungvolume(double r, double t){ // tipe data method harus sama dengan return
        double Pi = 3.14;

        double volume = Pi * r * r * t; // nah return nya adalah volume dan volume ada double
        return volume; // mengembalikan hasil volume ke main dan disimpan di hasil
    }

    public static void main(String[] args) {
    double hasilvolume = hitungvolume(10, 10); // pemberian nilai r dan t ada di disini 
                                             // hasil dari volume disimpan di hasil
    System.out.println("Volume tabung: " + hasilvolume);
    }
}
