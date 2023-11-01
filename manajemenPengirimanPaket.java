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
