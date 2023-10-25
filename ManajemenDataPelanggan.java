import java.util.Scanner;

public class ManajemenDataPelanggan {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cusName = "", cusAddress = "", cusCont = "";
        int pilihan;

        while (true) {
            System.out.println("===MANAJEMEN DATA PELANGGAN===");
            System.out.println("1. Pelanggan Baru");
            System.out.println("2. Data Pelanggan");
            System.out.println("3. Edit Data Pelanggan");
            System.out.println("4. Kembali ke Menu Utama");
            System.out.print("Pilih operasi (1/2/3/4): ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 :
                System.out.println("===Pelanggan Baru===");
                System.out.print("Masukkan Nama Pelanggan               : ");
                cusName = input.nextLine();
                System.out.print("Masukkan Alamat Pelanggan             : ");
                cusAddress = input.nextLine();
                System.out.print("Masukkan Nomor Telephone Pelanggan    : ");
                cusCont = input.nextLine();
                break;

                case 2 :
                System.out.println("===Data Pelanggan===");
                System.out.println("Nama Pelanggan              : " +cusName);
                System.out.println("Alamat Pelanggan            : " +cusAddress);
                System.out.println("Nomor Telephone Pelanggan   : " +cusCont);
                System.out.println("Riwayat Transaksi           : " ); ///riwayat transaksi
                break;

                case 3 :
                if (cusName.isEmpty()) {
                    System.out.println("Data pelanggan belum diisi.");
                } else {
                    System.out.println("===Edit Data Pelanggan===");
                    System.out.print("Masukkan Nama Baru Pelanggan              : ");
                    cusName = input.nextLine();
                    System.out.print("Masukkan Alamat Baru Pelanggan baru       : ");
                    cusAddress = input.nextLine();
                    System.out.print("Masukkan Nomor Telephone Baru Pelanggan   : ");
                    cusCont = input.nextLine();
                    System.out.println("Data pelanggan berhasil diperbarui.");
                }
                break;

                case 4 :
                System.out.println("===MENU UTAMA===");
                break;

                default:
                System.out.println("PILIHAN TIDAK VALID. Silakan coba lagi.");
                break;
            }
        } 
    }
}
