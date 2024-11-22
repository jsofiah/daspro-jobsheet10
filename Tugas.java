import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        int[][] survey = new int[10][6];
        double totalPerResponden, totalPerPertanyaan, totalKeseluruhan = 0;
        double rataPerResponden, rataPerPertanyaan, rataKeseluruhan;

        System.out.println("=============================================");
        System.out.println("|              Survey Kepuasan              |");
        System.out.println("=============================================");
        for (int i = 0; i < survey.length; i++) {
            System.out.println("=============================================");
            System.out.println("| Responden ke-" + (i + 1) + " :");

            for (int j = 0; j < survey[i].length; j++) {
                System.out.print("| Nilai dari pertanyaan ke-" + (j + 1) + " : ");
                survey[i][j] = array.nextInt();
            }
        }

        System.out.println("=============================================");
        for (int i = 0; i < survey.length; i++) {
            System.out.print("| Responden ke-" + (i+1) + " : ");
            for (int j = 0; j < survey[i].length; j++) {
                System.out.print(survey[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("=============================================");
        for (int i = 0; i < survey.length; i++) {
            totalPerResponden = 0;
            for (int j = 0; j < survey[i].length; j++) {
                totalPerResponden+= survey[i][j];
                totalKeseluruhan += survey[i][j];
            }
            rataPerResponden = totalPerResponden / survey[0].length;
            System.out.println("| Rata-rata nilai dari responden ke-" + (i+1)+ " : " + rataPerResponden);
        }

        System.out.println("=============================================");
        for (int j = 0; j < survey[0].length; j++) {
            totalPerPertanyaan = 0;
            for (int i = 0; i < survey.length; i++) {
                totalPerPertanyaan += survey[i][j];
            }
            rataPerPertanyaan = totalPerPertanyaan / survey.length; 

            System.out.println("| Rata-rata nilai dari pertanyaan ke-" + (j+1) + " : " + rataPerPertanyaan);
        }
        rataKeseluruhan = totalKeseluruhan / (survey.length * survey[0].length);
        System.out.println("Rata-rata keseluruhan : " + rataKeseluruhan);
    }
}
