import java.util.Scanner;

public class BiayaPengiriman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int biayaKm = 4000, biayaBrt = 5000;
        float jarakPengiriman, beratBarang, biayaPengiriman;

        System.out.println("==============================");
        System.out.println("=   Program Biaya Pengiriman  =");
        System.out.println("==============================");

        System.out.print("Masukkan jarak pengiriman (dalam km): ");
        jarakPengiriman = sc.nextFloat();
        System.out.print("Masukkan berat barang (dalam kg): ");
        beratBarang = sc.nextFloat();
        System.out.print("Pilih jenis layanan (reguler/ekspres): ");
        String jenisLayanan = sc.next();

        System.out.println("\nMenghitung biaya pengiriman...");

        biayaPengiriman = jarakPengiriman * biayaKm + beratBarang * biayaBrt;

        if (jarakPengiriman <= 10) {
            if (beratBarang <= 5) {
                biayaPengiriman *= 0.8;
            }
        } else if (jarakPengiriman > 10 && jarakPengiriman <= 50) {
            if (beratBarang > 5) {
                biayaPengiriman *= 1.2;
            }
        } else {
            biayaPengiriman *= 1.5;
        }

        float biayaReguler = biayaPengiriman;
        float biayaEkspres = biayaPengiriman *= 1.5;

        System.out.println("=== Hasil Perhitungan ===");
        System.out.println("Jarak Pengiriman   : " + jarakPengiriman + " km");
        System.out.println("Berat Barang       : " + beratBarang + " kg");
        System.out.println("Jenis Layanan      : " + jenisLayanan);

        if (jenisLayanan.equalsIgnoreCase("reguler")) {
            System.out.println("\nBiaya Pengiriman (Reguler) : Rp" + biayaReguler);
        } else if (jenisLayanan.equalsIgnoreCase("ekspres")) {
            System.out.println("Biaya Pengiriman (Ekspres) : Rp" + biayaEkspres);
        } else {
            System.out.println("Jenis layanan tidak valid.");
        }

        System.out.println("\nTerima kasih telah menggunakan program biaya pengiriman.");
    }
}
