import java.util.Scanner;

public class ManajemenDataPelanggan {

    static String[][] cusData = new String[100][6];
    static int i = 0;
    static int j = 0;
    static double [] jarakPengiriman = new double[100];

    public static void pelanggan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Pengirim               : ");
        cusData[i][0] = sc.nextLine();
        System.out.print("Masukkan Alamat pengirim             : ");
        cusData[i][1] = sc.nextLine();
        System.out.print("Masukkan Nomor Telephone Pengirim    : ");
        cusData[i][2]= sc.nextLine();
        System.out.print("Masukkan Nama Penerima               : ");
        cusData[i][3] = sc.nextLine();
        System.out.print("Masukkan Nomor Telephone Penerima    : ");
        cusData[i][4] = sc.nextLine();
        System.out.println("Opsi Lokasi:");
        System.out.println("1. Kab. Banyuwangi  6. Kab. Jember");
        System.out.println("2. Kab. Tuban       7. Kab. Lamongan");
        System.out.println("3. Kab. Pasuruan    8. Kab. Blitar");
        System.out.println("4. Kota Madiun      9. Kota Batu");
        System.out.println("5. Kab. Ngawi       10. Kota Surabaya");
        System.out.print("Pilih Lokasi Tujuan Pengiriman       : ");
        cusData[i][5] = sc.nextLine();
        lokasiTujuan(j);
        i++;
    }

    public static void lokasiTujuan(int j) {
        if (cusData[j][5].equalsIgnoreCase("Kab. Banyuwangi")) {
            jarakPengiriman[j] = 309;
        } else if (cusData[j][5].equalsIgnoreCase("Kab. Tuban")) {
            jarakPengiriman[j] = 190;
        } else if (cusData[j][5].equalsIgnoreCase("Kab. Pasuruan")) {
            jarakPengiriman[j] = 43.8;
        } else if (cusData[j][5].equalsIgnoreCase("Kota Madiun")) {
            jarakPengiriman[j] = 233;
        } else if (cusData[j][5].equalsIgnoreCase("Kab. Ngawi")) {
            jarakPengiriman[j] = 262;
        } else if (cusData[j][5].equalsIgnoreCase("Kab. Jember")) {
            jarakPengiriman[j] = 199;
        } else if (cusData[j][5].equalsIgnoreCase("Kab. Lamongan")) {
            jarakPengiriman[j] = 147;
        } else if (cusData[j][5].equalsIgnoreCase("Kab. Blitar")) {
            jarakPengiriman[j] = 68.1;
        } else if (cusData[j][5].equalsIgnoreCase("Kota Batu")) {
            jarakPengiriman[j] = 17.3;
        } else if (cusData[j][5].equalsIgnoreCase("Kota Surabaya")) {
            jarakPengiriman[j] = 94.6;
        } 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        

        while (true) {
            System.out.println("===MANAJEMEN DATA PELANGGAN===");
            System.out.println("1. Pelanggan Baru");
            System.out.println("2. Data Pelanggan");
            System.out.println("3. Edit Data Pelanggan");
            System.out.println("4. Hapus Data Pelanggan");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.print("Pilih sub menu (1/2/3/4/5): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    pelanggan();
                    break;
                    
                case 2:
                    System.out.println("===Data Pelanggan===");
                    System.out.print("Masukkan Nama Pelanggan yang ingin ditampilkan  : ");
                    String searchName = sc.nextLine();
                    boolean nameFound = false;

                    for (int j = 0; j < i; j++) {
                        for (int k = 0; k < i; k++) {
                            if (cusData[j][0].equals(searchName)) {
                                nameFound = true;
                                System.out.println("Nama Pengirim             : " +cusData[j][0]);
                                System.out.println("Alamat Pengirim           : " +cusData[j][1]);
                                System.out.println("Nomor Telephone Pengirim  : " +cusData[j][2]);
                                System.out.println("Nama Penerima             : " +cusData[j][3]);
                                System.out.println("Nomor Telephone Penerima  : " +cusData[j][4]);
                                System.out.println("Lokasi Tujuan Pengiriman  : " +cusData[j][5]);
                                // lokasiTujuan(j);         
                                // System.out.println("jarak " +jarakPengiriman[j]);        (ditampilkan di biaya pengiriman)
                            }
                        }
                    }
                    if (!nameFound) {
                        System.out.println("Nama Pelanggan tidak ditemukan.");
                    }
                    break;

                case 3:
                    if (i == 0) {
                        System.out.println("Data pelanggan belum diisi.");
                    } else {
                        System.out.println("===Edit Data Pelanggan===");
                        System.out.print("Masukkan Nama Pelanggan yang akan diubah  : ");
                        String changeName = sc.nextLine();
                        int changeIndex = -1;

                        for (int j = 0; j < i; j++) {
                            if (cusData[j][0].equals(changeName)) {
                                changeIndex = j;
                                break;
                            }
                        }

                        if (changeIndex != -1) {
                            System.out.print("Masukkan Nama Pengirim            : ");
                            cusData[changeIndex][0] = sc.nextLine();
                            System.out.print("Masukkan Alamat Pengirim          : ");
                            cusData[changeIndex][1] = sc.nextLine();
                            System.out.print("Masukkan Nomor Telephone Pengirim : ");
                            cusData[changeIndex][2] = sc.nextLine();
                            System.out.print("Masukkan Nama Penerima            : ");
                            cusData[changeIndex][3] = sc.nextLine();
                            System.out.print("Masukkan Nomor Telephone Penerima : ");
                            cusData[changeIndex][4] = sc.nextLine();
                            System.out.println("Opsi Lokasi:");
                            System.out.println("1. Kab. Banyuwangi  6. Kab. Jember");
                            System.out.println("2. Kab. Tuban       7. Kab. Lamongan");
                            System.out.println("3. Kab. Pasuruan    8. Kab. Blitar");
                            System.out.println("4. Kota Madiun      9. Kota Batu");
                            System.out.println("5. Kab. Ngawi       10. Kota Surabaya");
                            System.out.print("Pilih Lokasi Tujuan Pengiriman    : ");
                            cusData[changeIndex][5] = sc.nextLine();
                            System.out.println("Data pelanggan berhasil diperbarui.");
                        } else {
                            System.out.println("Nama Pelanggan tidak ditemukan.");
                        }
                    }
                    break;

                case 4:
                    System.out.print("Masukkan Nama Pelanggan yang akan dihapus  : ");
                    String deleteName = sc.nextLine();
                    int deleteIndex = -1;

                    for (int j = 0; j < i; j++) {
                        if (cusData[j][0].equals(deleteName)) {
                            deleteIndex = j;
                            break;
                        }
                    }

                    if (deleteIndex != -1) {
                        cusData[deleteIndex][0] = cusData[i - 1][0];
                        cusData[deleteIndex][1] = cusData[i - 1][1];
                        cusData[deleteIndex][2] = cusData[i - 1][2];
                        cusData[deleteIndex][3] = cusData[i - 1][3];
                        cusData[deleteIndex][4] = cusData[i - 1][4];
                        cusData[deleteIndex][5] = cusData[i - 1][5];
                        i--;
                        System.out.println("Data pelanggan berhasil dihapus.");
                    } else {
                        System.out.println("Nama Pelanggan tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.println("===MENU UTAMA===");
                    System.exit(0);

                default:
                    System.out.println("PILIHAN TIDAK VALID. Silakan coba lagi.");
                    break;
            }
        }
    }
}