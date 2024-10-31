import java.util.Scanner;

public class ArrayRataNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        if (jumlahMahasiswa <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
            return;
        }

        int[] nilaiMhs = new int[jumlahMahasiswa];
        int[] arrayLulus = new int[jumlahMahasiswa];
        int[] arrayGagal = new int[jumlahMahasiswa];

        int lulus = 0, gagal = 0;
        double totalLulus = 0, totalTidakLulus = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                lulus++;
                arrayLulus[i] = nilaiMhs[i];
                totalLulus += nilaiMhs[i];
            } else {
                gagal++;
                arrayGagal[i] = nilaiMhs[i];
                totalTidakLulus += nilaiMhs[i];
            }
        }

        if (lulus > 0) {
            double rataLulus = totalLulus / lulus;
            System.out.println("Rata-rata nilai mahasiswa lulus adalah: " + rataLulus);
        }

        if (gagal > 0) {
            double rataGagal = totalTidakLulus / gagal;
            System.out.println("Rata-rata nilai mahasiswa tidak lulus adalah: " +
                    rataGagal);
        }
    }
}
