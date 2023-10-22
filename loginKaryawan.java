import java.util.Scanner;
/**
 * loginKaryawan
 */
public class loginKaryawan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password, nik, user;

        System.out.println("===WELCOME TO EKSPEDISI===");

        while (true) {
            System.out.print("LOGIN SEBAGAI : ");
            user = input.nextLine();
            if (user.equalsIgnoreCase("karyawan") || user.equalsIgnoreCase("pelanggan")) {
                break; 
            } else {
                System.out.println("USER TIDAK VALID! (silakan masukkan 'karyawan' atau 'pelanggan')");
            }
        }

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
                    System.out.println("LOGIN FAILED. Isi kembali dengan data yang benar!");
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
                    System.out.println("LOGIN FAILED. Isi kembali dengan data yang benar!");
                }
           
            }
        }
        
    }
}