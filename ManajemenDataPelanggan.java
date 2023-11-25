import java.util.Scanner;

public class ManajemenDataPelanggan {
    
    static String [][] cusData = new String [100][6];
    static int i;
    static float jarakPengiriman;
    
    public static void pengirimPaket() {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < cusData.length; i++) {
            System.out.print("Masukkan Nama Pengirim               : ");
            cusData[i][0] = sc.nextLine();
            System.out.print("Masukkan Alamat pengirim             : ");
            cusData[i][1] = sc.nextLine();
            System.out.print("Masukkan Nomor Telephone Pengirim    : ");
            cusData[i][2]= sc.nextLine();
            break;
        }
    }

    public static void penerimaPaket() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < cusData.length; i++) {
            System.out.print("Masukkan Nama Penerima               : ");
            cusData[i][3] = sc.nextLine();
            System.out.print("Masukkan Nomor Telephone Penerima    : ");
            cusData[i][4] = sc.nextLine();
            System.out.println("Opsi Lokasi : A, B, C");
            System.out.print("Pilih Lokasi Tujuan Pengiriman       : ");
            cusData[i][5] = sc.nextLine();
            break;
        }
    }

    public static void dataPelanggan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Pelanggan yang ingin ditampilkan  : ");
        String searchName = sc.nextLine();
        boolean found= false;

        for (int i = 0; i < cusData.length; i++) {
            for (int j = 0; j < cusData[i].length; j++) {
                if (cusData[i][0].equals(searchName)) {
                    found = true;
                    System.out.println("Nama Pengirim             : " +cusData[i][0]);
                    System.out.println("Alamat Pengirim           : " +cusData[i][1]);
                    System.out.println("Nomor Telephone Pengirim  : " +cusData[i][2]);
                    System.out.println("Nama Penerima             : " +cusData[i][3]);
                    System.out.println("Nomor Telephone Penerima  : " +cusData[i][4]);
                    System.out.println("Lokasi Tujuan Pengiriman  : " +cusData[i][5]);
                } 
                if (!found) {
                    System.out.println("Nama Pelanggan tidak ditemukan.");
                }
                break;  
            }
            break;      
        }
    }

    public static void lokasiTujuan() {
        if (cusData[i][5].equalsIgnoreCase("A")) {
            jarakPengiriman = 10;
        } else if (cusData[i][5].equalsIgnoreCase("B")) {
            jarakPengiriman = 20;
        } else if (cusData[i][5].equalsIgnoreCase("C")) {
            jarakPengiriman = 30;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("==============================");
            System.out.println("=  MANAJEMEN DATA PELANGGAN  =");
            System.out.println("==============================");
            System.out.println("1. Pelanggan Baru");
            System.out.println("2. Data Pelanggan");
            System.out.println("3. Edit Data Pelanggan");
            System.out.println("4. Hapus Data Pelanggan");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.print("Pilih operasi (1/2/3/4/5): ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("==PELANGGAN BARU==");
                    pengirimPaket();
                    penerimaPaket();
                    break;
                case 2:
                    System.out.println("==DATA PELANGGAN==");
                    dataPelanggan();
                    break;
                case 3:
                    if (i == 0) {
                        System.out.println("Data pelanggan belum diisi.");
                    } else {
                        System.out.println("==EDIT DATA PELANGGAN==");
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
                            System.out.println("Opsi Lokasi : A, B, C");
                            System.out.print("Pilih Lokasi Tujuan Pengiriman    : ");

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
                        i--;
                        System.out.println("Data pelanggan berhasil dihapus.");
                    } else {
                        System.out.println("Nama Pelanggan tidak ditemukan.");
                    }
                    break;
            
                case 5:
                    System.out.println("==MENU UTAMA==");
                    System.exit(0);
            
                default:
                    System.out.println("PILIHAN TIDAK VALID. Silakan coba lagi.");
                    break;
            }
        }
    }
}