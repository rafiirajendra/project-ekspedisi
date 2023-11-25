import java.util.Random;
import java.util.Scanner;

public class Pelacakan {

    public static void inputResi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nomor resi: ");
        int resi = sc.nextInt();
        String statusPaket = lacakStatusPaket(resi);
        System.out.println("Status Paket: " + statusPaket);
    }
    public static String lacakStatusPaket(int resi) {
        String[] status = {"Proses pengiriman", "Paket sudah sampai"};
        Random random = new Random();
        int acak = random.nextInt(status.length); 
        return status[acak];
    }

    public static void main(String[] args) {
        System.out.println("===================");
        System.out.println("= PELACAKAN PAKET =");
        System.out.println("===================");
        Scanner sc = new Scanner(System.in);
        inputResi();

        while (true) {
        System.out.print("Ingin melacak paket yang lain? (y/n): ");
        String pilih = sc.nextLine();
            if (pilih.equalsIgnoreCase("y")) {
                inputResi();
            } else {
                System.exit(0);
            }
        }
    }
}
