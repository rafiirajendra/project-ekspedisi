import java.util.Scanner;
/**
 * loginKaryawan
 */
public class loginKaryawan {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password, nik, user;
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
                
                System.out.println("==========================");
                System.out.println("=  WELCOME TO EKSPEDISI  =");
                System.out.println("==========================");
                System.out.print("LOGIN SEBAGAI : ");
                user = input.nextLine();

                if (user.equalsIgnoreCase("karyawan")) {
                    while (true) {
                        System.out.print("Masukkan Username Anda                    : ");
                        username = input.nextLine();
                        System.out.print("Masukkan Password Anda                    : ");
                        password = input.nextLine();
                        System.out.print("Masukkan Nomor Identitas Karyawan Anda    : ");
                        nik = input.nextLine();
                        if (username.equals("kary123") && password.equals("kary123") && nik.equals("20230123")) {
                            System.out.println("LOGIN SUCCESSFUL");
                            break;
                        } else {
                            System.out.println("LOGIN FAILED! Masukkan kembali dengan data yang benar.");
                        }
                    }
                }
                else if (user.equalsIgnoreCase("pelanggan")) {
                    while (true) {
                        System.out.print("Masukkan Username Anda                    : ");
                        username = input.nextLine();
                        System.out.print("Masukkan Password Anda                    : ");
                        password = input.nextLine();
                        if (username.equals("cus123") && password.equals("cus123")) {
                            System.out.println("LOGIN SUCCESSFUL");
                            break;
                        } else {
                            System.out.println("LOGIN FAILED! Masukkan kembali dengan data yang benar.");
                        }
                    }
                }
                break;

                case 2 :
                System.out.println("LOGOUT SUCCESS");
                break;

                case 3 :
                System.out.print("Apakah Anda yakin ingin keluar dari Ekspedisi? (Y/y) ");
                char jawab = input.nextLine().charAt(0);
                    if (Character.toLowerCase(jawab) == 'y') {
                        System.out.println("Terimakasih telah menggunakan Ekspedisi kami.");
                        System.exit(0);
                    } else {
                        System.out.println("Kembali ke menu.");
                    }
                break;
            }
        } 
    }
}