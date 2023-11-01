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
      sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama barang: ");
                    barang = sc.next();
                    System.out.print("Masukkan jumlah barang: ");
                    jmlhbarang = sc.nextInt();
                    System.out.print("Masukkan berat barang(dalam kg): ");
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

          // hapus data barang
          if(indexHapus >= 0) {
            for(int i=indexHapus; i<index-1; i++) {
              namaBarang[i] = namaBarang[i+1];
              jmlBarang[i] = jmlBarang[i+1];
              brtBarang[i] = brtBarang[i+1];
            }
            index--;
          }
          break;

        case 3:
          System.out.println("List barang: ");
          
          for(int i=0; i<index; i++){
            System.out.println("Nama: "+namaBarang[i]);
            System.out.println("Jumlah: "+jmlBarang[i]);
            System.out.println("Berat: "+brtBarang[i]);
          }
          break;

        case 4:
          System.out.println("=================");
          System.out.println("--Terima kasih--");
          System.out.println("=================");
          System.exit(0);

        default:
          System.out.println("Input tidak valid!");
      }
    }
  }
}