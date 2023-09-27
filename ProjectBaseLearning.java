import java.util.Scanner;

public class ProjectBaseLearning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float jarakPengiriman, beratBarang, biayaPengiriman;

        System.out.println("Masukkan jarak");
        jarakPengiriman = sc.nextFloat();
        System.out.println("Masukkan berat barang");
        beratBarang = sc.nextFloat();

        biayaPengiriman = jarakPengiriman * 4000 + beratBarang * 5000;  
        System.out.println("Biaya pengiriman adalah: " + biayaPengiriman);


    }
    
}