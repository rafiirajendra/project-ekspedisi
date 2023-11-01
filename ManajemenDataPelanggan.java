import java.util.Scanner;

public class ManajemenDataPelanggan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] customerData = new String[100][3];
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
                    customerData[i][0] = sc.nextLine();
                    System.out.print("Masukkan Alamat Pelanggan             : ");
                    customerData[i][1] = sc.nextLine();
                    System.out.print("Masukkan Nomor Telephone Pelanggan    : ");
                    customerData[i][2] = sc.nextLine();
                    i++;
                    break;

                case 2 :
                    System.out.println("===Data Pelanggan===");
                    System.out.print("Masukkan Nama Pelanggan yang ingin ditampilkan  : ");
                    String searchName = sc.nextLine();
                    boolean nameFound = false;

                    for (int j = 0; j < i; j++) {
                        if (customerData[j][0].equals(searchName)) {
                            nameFound = true;
                            System.out.println("Nama Pelanggan              : " + customerData[j][0]);
                            System.out.println("Alamat Pelanggan            : " + customerData[j][1]);
                            System.out.println("Nomor Telephone Pelanggan   : " + customerData[j][2]);
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
                            if (customerData[j][0].equals(changeName)) {
                                changeIndex = j;
                                break;
                            }
                        }

                        if (changeIndex != -1) {
                            System.out.print("Masukkan Nama Baru Pelanggan              : ");
                            customerData[changeIndex][0] = sc.nextLine();
                            System.out.print("Masukkan Alamat Baru Pelanggan baru       : ");
                            customerData[changeIndex][1] = sc.nextLine();
                            System.out.print("Masukkan Nomor Telephone Baru Pelanggan   : ");
                            customerData[changeIndex][2] = sc.nextLine();
                            System.out.println("Data pelanggan berhasil diperbarui.");
                        } else {
                            System.out.println("Nama Pelanggan tidak ditemukan.");
                        }
                    }
                    break;

                case 4 :
                System.out.print("Masukkan Nama Pelanggan yang akan dihapus  : ");
                String deleteName = sc.nextLine();
                int deleteIndex = -1;

                for (int j =0; j < i; j++) {
                    if (customerData[j][0].equals(deleteName)) {
                        deleteIndex = j;
                        break;
                    }
                }

                if (deleteIndex != -1) {
                    customerData[deleteIndex][0] = customerData[i - 1][0];
                    customerData[deleteIndex][1] = customerData[i - 1][1];
                    customerData[deleteIndex][2] = customerData[i - 1][2];
                    
                    i--;
                    System.out.println("Data pelanggan berhasil dihapus.");
                }
                else {
                    System.out.println("Nama Pelanggan tidak ditemukan.");
                }
                break;

                case 5:
                    System.out.println("===MENU UTAMA===");
                    System.exit(0); 
                    break;
                default:
                    System.out.println("PILIHAN TIDAK VALID. Silakan coba lagi.");
                    break;
            }
        }
    }
}
