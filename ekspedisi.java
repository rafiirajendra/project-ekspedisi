import java.util.Random;
import java.util.Scanner;

public class ekspedisi {
    static String[][] cusData = new String[100][6];
    static int i = 0;
    static int j = 0;
    static int[] transactionHistory = new int[100];
    static double[] jarakPengiriman = new double[100];

    public static void main(String[] args) {
        loginKaryawan();
    }

    public static void menuUtama() {
        Scanner sc = new Scanner(System.in);
        int pilihan;
            while (true) {
                System.out.println("===MENU UTAMA===");
                System.out.println("1. Manajemen Data Pelanggan");
                System.out.println("2. Biaya Pengiriman");
                System.out.println("3. Manajemen Pengiriman Paket");
                System.out.println("4. Manajemen Armada");
                System.out.println("5. Pelacakan");
                System.out.println("6. Tampilkan Analitik");
                System.out.println("7. Logout");
                System.out.println("8. Exit");
                System.out.print("Pilih operasi (1/2/3/4/5/6/7/8): ");
                pilihan = sc.nextInt();
                sc.nextLine();

                switch (pilihan) {
                    case 1:
                        ManajemenDataPelanggan();
                        break;
                    case 2:
                        BiayaPengiriman();
                        break;
                    case 3:
                        manajemenPengirimanPaket();
                        break;
                    case 4:
                        manajemenArmada();
                        break;
                    case 5:
                        pelacakanUtkKaryawan();
                        break;
                    case 6:
                        tampilkanAnalitik(transactionHistory);
                        break;
                    case 7:
                        logout();
                        break;
                    case 8:
                        exit();
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                        break;
                }
            }
        }

    
    // fitur login
    public static void loginKaryawan() {
        Scanner sc = new Scanner(System.in);
        String username, password, nik, user;
        
        System.out.println("==========================");
        System.out.println("=  WELCOME TO EKSPEDISI  =");
        System.out.println("==========================");
        

        while (true) {
            System.out.print("LOGIN SEBAGAI (karyawan/pelanggan): ");
            user = sc.nextLine();
            if (user.equalsIgnoreCase("karyawan") || user.equalsIgnoreCase("pelanggan")) {
                break;
            } else {
                System.out.println("USER TIDAK VALID! (silakan masukkan 'karyawan' atau 'pelanggan')");
            }
        }

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
                    menuUtama();
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
                    pelacakanUtkPelanggan();
                    logout();
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
        

    // fitur manajemen data pelanggan
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
        System.out.print("Pilih Lokasi Tujuan Pengiriman (contoh: Kota Batu)  : ");
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
    public static void ManajemenDataPelanggan(){
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
                                if (cusData[j][0].equals(searchName)) {
                                    nameFound = true;
                                    System.out.println("Nama Pengirim             : " +cusData[j][0]);
                                    System.out.println("Alamat Pengirim           : " +cusData[j][1]);
                                    System.out.println("Nomor Telephone Pengirim  : " +cusData[j][2]);
                                    System.out.println("Nama Penerima             : " +cusData[j][3]);
                                    System.out.println("Nomor Telephone Penerima  : " +cusData[j][4]);
                                    System.out.println("Lokasi Tujuan Pengiriman  : " +cusData[j][5]);
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
                        menuUtama();
                        break;
    
                    default:
                        System.out.println("PILIHAN TIDAK VALID. Silakan coba lagi.");
                        break;
                }
            }
        }

    // fitur biaya pengiriman
    public static void BiayaPengiriman() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==============================");
            System.out.println("=   Program Biaya Pengiriman  =");
            System.out.println("==============================");
    
            System.out.println("1. Biaya Pengiriman");
            System.out.println("2. Resi Pengiriman");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1/2/3): ");
            int pilihanMenu = sc.nextInt();
            sc.nextLine(); // Membersihkan newline

            switch (pilihanMenu) {
                case 1:
                    menuBiayaPengiriman(sc);
                    break;
                case 2:
                    menuResiPengiriman();
                    break;
                case 3:
                    System.out.println("Terima kasih. Program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    public static void menuBiayaPengiriman(Scanner sc) {
        int biayaKm = 4000, biayaBrt = 5000;
        double beratBarang, biayaPengiriman;

        System.out.println("==============================");
        System.out.println("=   Program Biaya Pengiriman  =");
        System.out.println("==============================");

        System.out.print("Masukkan jarak pengiriman (dalam km): ");
        System.out.print("Masukkan Nama Pelanggan yang ingin ditampilkan  : ");
        String searchName = sc.nextLine();
        boolean nameFound = false;
    
        for (int j = 0; j < i; j++) {
            if (cusData[j][0].equals(searchName)) {
                nameFound = true;
                lokasiTujuan(j);         
                System.out.println("jarak             : " +jarakPengiriman[j]);
                }
        }
        System.out.print("Masukkan berat barang (dalam kg): ");
        beratBarang = sc.nextDouble();
        System.out.print("Pilih jenis layanan (reguler/ekspres): ");
        String jenisLayanan = sc.next();

        System.out.println("\nMenghitung biaya pengiriman...");

        biayaPengiriman = jarakPengiriman[j] * biayaKm + beratBarang * biayaBrt;

        if (jarakPengiriman[j] <= 10) {
            if (beratBarang <= 5) {
                biayaPengiriman *= 0.8;  // ini merupakan pajak tarif pengiriman jarak kurang dari 10 km 
            }
        } else if (jarakPengiriman[j] > 10 && jarakPengiriman[j] <= 50) {
            if (beratBarang > 5) {
                biayaPengiriman *= 1.2;  // ini pajak tarif pengiriman untuk jarak untuk jarak lebih dari 10 km hingga kurang lebih dari 50
            }
        } else {
            biayaPengiriman *= 1.5;  // ini pajak tarif tambahan untuk jarang yang lebih jauh 
        }

        double biayaReguler = biayaPengiriman;
        double biayaEkspres = biayaPengiriman *= 1.5;

        System.out.println("=== Hasil Perhitungan ===");
        System.out.println("Jarak Pengiriman   : " + jarakPengiriman + " km");
        System.out.println("Berat Barang       : " + beratBarang + " kg");
        System.out.println("Jenis Layanan      : " + jenisLayanan);

        if (jenisLayanan.equalsIgnoreCase("reguler")) {
            System.out.println("\nBiaya Pengiriman (Reguler) : Rp" + biayaReguler);
        } else if (jenisLayanan.equalsIgnoreCase("ekspres")) {
            System.out.println("Biaya Pengiriman (Ekspres) : Rp" + biayaEkspres);
        } else {
            System.out.println("Jenis layanan tidak valid.");
        }

        System.out.println("\nTerima kasih telah menggunakan program biaya pengiriman.");
    }

    public static void menuResiPengiriman() {
        // Menampilkan nomor resi yang dihasilkan
        String nomorResi = generateNomorResi();
        System.out.println("=== Resi Pengiriman ===");
        System.out.println("Nomor Resi         : " + nomorResi);

        // Meminta pengguna untuk memasukkan nomor resi
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nomor resi yang ingin dicek: ");
        String inputNomorResi = scanner.nextLine();

        // Memeriksa nomor resi yang dimasukkan sesuai dengan nomor resi yang dihasilkan
        if (validateNomorResi(inputNomorResi, nomorResi)) {
            System.out.println("Nomor resi valid.");
        } else {
            System.out.println("Nomor resi tidak valid.");
        }
    }

    // Fungsi untuk menghasilkan nomor resi secara acak
    static String generateNomorResi() {
        Random random = new Random();
        // Menghasilkan nomor resi dengan panjang 6 karakter
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(random.nextInt(10)); // Menambahkan digit acak dari 0 hingga 9
        }
        return sb.toString();
    }

    // Fungsi untuk memvalidasi nomor resi 
    static boolean validateNomorResi(String inputNomorResi, String nomorResi) {
        return inputNomorResi.equals(nomorResi);
    }    
    // fitur manajemen pengiriman paket
    public static void manajemenPengirimanPaket() {

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
            System.out.println("3. Kembali ke Menu Utama");
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
                    menuUtama();
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

    // fitur manajemen armada
    public static void manajemenArmada(){
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

    // fitur pelacakan

    public static void pelacakanUtkPelanggan() {
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
                logout();
            }
        }
    }
    public static void pelacakanUtkKaryawan(){
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
                menuUtama();
            }
        }
    }

    private static void inputResi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nomor resi: ");
        int resi = sc.nextInt();
        String statusPaket = lacakStatusPaket(resi);
        System.out.println("Status Paket: " + statusPaket);
    }

    private static String lacakStatusPaket(int resi) {
        String[] status = {"Proses pengiriman", "Paket sudah sampai"};
        Random random = new Random();
        int acak = random.nextInt(status.length);
        return status[acak];
    }
        // fitur laporan dan analitik
        public static void tampilkanAnalitik(int[] transactionHistory) {
        int i = transactionHistory.length;
        if (i == 0) {
            System.out.println("Data pelanggan belum diisi.");
            return;
        }

        int totalTransaksi = 0;
        int pelangganReguler = 0;
        int pelangganEkspres = 0;

        for (int j = 0; j < i; j++) {
            totalTransaksi += transactionHistory[j];
            if (transactionHistory[j] > 5) {
                pelangganReguler++;
            } else {
                pelangganEkspres++;
            }
        }

        float rataRataTransaksi = (float) totalTransaksi / i;

        System.out.println("\n====== ANALITIK ======");
        System.out.println("Total Pelanggan: " + i);
        System.out.println("Rata-rata Jumlah Transaksi: " + rataRataTransaksi);
        System.out.println("Pelanggan Layanan Reguler : " + pelangganReguler);
        System.out.println("Pelanggan Layanan Ekspres : " + pelangganEkspres);
    }
    

    // logout
    public static void logout() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Apakah Anda ingin Logout? (Y/y)");
        char jawab = sc.nextLine().charAt(0);
        if (Character.toLowerCase(jawab) == 'y') {
            System.out.println("LOGOUT SUCCESSFUL");
            System.out.println("Apakah Anda ingin login lagi? (Y/y)");
            jawab = sc.nextLine().charAt(0);
            if (Character.toLowerCase(jawab) == 'y') {
                loginKaryawan();
            } else {
                exit();
            }
        }
    }

    //exit
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
}
