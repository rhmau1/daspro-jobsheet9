import java.util.Scanner;

public class ArrayRataNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;
        int jmlLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                jmlLulus++;
            }
        }
        System.out.println("jumlah mahasiswa yang lulus: " + jmlLulus);
    }
}
