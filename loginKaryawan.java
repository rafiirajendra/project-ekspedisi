import java.util.Scanner;
/**
 * loginKaryawan
 */
public class loginKaryawan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        
        while (true) {
            System.out.print("Masukkan Username Anda : ");
            username = input.nextLine();
            System.out.print("Masukkan Password Anda : ");
            password = input.nextLine();
            
            if (username.equals("user123") && password.equals("pass123")) {
                System.out.println("Anda Berhasil Login");
                break;
            } else {
                System.out.println("Username dan Password Anda Salah!");
            }
        }

    }
}