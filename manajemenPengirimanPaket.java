import java.util.Scanner;

public class manajemenPengirimanPaket {

  public static void main(String[] args) {

    String[] namaBarang = new String[100];
    int[] jmlBarang = new int[100]; 
    float[] brtBarang = new float[100];
    String next;

    int index = 0;

    Scanner sc = new Scanner(System.in);
    
    while (true) {
      System.out.println("====================");
      System.out.println("    Pilih Menu");
      System.out.println("====================");
      System.out.println("1. Tambah Barang");
      System.out.println("2. Hapus Barang");  
      System.out.println("3. Tampilkan list barang");
      System.out.println("4. Keluar Menu");
      System.out.print("Pilih (1/2/3/4): ");

      int pilihan = sc.nextInt();
      sc.nextLine();

      switch (pilihan) {
        case 1:
        do {
          System.out.print("Nama barang: ");
          String nama = sc.next();
          System.out.print("Jumlah barang: ");  
          int jumlah = sc.nextInt();
          System.out.print("Berat barang: ");
          float berat = sc.nextFloat();
            
          // tambah ke array
          namaBarang[index] = nama;
          jmlBarang[index] = jumlah;
          brtBarang[index] = berat;
          index++;

          System.out.print("Input barang lainnya? (y/n): ");
          next = sc.next();
        } while (next.equalsIgnoreCase("y"));
        break;
        case 2:
          System.out.print("Nama barang yang dihapus: ");
          String hapus = sc.next();

          // cari index barang di array
          int indexHapus = -1;
          for(int i=0; i<index; i++) {
            if(namaBarang[i].equals(hapus)) {
              indexHapus = i;
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