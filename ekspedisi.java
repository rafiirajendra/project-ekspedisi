import java.util.Random;
import java.util.Scanner;

public class nyobak2 {
    static String[][] cusData = new String[100][6];
    static int i = 0;
    static int[] transactionHistory = new int[100];

    public static void main(String[] args) {
        menuUtama();
    }

    public static void menuUtama() {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        String role;

        System.out.println("===WELCOME TO EKSPEDISI===");
        System.out.println("LOGIN SEBAGAI");
        role = sc.nextLine();

        if (role.equalsIgnoreCase("karyawan")) {
            while (true) {
                System.out.println("===MENU UTAMA===");
                System.out.println("1. Login Karyawan");
                System.out.println("2. Manajemen Data Pelanggan");
                System.out.println("3. Biaya Pengiriman");
                System.out.println("4. Manajemen Pengiriman Paket");
                System.out.println("5. Manajemen Armada");
                System.out.println("6. Pelacakan");
                System.out.println("7. Tampilkan Analitik");
                System.out.println("8. Logout");
                System.out.print("Pilih operasi (1/2/3/4/5/6/7/8): ");
                pilihan = sc.nextInt();
                sc.nextLine();

                switch (pilihan) {
                    case 1:
                        loginKaryawan();
                        break;
                    case 2:
                        ManajemenDataPelanggan();
                        break;
                    case 3:
                        BiayaPengiriman();
                        break;
                    case 4:
                        manajemenPengirimanPaket();
                        break;
                    case 5:
                        manajemenArmada();
                        break;
                    case 6:
                        pelacakan();
                        break;
                    case 7:
                        tampilkanAnalitik(transactionHistory);
                        break;
                    case 8:
                        logout();
                        return;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                        break;
                }
            }
        } else if (role.equalsIgnoreCase("pelanggan")) {
            while (true) {
                System.out.println("===MENU UTAMA===");
                System.out.println("6. Pelacakan");
                System.out.print("Pilih operasi (6): ");
                pilihan = sc.nextInt();
                sc.nextLine();

                switch (pilihan) {
                    case 6:
                        pelacakan();
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                        break;
                }
            }
        } else {
            System.out.println("USER TIDAK VALID! (Silakan masukkan 'karyawan' atau 'pelanggan')");
        }
    }

    
    // fitur login
    public static void loginKaryawan() {
        Scanner sc = new Scanner(System.in);

        String user;

        System.out.println("===WELCOME TO EKSPEDISI===");

        while (true) {
            System.out.println("LOGIN SEBAGAI");
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
                String username = sc.nextLine();
                System.out.print("Masukkan Password Anda                    : ");
                String password = sc.nextLine();
                System.out.print("Masukkan Nomor Identitas Karyawan Anda    : ");
                String nik = sc.nextLine();

                if (username.equals("kary123") && password.equals("kary123") && nik.equals("20230123")) {
                    System.out.println("LOGIN SUCCESSFUL");
                    break;
                } else {
                    System.out.println("LOGIN FAILED. Isi kembali dengan data yang benar!");
                }
            }
        }
        else if (user.equalsIgnoreCase("pelanggan")) {
            while (true) {
                System.out.print("Masukkan Username Anda                    : ");
                String username = sc.nextLine();
                System.out.print("Masukkan Password Anda                    : ");
                String password = sc.nextLine();

                if (username.equals("cus123") && password.equals("cus123")) {
                    System.out.println("LOGIN SUCCESSFUL");
                    break;
                } else {
                    System.out.println("LOGIN FAILED. Isi kembali dengan data yang benar!");
                }
           
            }
        }
    }

    // fitur manajemen data pelanggan
    public static void ManajemenDataPelanggan(){
        public static void pelanggan() {
            static double [] jarakPengiriman = new double[100];
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
    // fitur biaya pengiriman
    public static void BiayaPengiriman(){
        Scanner sc = new Scanner(System.in);
        int biayaKm = 4000, biayaBrt = 5000;
        float jarakPengiriman, beratBarang, biayaPengiriman;
        
        System.out.println("Masukkan jarak (dalam km): ");
        jarakPengiriman = sc.nextFloat();

        System.out.println("Masukkan berat barang (dalam kg): ");
        beratBarang = sc.nextFloat();

        System.out.println("Pilih jenis layanan (reguler/ekspres): ");
        String jenisLayanan = sc.next();

        biayaPengiriman = jarakPengiriman * biayaKm + beratBarang * biayaBrt;

        if (jarakPengiriman <= 10) {
            if (beratBarang <= 5) {
                biayaPengiriman *= 0.8;  // ini merupakan pajak tarif pengiriman jarak kurang dari 10 km 
            }
        } else if (jarakPengiriman > 10 && jarakPengiriman <= 50) {
            if (beratBarang > 5) {
                biayaPengiriman *= 1.2;  // ini pajak tarif pengiriman untuk jarak untuk jarak lebih dari 10 km hingga kurang lebih dari 50
            }
        } else {
            biayaPengiriman *= 1.5;  // ini pajak tarif tambahan untuk jarang yang lebih jauh 
        }
        float biayaReguler = biayaPengiriman;

        float biayaEkspres = biayaPengiriman *= 1.5; //pajak 

        if (jenisLayanan.equals("reguler")) {
            System.out.println("Biaya pengiriman reguler adalah: " + biayaReguler);
    
        } else {
            System.out.println("Biaya pengiriman ekspres adalah: " + biayaEkspres);
       
        }
    }

    // fitur manajemen pengiriman paket
    public static void manajemenPengirimanPaket(){
        Scanner sc = new Scanner(System.in);
        int biayaKm = 4000, biayaBrt = 5000;
        float jarakPengiriman, beratBarang, biayaPengiriman;
        
        System.out.println("Masukkan jarak (dalam km): ");
        jarakPengiriman = sc.nextFloat();

        System.out.println("Masukkan berat barang (dalam kg): ");
        beratBarang = sc.nextFloat();

        System.out.println("Pilih jenis layanan (reguler/ekspres): ");
        String jenisLayanan = sc.next();

        biayaPengiriman = jarakPengiriman * biayaKm + beratBarang * biayaBrt;

        if (jarakPengiriman <= 10) {
            if (beratBarang <= 5) {
                biayaPengiriman *= 0.8;  // ini merupakan pajak tarif pengiriman jarak kurang dari 10 km 
            }
        } else if (jarakPengiriman > 10 && jarakPengiriman <= 50) {
            if (beratBarang > 5) {
                biayaPengiriman *= 1.2;  // ini pajak tarif pengiriman untuk jarak untuk jarak lebih dari 10 km hingga kurang lebih dari 50
            }
        } else {
            biayaPengiriman *= 1.5;  // ini pajak tarif tambahan untuk jarang yang lebih jauh 
        }
        float biayaReguler = biayaPengiriman;

        float biayaEkspres = biayaPengiriman *= 1.5; //pajak 

        if (jenisLayanan.equals("reguler")) {
            System.out.println("Biaya pengiriman reguler adalah: " + biayaReguler);
    
        } else {
            System.out.println("Biaya pengiriman ekspres adalah: " + biayaEkspres);
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
    public static void pelacakan(){
        inputResi();
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
    public static void logout(){
    Scanner input = new Scanner(System.in);
        int pilihan;
        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Logout");
            System.out.println("3. Exit");
            System.out.print("Pilih operasi (1/2/3) : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 :
                //fitur login
                break;

                case 2 :
                System.out.println("LOGOUT SUCCESS");
                break;

                case 3 :
                System.out.print("Apakah Anda yakin ingin keluar dari Ekspedisi? ");
                String jawab = input.nextLine();
                    if (jawab.equalsIgnoreCase("YA")) {
                        System.out.println("Terimakasih telah menggunakan Ekspedisi kami.");
                        System.exit(0);
                    }
                break;

            }
        }

    }
}
