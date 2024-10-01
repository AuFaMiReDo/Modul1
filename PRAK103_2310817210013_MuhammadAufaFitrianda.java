import java.util.Scanner;

public class PRAK103_2310817210013_MuhammadAufaFitrianda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int N = scanner.nextInt();
        System.out.print("Masukkan angka awal: ");
        int angkaAwal = scanner.nextInt();

        int count = 0;
        do {
            if (angkaAwal % 2 != 0) {
                System.out.print(angkaAwal);
                count++;
                if (count < N) {
                    System.out.print(", ");
                }
            }
            angkaAwal++;
        } while (count < N);
        scanner.close();
    }
}
