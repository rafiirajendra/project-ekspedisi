import java.util.Scanner;

public class manajemenPengirimanPaket {
    public static void main(String[] args) {

        String barang;
        int jmlhbarang;
        float brtBarang;

       Scanner sc = new Scanner(System.in);
      
        while (true) {
            System.out.println("====================");
            System.out.println("    Pilih menu  ");
            System.out.println("====================");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Hapus Barang");
            System.out.println("3. Keluar Menu");
            System.out.print("Pilih angka 1/2/3: ");

           int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama barang: ");
                    barang = sc.next();
                    System.out.print("Masukkan jumlah barang(dalam kg): ");
                    jmlhbarang = sc.nextInt();
                    System.out.print("Masukkan berat barang: ");
                    brtBarang = sc.nextFloat();
                    break;
                case 2:
                    System.out.print("Masukkan nama barang yang ingin dihapus: ");
                    barang = sc.next();
                    break;
                case 3:
                    System.out.println("=================");
                    System.out.println("    Thank you   ");
                    System.out.println("=================");
                    System.exit(0);
                default:
                    break;
            }
            
        }

    }
}
