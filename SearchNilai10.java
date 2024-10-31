import java.util.Scanner;

public class SearchNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrNilai;
        System.out.print("masukkan banyaknya nilai yang akan diinput: ");
        int jmlElemen = sc.nextInt();
        arrNilai = new int[jmlElemen];
        int hasil = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] == key) {
                hasil = i;
                break;
            }
        }

        if (found) {
            System.out.println();
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Nilai yang dicari tidak ditemukan");
            System.out.println();
        }
    }
}
