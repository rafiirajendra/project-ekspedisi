import java.util.Scanner;

public class loginKaryawan {

    public static void logout() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Apakah Anda ingin Logout? (Y/y)");
        char jawab = sc.nextLine().charAt(0);
        if (Character.toLowerCase(jawab) == 'y') {
            System.out.println("LOGOUT SUCCESSFUL");
        } else {
            System.out.println("Kembali ke menu.");
        }
    }

    public static void exit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Apakah Anda yakin ingin keluar dari Ekspedisi? (Y/y)");
        char jawab = sc.nextLine().charAt(0);
        if (Character.toLowerCase(jawab) == 'y') {
            System.out.println("Terimakasih telah menggunakan Ekspedisi kami.");
            System.exit(0);
        } else {
            System.out.println("Kembali ke menu.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username, password, nik, user;
        
        System.out.println("==========================");
        System.out.println("=  WELCOME TO EKSPEDISI  =");
        System.out.println("==========================");
        System.out.print("LOGIN SEBAGAI (karyawan/pelanggan): ");
        user = sc.nextLine();

        if (user.equalsIgnoreCase("karyawan")) {
            while (true) {
                System.out.print("Masukkan Username Anda                    : ");
                username = sc.nextLine();
                System.out.print("Masukkan Password Anda                    : ");
                password = sc.nextLine();
                System.out.print("Masukkan Nomor Identitas Karyawan Anda    : ");
                nik = sc.nextLine();
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
                System.out.print("Masukkan Username Anda : ");
                username = sc.nextLine();
                System.out.print("Masukkan Password Anda : ");
                password = sc.nextLine();
                if (username.equals("cus123") && password.equals("cus123")) {
                    System.out.println("LOGIN SUCCESSFUL");
                    break;
                } else {
                    System.out.println("LOGIN FAILED! Masukkan kembali dengan data yang benar.");
                }
            }
        }
        else {
            System.out.println("Pengguna yang dimasukkan tidak valid. Masukkan 'karyawan' atau 'pelanggan'.");
        }
    }
}