import java.util.Scanner;

public class manajemenArmada {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang: ");
        int jumlahBarang = input.nextInt();

        for (int i = 1; i <= jumlahBarang; i++) {
            System.out.print("Masukkan berat barang ke-" + i + " (dalam kilogram): ");
            float beratBarang = input.nextFloat();

            for (int j = 1; j <= 1; j++) {
                if (beratBarang >= 120) {
                    System.out.println("Barang ke-" + i + " dikirim menggunakan mobil");
                } else {
                    System.out.println("Barang ke-" + i + " dikirim menggunakan motor");
                }
            }
        }
    }
}
