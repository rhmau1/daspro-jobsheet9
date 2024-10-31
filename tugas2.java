import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrJmlPesanan;
        String[] arrNamaPesanan;
        double[] arrHargaPesanan;
        double totalBiaya = 0;

        System.out.print("masukkan jumlah pesanan: ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine();
        arrJmlPesanan = new int[jmlPesanan];
        arrNamaPesanan = new String[jmlPesanan];
        arrHargaPesanan = new double[jmlPesanan];
        for (int i = 0; i < arrJmlPesanan.length; i++) {
            System.out.print("masukkan NAMA pesanan ke-" + (i + 1) + ": ");
            arrNamaPesanan[i] = sc.nextLine();
            System.out.print("masukkan HARGA pesanan ke-" + (i + 1) + ": ");
            arrHargaPesanan[i] = sc.nextDouble();
            sc.nextLine();
            totalBiaya += arrHargaPesanan[i];
        }
        System.out.println();
        System.out.println("daftar pesanan: ");
        for (int i = 0; i < arrNamaPesanan.length; i++) {
            System.out.println("\t" + arrNamaPesanan[i]);
        }
        System.out.println("total biaya: ");
        System.out.println("\t" + totalBiaya);

    }
}
