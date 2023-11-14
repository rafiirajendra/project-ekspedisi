import java.util.Random;
import java.util.Scanner;

public class Pelacakan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nommor resi: ");
        int resi = sc.nextInt();

        String[] strings = {"Proses pengiriman", "Paket sudah sampai"};
        Random random = new Random();
        int randomIndex = random.nextInt(strings.length); 
        String randomString = strings[randomIndex];
    
        System.out.println("Status Paket: " + randomString);
    }
}
