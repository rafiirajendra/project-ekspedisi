import java.util.Scanner;

public class LogOut {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Logout");
            System.out.println("3. Exit");
            System.out.print("Pilih operasi (1/2/3) : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 :
                ///login
                break;

                case 2 :
                System.out.println("LOGOUT SUCCESS");
                break;

                case 3 :
                System.out.print("Apakah Anda yakin ingin keluar dari Ekspedisi? ");
                String jawab = input.nextLine();
                    if (jawab.equalsIgnoreCase("YA")) {
                        System.out.println("Terimakasih telah menggunakan Ekspedisi kami.");
                        System.exit(0);
                    }
                break;

            }
        }
    }
}
