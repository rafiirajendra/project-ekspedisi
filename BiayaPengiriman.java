import java.util.Scanner;

public class BiayaPengiriman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int biayaKm=4000, biayaBrt=5000;
        float jarakPengiriman, beratBarang, biayaPengiriman;

        System.out.println("Masukkan jarak");
        jarakPengiriman = sc.nextFloat();
        System.out.println("Masukkan berat barang");
        beratBarang = sc.nextFloat();

        biayaPengiriman = jarakPengiriman * biayaKm + beratBarang * biayaBrt;  
        System.out.println("Biaya pengiriman adalah: " + biayaPengiriman);


    }

}