import java.util.Scanner;

public class ekspedisi {
    static Scanner sc = new Scanner(System.in);
    static String[] cusName = new String[100];
    static String[] cusAddress = new String[100];
    static String[] cusCont = new String[100];
    static int[] transactionHistory = new int[100];
    static int i = 0;

    public static void main(String[] args) {
        String username, password, nik, user;
        int pilihan;

        do {
            System.out.println("==========================");
            System.out.println("=  WELCOME TO EKSPEDISI  =");
            System.out.println("==========================");
            System.out.print("LOGIN SEBAGAI : ");
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
                        System.out.println("-----------------------------------");
                        break;
                    } else {
                        System.out.println("LOGIN FAILED! Masukkan kembali dengan data yang benar.");
                        System.out.println("-----------------------------------");
                    }
                }
            } else if (user.equalsIgnoreCase("pelanggan")) {
                while (true) {
                    System.out.print("Masukkan Username Anda                    : ");
                    username = sc.nextLine();
                    System.out.print("Masukkan Password Anda                    : ");
                    password = sc.nextLine();
                    if (username.equals("cus123") && password.equals("cus123")) {
                        System.out.println("LOGIN SUCCESSFUL");
                        break;
                    } else {
                        System.out.println("LOGIN FAILED! Masukkan kembali dengan data yang benar.");
                    }
                }
            }

            System.out.println("1. Pelanggan Baru");
            System.out.println("2. Data Pelanggan");
            System.out.println("3. Edit Data Pelanggan");
            System.out.println("4. Hapus Data Pelanggan");
            System.out.println("5. Laporan Pelanggan");
            System.out.println("6. Analitik");
            System.out.println("7. Kembali ke Menu Utama");
            System.out.print("Pilih operasi (1/2/3/4/5/6/7): ");
            pilihan = sc.nextInt();
            sc.nextLine(); // Menangkap karakter newline

            switch (pilihan) {
                case 1:
                    System.out.println("===Pelanggan Baru===");
                    tambahPelanggan();
                    break;

                case 2:
                    System.out.println("===Data Pelanggan===");
                    tampilkanDataPelanggan();
                    break;

                case 3:
                    if (i == 0) {
                        System.out.println("Data pelanggan belum diisi.");
                    } else {
                        System.out.println("===Edit Data Pelanggan===");
                        editDataPelanggan();
                    }
                    break;

                case 4:
                    hapusDataPelanggan();
                    break;

                case 5:
                    laporanPelanggan();
                    break;

                case 6:
                    tampilkanAnalitik();
                    break;

                case 7:
                    System.out.println("===MENU UTAMA===");
                    System.exit(0);
                    break;

                default:
                    System.out.println("PILIHAN TIDAK VALID. Silakan coba lagi.");
                    break;
            }
        } while (true);
    }

    public static void tambahPelanggan() {
        System.out.print("Masukkan Nama Pelanggan               : ");
        cusName[i] = sc.nextLine();
        System.out.print("Masukkan Alamat Pelanggan             : ");
        cusAddress[i] = sc.nextLine();
        System.out.print("Masukkan Nomor Telephone Pelanggan    : ");
        cusCont[i] = sc.nextLine();
        System.out.print("Masukkan Riwayat Transaksi Pelanggan  : ");
        transactionHistory[i] = sc.nextInt();
        i++;
    }

    public static void tampilkanDataPelanggan() {
        System.out.print("Masukkan Nama Pelanggan yang ingin ditampilkan  : ");
        String searchName = sc.nextLine();
        boolean nameFound = false;

        for (int j = 0; j < i; j++) {
            if (cusName[j].equals(searchName)) {
                nameFound = true;
                System.out.println("Nama Pelanggan              : " + cusName[j]);
                System.out.println("Alamat Pelanggan            : " + cusAddress[j]);
                System.out.println("Nomor Telephone Pelanggan   : " + cusCont[j]);
                System.out.println("Riwayat Transaksi           : " + transactionHistory[j]);
            }
        }
        if (!nameFound) {
            System.out.println("Nama Pelanggan tidak ditemukan.");
        }
    }

    public static void editDataPelanggan() {
        System.out.print("Masukkan Nama Pelanggan yang akan diubah  : ");
        String changeName = sc.nextLine();
        int changeIndex = -1;

        for (int j = 0; j < i; j++) {
            if (cusName[j].equals(changeName)) {
                changeIndex = j;
                break;
            }
        }

        if (changeIndex != -1) {
            System.out.print("Masukkan Nama Baru Pelanggan              : ");
            cusName[changeIndex] = sc.nextLine();
            System.out.print("Masukkan Alamat Baru Pelanggan baru       : ");
            cusAddress[changeIndex] = sc.nextLine();
            System.out.print("Masukkan Nomor Telephone Baru Pelanggan   : ");
            cusCont[changeIndex] = sc.nextLine();
            System.out.print("Masukkan Riwayat Transaksi Baru Pelanggan  : ");
            transactionHistory[changeIndex] = sc.nextInt();
            System.out.println("Data pelanggan berhasil diperbarui.");
        } else {
            System.out.println("Nama Pelanggan tidak ditemukan.");
        }
    }

    public static void hapusDataPelanggan() {
        System.out.print("Masukkan Nama Pelanggan yang akan dihapus  : ");
        String deleteName = sc.nextLine();
        int deleteIndex = -1;

        for (int j = 0; j < i; j++) {
            if (cusName[j].equals(deleteName)) {
                deleteIndex = j;
                break;
            }
        }

        if (deleteIndex != -1) {
            cusName[deleteIndex] = cusName[i - 1];
            cusAddress[deleteIndex] = cusAddress[i - 1];
            cusCont[deleteIndex] = cusCont[i - 1];
            transactionHistory[deleteIndex] = transactionHistory[i - 1];
            i--;
            System.out.println("Data pelanggan berhasil dihapus.");
        } else {
            System.out.println("Nama Pelanggan tidak ditemukan.");
        }
    }

    public static void laporanPelanggan() {
        if (i == 0) {
            System.out.println("Data pelanggan belum diisi.");
            return;
        }

        System.out.println("=== LAPORAN PELANGGAN ===");
        for (int j = 0; j < i; j++) {
            System.out.println("Nama Pelanggan              : " + cusName[j]);
            System.out.println("Alamat Pelanggan            : " + cusAddress[j]);
            System.out.println("Nomor Telephone Pelanggan   : " + cusCont[j]);
            System.out.println("Jumlah Transaksi            : " + transactionHistory[j]);
            System.out.println("------------------------------");
        }
    }

    public static void tampilkanAnalitik() {
        if (i == 0) {
            System.out.println("Data pelanggan belum diisi.");
            return;
        }

        // Logika analitik dapat ditambahkan di sini
        System.out.println("=== ANALITIK PELANGGAN ===");
        // ...
    }
}


import java.util.Scanner;

public class manajemenPengirimanPaket {
    public static void main(String[] args) {

        String Abarang;
        int jmlhbarang;
        float brtBarang;
        String next;

       Scanner sc = new Scanner(System.in);

       String[][] barang = new String[10][10];

        while (true) {
            System.out.println("====================");
            System.out.println("    Pilih menu  ");
            System.out.println("====================");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan barang");
            System.out.println("3. Keluar Menu");
            System.out.print("Pilih angka 1/2/3: ");

           int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                do {
                    System.out.print("Masukkan nama barang: ");
                    Abarang = sc.next();
                    System.out.print("Masukkan jumlah barang: ");
                    jmlhbarang = sc.nextInt();
                    System.out.print("Masukkan berat barang(dalam kg): ");
                    brtBarang = sc.nextFloat();
                    sc.nextLine();

                    for (int i = 0; i < barang.length; i++) {
                      if (barang[i][0] == null) {
                          barang[i][0] = Abarang;
                          barang[i][1] = String.valueOf(jmlhbarang);
                          barang[i][2] = String.valueOf(brtBarang);
                          break;
                      }
                  }

                    System.out.print("Input barang lagi? (y/n)");
                    next = sc.nextLine();
                } while (next.equalsIgnoreCase("y"));
                    break;
                case 2:
                System.out.println("========================");
                System.out.println("Daftar barang: ");
                for (int i = 0; i < barang.length; i++) {
                    for (int j = 0; j < barang[i].length; j++) {
                        if (barang[i][j] != null) {
                            System.out.println("Nama Barang: " + barang[i][j]);
                            j++;
                            System.out.println("Jumlah Barang: " + barang[i][j]);
                            j++;
                            System.out.println("Berat Barang (kg): " + barang[i][j]);
                            System.out.println("========================");
                        }
                    }
                }
                break;
                case 3:
                    System.out.println("=================");
                    System.out.println("    Thank you   ");
                    System.out.println("=================");
                    System.exit(0);
                default:
                    System.out.println("Inputan anda tidak valid");
                    System.out.print("Apakah Anda ingin memasukkan angka lagi (Y/N)? ");
                    String input = sc.next();
                    if (input.equalsIgnoreCase("N")) {
                        System.out.println("=================");
                        System.out.println("    Thank you   ");
                        System.out.println("=================");
                        System.exit(0);
                    }
                    break;
            }
            
        }

    }
}

public class manajemenArmada {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang: ");
        int jumlahBarang = input.nextInt();

        for (int i = 1; i <= jumlahBarang; i++) {
            System.out.print("Masukkan berat barang ke-" + i + " (dalam kilogram): ");
            float beratBarang = input.nextFloat();

            for (int j = 1; j <= 1; j++) {
                if (beratBarang >= 120) {
                    System.out.println("Barang ke-" + i + " dikirim menggunakan mobil");
                } else {
                    System.out.println("Barang ke-" + i + " dikirim menggunakan motor");
                }
            }
        }
    }
}
import java.util.Random;
import java.util.Scanner;

public class Pelacakan {

    public static void inputResi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nomor resi: ");
        int resi = sc.nextInt();
        String statusPaket = lacakStatusPaket(resi);
        System.out.println("Status Paket: " + statusPaket);
    }
    public static String lacakStatusPaket(int resi) {
        String[] status = {"Proses pengiriman", "Paket sudah sampai"};
        Random random = new Random();
        int acak = random.nextInt(status.length); 
        return status[acak];
    }

    public static void main(String[] args) {
        System.out.println("===================");
        System.out.println("= PELACAKAN PAKET =");
        System.out.println("===================");
        Scanner sc = new Scanner(System.in);
        inputResi();

        while (true) {
        System.out.print("Ingin melacak paket yang lain? (y/n): ");
        String pilih = sc.nextLine();
            if (pilih.equalsIgnoreCase("y")) {
                inputResi();
            } else {
                System.exit(0);
            }
        }
    }
}
