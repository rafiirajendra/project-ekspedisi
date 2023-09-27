import java.util.Scanner;

/**
 * manajemenArmada
 */
public class manajemenArmada {

    public static void main(String[] args) {
        Scanner inputlo = new Scanner(System.in);
        System.out.print("Masukkan total berat barang: ");
        float beratBarang = inputlo.nextFloat();
        
        if (beratBarang >= 120) {
            System.out.println("Barang dikirim menggunakan mobil");
        } else {
            System.out.println("Barang dikirim menggunakan motor");
        }


        
    }
}