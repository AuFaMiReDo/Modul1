import java.util.Scanner;

public class PRAK101_2310817210013_MuhammadAufaFitrianda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = scanner.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = scanner.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = scanner.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = scanner.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int tinggiBadan = scanner.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double beratBadan = scanner.nextDouble();

        String[] namaBulan = {
                "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        System.out.println();
        System.out.println("Nama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir +
                " pada Tanggal " + tanggalLahir + " " + namaBulan[bulanLahir - 1] + " " + tahunLahir);
        System.out.println("Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram.");

        scanner.close();
    }
}
