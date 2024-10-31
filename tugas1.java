import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrNilai;
        System.out.print("masukkan banyaknya nilai yang akan diinput: ");
        int jmlElemen = sc.nextInt();
        arrNilai = new int[jmlElemen];
        double rata2, total = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
            total += arrNilai[i];
        }
        rata2 = total / arrNilai.length;
        System.out.println("rata rata nilai seluruh mahasiswa adalah: " + rata2);
        int tertinggi = 0;
        int terendah = 100;
        for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] > tertinggi) {
                tertinggi = arrNilai[i];
            }
            if (arrNilai[i] < terendah) {
                terendah = arrNilai[i];
            }
        }
        System.out.println("Nilai tertinggi adalah: " + tertinggi);
        System.out.println("Nilai terendah adalah: " + terendah);
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.println("nilai mahasiswa ke-" + (i + 1) + " adalah: " + arrNilai[i]);
        }
    }
}
