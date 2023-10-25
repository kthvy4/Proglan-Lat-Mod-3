import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan tahun lahir Anda: ");
        int birthYear = scanner.nextInt();

        // Mendapatkan tahun sekarang
        int currentYear = LocalDate.now().getYear();

        // Memanggil fungsi untuk menghitung umur
        int age = calculateAge(birthYear, currentYear);

        System.out.println("Umur Anda adalah: " + age + " tahun");
    }

    // Fungsi untuk menghitung umur
    private static int calculateAge(int birthYear, int currentYear) {
        // Menggunakan kelas Period dari java.time untuk perhitungan yang lebih akurat
        LocalDate birthDate = LocalDate.of(birthYear, 1, 1);
        LocalDate currentDate = LocalDate.of(currentYear, 1, 1);

        Period period = Period.between(birthDate, currentDate);

        return period.getYears();
}
}