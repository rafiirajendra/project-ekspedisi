import java.util.Random;
import java.util.Scanner;

public class Pelacakan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nommor resi: ");
        int resi = sc.nextInt();

        String[] status = {"Proses pengiriman", "Paket sudah sampai"};
        Random random = new Random();
        int acak = random.nextInt(status.length); 
        String statusPaket = status[acak];
    
        System.out.println("Status Paket: " + statusPaket);
    }
}
