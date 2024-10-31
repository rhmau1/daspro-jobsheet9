import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate Ice" };
        boolean found = false;
        int hasil = 0;
        System.out.print("masukkan nama menu yang ingin dicari: ");
        String input = sc.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (input.equalsIgnoreCase(menu[i])) {
                found = true;
                hasil = i;
                break;
            }
        }
        if (found) {
            System.out.println("makanan yang dicari tersedia");
            System.out.println(input + " ditemukan di dalam menu indeks ke-" + hasil);
        } else {
            System.out.println("makanan yang dicari tidak ada di menu");
        }
    }
}
