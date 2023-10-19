import java.util.Scanner;
/**
 * loginKaryawan
 */
public class loginKaryawan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password, nik, user;

        System.out.println("===WELCOME TO EKSPEDISI===");
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

                if (username.equals("kry123") && password.equals("kry123") && nik.equals("20230123")) {
                    System.out.println("LOGIN SUCCESSFUL");
                    break;
                } else {
                    System.out.println("LOGIN FAILED! (masukkan kembali dengan data yang benar)");
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
                    System.out.println("LOGIN FAILED! (masukkan kembali dengan data yang benar)");
                }
           
            }
        }
        else
            System.out.print("===OUT OF SYSTEM===");
        
    }
}