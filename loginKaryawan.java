import java.util.Scanner;
/**
 * loginKaryawan
 */
public class loginKaryawan {

    public static void main(String[] args) {
        int usernameBetul = 123;
        int passwordBetul = 456 ;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Username anda: ");
        int username = input.nextInt();
        System.out.print("Masukkan Password anda: ");
        int password = input.nextInt();

    if (usernameBetul == username && passwordBetul == password) {
        System.out.println("Anda berhasil login ");
    } else {
        System.out.println("Username dan Password anda SALAH!");
    }
    }
}