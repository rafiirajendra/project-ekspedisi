import java.util.Random;
import java.util.Scanner;

public class Pelacakan {
    public static String lacakStatusPaket(int resi) {
        String[] status = {"Proses pengiriman", "Paket sudah sampai"};
        Random random = new Random();
        int acak = random.nextInt(status.length); 
        return status[acak];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nomor resi: ");
        int resi = sc.nextInt();
    
        String statusPaket = lacakStatusPaket(resi);
        System.out.println("Status Paket: " + statusPaket);
    }
}
