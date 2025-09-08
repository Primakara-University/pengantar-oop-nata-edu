
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Person p1 = new Person();
            p1.setNama("Budi");

            Person p2 = new Person();
            p2.setNama("Sita");

            System.out.println("Halo " + p1.getNama());
            System.out.println("Halo " + p2.getNama());

            System.out.print("Masukkan nama Anda: ");
            String nama = scanner.nextLine();

            System.out.println("Selamat datang di Java, " + nama + "!");

            scanner.close();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
