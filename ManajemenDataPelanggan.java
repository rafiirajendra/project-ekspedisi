import java.util.Scanner;

public class ManajemenDataPelanggan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] cusName = new String [100];
        String [] cusAddress = new String [100];
        String [] cusCont = new String [100];
        int pilihan;
        int i = 0;

        while (true) {
            System.out.println("===MANAJEMEN DATA PELANGGAN===");
            System.out.println("1. Pelanggan Baru");
            System.out.println("2. Data Pelanggan");
            System.out.println("3. Edit Data Pelanggan");
            System.out.println("4. Hapus Data Pelanggan");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.print("Pilih operasi (1/2/3/4/5): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1 :
                    System.out.println("===Pelanggan Baru===");
                    System.out.print("Masukkan Nama Pelanggan               : ");
                    cusName [i] = sc.nextLine();
                    System.out.print("Masukkan Alamat Pelanggan             : ");
                    cusAddress [i] = sc.nextLine();
                    System.out.print("Masukkan Nomor Telephone Pelanggan    : ");
                    cusCont [i] = sc.nextLine();
                    i++;
                    break;

                case 2 :
                    System.out.println("===Data Pelanggan===");
                    System.out.print("Masukkan Nama Pelanggan yang ingin ditampilkan  : ");
                        String searchName = sc.nextLine();
                        boolean nameFound = false;

                        for (int j =0; j < i; j++) {
                            if (cusName[j].equals(searchName)) {
                                nameFound = true;
                                System.out.println("Nama Pelanggan              : " + cusName [j]);
                                System.out.println("Alamat Pelanggan            : " + cusAddress [j]);
                                System.out.println("Nomor Telephone Pelanggan   : " + cusCont [j]);
                                System.out.println("Riwayat Transaksi           : "); //riwayat transaksi
                            }
                        }
                        if (!nameFound) {
                            System.out.println("Nama Pelanggan tidak ditemukan.");
                        }
                        break;

                case 3 :
                    if (i == 0) {
                        System.out.println("Data pelanggan belum diisi.");
                    } else {
                        System.out.println("===Edit Data Pelanggan===");
                        System.out.print("Masukkan Nama Pelanggan yang akan diubah  : ");
                        String changeName = sc.nextLine();
                        int changeIndex = -1;

                        for (int j =0; j < i; j++) {
                            if (cusName[j].equals(changeName)) {
                                changeIndex = j;
                                break;
                            }
                        }

                        if (changeIndex != -1) {
                            System.out.print("Masukkan Nama Baru Pelanggan              : ");
                            cusName [changeIndex] = sc.nextLine();
                            System.out.print("Masukkan Alamat Baru Pelanggan baru       : ");
                            cusAddress [changeIndex] = sc.nextLine();
                            System.out.print("Masukkan Nomor Telephone Baru Pelanggan   : ");
                            cusCont [changeIndex] = sc.nextLine();
                            System.out.println("Data pelanggan berhasil diperbarui.");
                        } else {
                            System.out.println("Nama Pelanggan tidak ditemukan.");
                        }
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
