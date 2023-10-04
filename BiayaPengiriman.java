import java.util.Scanner;

public class biayaPengiriman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int biayaKm = 4000, biayaBrt = 5000;
        float jarakPengiriman, beratBarang, biayaPengiriman;

        System.out.println("Masukkan jarak (dalam km): ");
        jarakPengiriman = sc.nextFloat();

        System.out.println("Masukkan berat barang (dalam kg): ");
        beratBarang = sc.nextFloat();

        System.out.println("Pilih jenis layanan (reguler/ekspres): ");
        String jenisLayanan = sc.next();

        biayaPengiriman = jarakPengiriman * biayaKm + beratBarang * biayaBrt;

        if (jarakPengiriman <= 10) {
            if (beratBarang <= 5) {
                biayaPengiriman *= 0.8;  // ini merupakan pajak tarif pengiriman jarak kurang dari 10 km 
            }
        } else if (jarakPengiriman > 10 && jarakPengiriman <= 50) {
            if (beratBarang > 5) {
                biayaPengiriman *= 1.2;  // ini pajak tarif pengiriman untuk jarak untuk jarak lebih dari 10 km hingga kurang lebih dari 50
            }
        } else {
            biayaPengiriman *= 1.5;  // ini pajak tarif tambahan untuk jarang yang lebih jauh 
        }
        float biayaReguler = biayaPengiriman;

        float biayaEkspres = biayaPengiriman *= 1.5; //pajak 

        if (jenisLayanan.equals("reguler")) {
            System.out.println("Biaya pengiriman reguler adalah: " + biayaReguler);
    
        } else {
            System.out.println("Biaya pengiriman ekspres adalah: " + biayaEkspres);
       
        }
    }
}