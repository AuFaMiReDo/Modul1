import java.util.Scanner;

public class PRAK102_2310817210013_MuhammadAufaFitrianda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        int angkaAwal = scanner.nextInt();

        int count = 0;

        while (count <= 10) {
            if (angkaAwal % 5 == 0) {
                System.out.print((angkaAwal / 5) - 1);
            } else {
                System.out.print(angkaAwal);
            }

            if (count <= 9) {
                System.out.print(", ");
            }

            count++;
            angkaAwal++;
        }

        scanner.close();
    }
}
