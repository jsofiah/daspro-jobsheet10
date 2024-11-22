import java.util.Scanner;
public class Siakad21 {
    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        int jmlSiswa, jmlMatkul;

        System.out.println("============================================");
        System.out.println("|             Siakad Polinema              |");
        System.out.println("============================================");
        System.out.print("| Masukkan jumlah siswa: ");
        jmlSiswa = array.nextInt();
        System.out.print("| Masukkan jumlah mata kuliah: ");
        jmlMatkul = array.nextInt();
        System.out.println("============================================");
        
        int[][] nilai = new int[jmlSiswa][jmlMatkul];
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("| Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("| Nilai mata kuliah " + (j + 1) + " : ");
                nilai[i][j] = array.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("| Nilai rata-rata : " + (totalPerSiswa/nilai[0].length));
            System.out.println("============================================");
        }

        System.out.println("============================================");
        System.out.println("| Rata-rata nilai setiap mata kuliah: ");
        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("| Mata kuliah " + (j+1) + " : " + (totalPerMatkul/nilai.length));
        }
    }
}
