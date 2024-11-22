import java.util.Scanner;
public class BioskopWithScanner21 {
    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = array.nextLine();
            System.out.print("Masukkan baris: ");
            baris = array.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = array.nextInt();
            array.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n)");
            next = array.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
