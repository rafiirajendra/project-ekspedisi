import java.util.Random;
import java.util.Scanner;

public class ekspedisi {
    static String[][] cusData = new String[100][6];
    static String[][] barang = new String[100][3];
    static int[] transactionHistory = new int[100];
    static double[] jarakPengiriman = new double[100];
    static String[] nomorResiArray = new String [100];
    static int i = 0;
    static int j = 0;
    static String[] truk;
    static Scanner sc = new Scanner(System.in);
    static char jawab;
    public static void main(String[] args) {
        loginKaryawan();
    }

    public static void menuUtama() {
        int pilihan;
            do {
                System.out.println("==============================");
                System.out.println("=         MENU UTAMA         =");
                System.out.println("==============================");
                System.out.println("1. Manajemen Data Pelanggan");
                System.out.println("2. Biaya Pengiriman");
                System.out.println("3. Manajemen Pengiriman Paket");
                System.out.println("4. Manajemen Armada");
                System.out.println("5. Pelacakan");
                System.out.println("6. Tampilkan Analitik");
                System.out.println("7. Logout");
                System.out.println("8. Exit");
                System.out.print("Pilih sub menu (1/2/3/4/5/6/7/8): ");
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
                        logoutKaryawan();
                        break;
                    case 8:
                        exit();
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                        break;   
                }
            break;
            } while (pilihan !=8);
        }

    
    // fitur login
    public static void loginKaryawan() {
        String username, password, nik, user;
        
        System.out.println("====================================");
        System.out.println("=       WELCOME TO EKSPEDISI       =");
        System.out.println("====================================");
        while (true) {
            System.out.println("LOGIN SEBAGAI (karyawan/pelanggan): ");
            user = sc.nextLine();
    
            if (user.equalsIgnoreCase("karyawan")) {
                while (true) {
                    System.out.println("----------------------------------------------------");
                    System.out.print("Masukkan Username Anda                    : ");
                    username = sc.nextLine();
                    System.out.print("Masukkan Password Anda                    : ");
                    password = sc.nextLine();
                    System.out.print("Masukkan Nomor Identitas Karyawan Anda    : ");
                    nik = sc.nextLine();
                    System.out.println("----------------------------------------------------");
                    if (username.equals("kary123") && password.equals("kary123") && nik.equals("20230123")) {
                        System.out.println("LOGIN SUCCESSFUL\n");
                        menuUtama();
                        break;
                    } else {
                        System.out.println("LOGIN FAILED! Masukkan kembali dengan data yang benar.");
                    }
                }
            }
            else if (user.equalsIgnoreCase("pelanggan")) {
                while (true) {
                    System.out.println("-------------------------------");
                    System.out.print("Masukkan Username Anda : ");
                    username = sc.nextLine();
                    System.out.print("Masukkan Password Anda : ");
                    password = sc.nextLine();
                    System.out.println("-------------------------------");
                    if (username.equals("cus123") && password.equals("cus123")) {
                        System.out.println("LOGIN SUCCESSFUL\n");
                        pelacakanUtkPelanggan();
                        logoutPelanggan();
                        break;
                    } else {
                        System.out.println("LOGIN FAILED! Masukkan kembali dengan data yang benar.");
                    }
                }
            }
            else {
                System.out.println("Pengguna yang dimasukkan tidak valid. Masukkan 'karyawan' atau 'pelanggan'.");
            }
        break;
        }
    }
        

    // fitur manajemen data pelanggan
    public static void pelanggan() {
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
        System.out.println("===========================================");
        System.out.println("|               Opsi Lokasi               |");
        System.out.println("===========================================");
        System.out.println("| 1. Kab. Banyuwangi | 6. Kab. Jember     |");
        System.out.println("| 2. Kab. Tuban      | 7. Kab. Lamongan   |");
        System.out.println("| 3. Kab. Pasuruan   | 8. Kab. Blitar     |");
        System.out.println("| 4. Kota Madiun     | 9. Kota Batu       |");
        System.out.println("| 5. Kab. Ngawi      | 10. Kota Surabaya  |");
        System.out.println("===========================================");
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
        int pilihan;
        
            while (true) {
                System.out.println("=============================");
                System.out.println("= MANAJEMEN DATA PELANGGAN  =");
                System.out.println("=============================");
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
                        System.out.println("==========================");
                        System.out.println("=     Data Pelanggan     =");
                        System.out.println("==========================");
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
                                System.out.println("===========================================");
                                System.out.println("|               Opsi Lokasi               |");
                                System.out.println("===========================================");
                                System.out.println("| 1. Kab. Banyuwangi | 6. Kab. Jember     |");
                                System.out.println("| 2. Kab. Tuban      | 7. Kab. Lamongan   |");
                                System.out.println("| 3. Kab. Pasuruan   | 8. Kab. Blitar     |");
                                System.out.println("| 4. Kota Madiun     | 9. Kota Batu       |");
                                System.out.println("| 5. Kab. Ngawi      | 10. Kota Surabaya  |");
                                System.out.println("===========================================");
                                System.out.print("Pilih Lokasi Tujuan Pengiriman (contoh: Kota Batu)  : ");
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

    public static void BiayaPengiriman() {
        int biayaKm = 500, biayaBrt = 100;
        double beratBarang, biayaPengiriman;

        System.out.println("================================");
        System.out.println("=       Biaya Pengiriman       =");
        System.out.println("================================");
        System.out.print("Masukkan Nama Pelanggan untuk menampilkan jarak pengiriman: ");
        String searchName = sc.nextLine();
        for (int j = 0; j < i; j++) {
            if (cusData[j][0].equals(searchName)) {
                lokasiTujuan(j);         
                System.out.println("Jarak pengiriman                : " +jarakPengiriman[j]);
                }
        }
        System.out.print("Masukkan berat barang (dalam kg): ");
        beratBarang = sc.nextFloat();
        System.out.println("+===========================+");
        System.out.println("=           note            =");
        System.out.println("+===========================+");
        System.out.println("| Reguler estimasi 3-4 hari |");
        System.out.println("| Ekspres estimasi 1-3 hari |");
        System.out.println("-----------------------------");
        System.out.print("Pilih jenis layanan (Reguler/Ekspres): ");
        String jenisLayanan = sc.next();
        System.out.println("\nMenghitung biaya pengiriman...");

        biayaPengiriman = jarakPengiriman[j] * biayaKm + beratBarang * biayaBrt;

        if (jarakPengiriman[j] <= 10) {
            if (beratBarang <= 5) {
                biayaPengiriman *= 0.8;
            }
        } else if (jarakPengiriman[j] > 10 && jarakPengiriman[j] <= 50) {
            if (beratBarang > 5) {
                biayaPengiriman *= 1.2;
            }
        } else {
            biayaPengiriman *= 1.5;
        }

        double biayaReguler = biayaPengiriman;
        double biayaEkspres = biayaPengiriman * 1.5;

        System.out.println("\n     Hasil Perhitungan     ");
        System.out.println("*****************************");
        System.out.println("Jarak Pengiriman   : " + jarakPengiriman[j] + " km");
        System.out.println("Berat Barang       : " + beratBarang + " kg");
        System.out.println("Jenis Layanan      : " + jenisLayanan);

        if (jenisLayanan.equalsIgnoreCase("reguler")) {
            System.out.println("\nBiaya Pengiriman (Reguler) : Rp" + biayaReguler);
        } else if (jenisLayanan.equalsIgnoreCase("ekspres")) 
            System.out.println("\nBiaya Pengiriman (Ekspres) : Rp" + biayaEkspres);

         else {
            System.out.println("Jenis layanan tidak valid.");
        }
        
        // Menampilkan nomor resi yang dihasilkan
        String nomorResi = generateNomorResi();
        System.out.println("Nomor Resi: " + nomorResi);
        System.out.println("kembali ke Menu Utama......");
         menuUtama();
    }

    
    // fitur manajemen pengiriman paket
    public static void manajemenPengirimanPaket() {
        String Abarang, next;
        int jmlhbarang;
        float brtBarang;
        
        while (true) {
            System.out.println("====================================");
            System.out.println("=    Manajemen Pengiriman Paket    =");
            System.out.println("====================================");
            System.out.println("------ Pilih menu -----");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Barang");
            System.out.println("3. Kembali ke Menu Utama");
            System.out.print("Pilih sub menu (1/2/3): ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                do {
                    System.out.print("Masukkan nama barang: ");
                    Abarang = sc.nextLine();
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
                    System.out.println("    Thank You   ");
                    System.out.println("=================");
                    menuUtama();
                default:
                    System.out.println("Inputan anda tidak valid");
                    System.out.print("Apakah Anda ingin memasukkan angka lagi (Y/N)? ");
                    String input = sc.next();
                    if (input.equalsIgnoreCase("N")) {
                        System.out.println("=================");
                        System.out.println("    Thank You   ");
                        System.out.println("=================");
                        menuUtama();
                    }
                    break;
                }
            
        }
    }

    // fitur manajemen armada
    public static void manajemenArmada(){

        while (true) {
            System.out.println("==========================");
            System.out.println("=    Manajemen Armada    =");
            System.out.println("==========================");
            System.out.println("Menu:");
            System.out.println("1. Kirim paket");
            System.out.println("2. Kembali ke menu utama");

            System.out.print("Pilih menu (1/2): ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    kirimPaket();
                    break;
                case 2:
                    System.out.println("Terima kasih!");
                    menuUtama();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali (1/2).");
                    break;
            }
        }
    }

    public static void tampilkanArmada() {
        truk = new String[] {"Truk A", "Truk B", "Truk C", "Truk D"};

        System.out.println("Kendaraan yang tersedia:");
        for (int i = 0; i < truk.length; i++) {
            System.out.println((i+1) + ". " + truk[i]);
        }
    }

    public static void kirimPaket() {
        System.out.println("==========================");
        System.out.println("=      Kirim Paket       =");
        System.out.println("==========================");

        System.out.println("Pilih armada untuk pengiriman:");
        tampilkanArmada();
        System.out.print("Masukkan pilihan armada (1-4): ");
        int pilihanArmada = sc.nextInt();

        switch (pilihanArmada) {
            case 1:
            case 2:
            case 3:
            case 4:
                inputTruk();
            break;
            default:
            System.out.println("Pilihan tidak valid.");
            break;
        }
    }
    
    public static void inputTruk(){
        System.out.print("Masukkan Nama Pelanggan yang ingin dimasukkan : ");
        Scanner sc = new Scanner(System.in);
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
        System.out.println("Ingin menambahkan lagi? (y/n)");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("y")) {
            inputTruk();
        } else {
            kirimPaket();
        }
        sc.close();
    }

    // fitur pelacakan
    
    public static void pelacakanUtkPelanggan() {
        System.out.println("===========================");
        System.out.println("=     PELACAKAN PAKET     =");
        System.out.println("===========================");
        inputResi();
        
        while (true) {
        System.out.print("Ingin melacak paket yang lain? (y/n) ");
        jawab = sc.nextLine().charAt(0);
        if (Character.toLowerCase(jawab) == 'y') {
                inputResi();
            } else if (Character.toLowerCase(jawab) == 'n'){
                logoutPelanggan();
            }
        }
    }
    public static void pelacakanUtkKaryawan(){
        System.out.println("===========================");
        System.out.println("=     PELACAKAN PAKET     =");
        System.out.println("===========================");
        inputResi();
        
        while (true) {
            System.out.print("Ingin melacak paket yang lain? (y/n) ");
            jawab = sc.nextLine().charAt(0);
        if (Character.toLowerCase(jawab) == 'y') {
                inputResi();
            } else if (Character.toLowerCase(jawab) == 'n') {
                menuUtama();
            }
        }
    }

    public static void inputResi() {
       Scanner sc = new Scanner(System.in);
       boolean isResiValid = false;
       int resi;

       do {
        System.out.println("Masukkan nomor resi: ");
        resi = sc.nextInt();
        isResiValid = validateNomorResi(resi);
        if (!isResiValid) {
            System.out.println("Nomor resi tidak valid.");
        }
    } while (!isResiValid);
       String statusPaket = lacakStatusPaket(resi);
       System.out.println("Status Paket: " + statusPaket);
       sc.close();
    }

    // Fungsi untuk menghasilkan nomor resi secara acak
    static String generateNomorResi() {
        Random random = new Random();
        // Menghasilkan nomor resi dengan panjang 6 karakter
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(random.nextInt(10)); // Menambahkan digit acak dari 0 hingga 9
        }
        String nomorResi = sb.toString();
        nomorResiArray[i] = nomorResi;
        return sb.toString();
    }

    // Fungsi untuk memvalidasi nomor resi
    static boolean validateNomorResi(int resi2) {
        for (String resi : nomorResiArray) {
            if (resi != null && resi.equals(String.valueOf(resi2))) {
                return true;
            }
        }
        return false;
    }
    
    private static String lacakStatusPaket(int resi) {
        String[] status = {"Proses pengiriman", "Paket sudah sampai"};
        Random random = new Random();
        int acak = random.nextInt(status.length);
        return status[acak];
    }
        // fitur laporan dan analitik
        public static void tampilkanAnalitik(int[] transactionHistory) {

        int totalTransaksi = i ;
        float rataRataTransaksi = (float) totalTransaksi / cusData.length ;
        
        System.out.println("==========================");
        System.out.println("=       ANALITIK         =");
        System.out.println("==========================");
        System.out.println("Total Pelanggan: " + totalTransaksi);
        System.out.println("Rata-rata Jumlah Transaksi: " + rataRataTransaksi);
    
    
    }
    // logout
    public static void logoutKaryawan() {
        System.out.print("Apakah Anda ingin logout? (y/n) ");
        jawab = sc.nextLine().charAt(0);
        if (Character.toLowerCase(jawab) == 'y') {
            System.out.println("LOGOUT SUCCESSFUL");
            System.out.print("Apakah Anda ingin login lagi? (y/n) ");
            jawab = sc.nextLine().charAt(0);
            if (Character.toLowerCase(jawab) == 'y') {
                loginKaryawan();
            } else if (Character.toLowerCase(jawab) == 'n') {
                exit();
            }
        } else if (Character.toLowerCase(jawab) == 'n') {
            menuUtama();
        }
    }

    public static void logoutPelanggan() {
        System.out.print("Apakah Anda ingin logout? (y/n) ");
        jawab = sc.nextLine().charAt(0);
        if (Character.toLowerCase(jawab) == 'y') {
            System.out.println("LOGOUT SUCCESSFUL");
            System.out.print("Apakah Anda ingin login lagi? (y/n) ");
            jawab = sc.nextLine().charAt(0);
            if (Character.toLowerCase(jawab) == 'y') {
                loginKaryawan();
            } else if (Character.toLowerCase(jawab) == 'n'){
                exit();
            }
        } else if (Character.toLowerCase(jawab) == 'n') {
            pelacakanUtkPelanggan();
        }
    }

    //exit
    public static void exit() {
        System.out.println("============================================");
        System.out.println("Terimakasih telah menggunakan Ekspedisi kami");
        System.out.println("============================================");
        sc.close();
    }
}