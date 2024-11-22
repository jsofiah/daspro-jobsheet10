import java.util.Scanner;
public class BioskopWithScanner21 {
    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("======================================");
            System.out.println("|               Bioskop              |");
            System.out.println("======================================");
            System.out.println("| Menu: ");
            System.out.println("| 1. Input data penonton");
            System.out.println("| 2. Tampilkan daftar penonton");
            System.out.println("| 3. Exit");
            System.out.println("======================================");
            System.out.print("Pilih menu (angka): ");
            menu = array.nextInt();
            array.nextLine();
            System.out.println("======================================");

            if(menu==1){
                System.out.print("Masukkan nama: ");
                nama = array.nextLine();  
                System.out.print("Masukkan baris: ");
                baris = array.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = array.nextInt();
                array.nextLine();

                if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                    System.out.println("Nomor baris kolom tidak tersedia, coba lagi.");
                }
                else if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println("Kursi sudah terisi. Silakan pilih nomor baris dan kolom yang lain.");
                }
                else{
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil dimasukkan.");
                }
            }
            else if (menu == 2) {
                System.out.println("Daftar penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[0].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.println("Baris " + (i + 1) + " Kolom " + (j + 1) + ": " + "***");
                        } 
                        else{
                            System.out.println("Baris " + (i + 1) + " Kolom " + (j + 1) + ": " + penonton[i][j]);
                        }
                    }
                }
            }
            else if (menu == 3) {
                break;
            } else {
                System.out.println("Pilihan tidak valid, coba lagi.");
            }
            // System.out.print("Input penonton lainnya? (y/n) : ");
            // next = array.nextLine();
            // if (next.equalsIgnoreCase("n")) {
            //     break;
            // }
        }
    }
}
