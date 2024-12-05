public class UKLmudah3 {
    public static void main(String[] args) {
        for(int i = 50; i >= 1; i--){ // i-- karena i++ buat menambah
            if (i % 3==2) { // modulus 3 dikarenakan agar ada 3 kelompok sisa
                System.out.println(i + ". saya anak moklet");
            }
            else if (i == 1){
                System.out.println(i +". saya senang");
            }
            else if (i % 3==1) { // modulus 3 hasilnya 1 maka ini yang muncul
                System.out.println(i + ". saya anak wikusama");
            }
            else{ // misal modulus 3 sisa nya 0 maka ini yang muncul
                System.out.println(i + ". saya angkatan 33");
            }
           
        }
        
    }
}
