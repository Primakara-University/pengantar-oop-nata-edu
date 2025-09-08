import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Person p1 = new Person();
            p1.setName("Budi");
            p1.setAge(18);

            Person p2 = new Person();
            p2.setName("Sita");
            p2.setAge(19);

            System.out.println("Halo " + p1.getName() + " " + p1.getAge());
            System.out.println("Halo " + p2.getName() + " " + p2.getAge());

            System.out.print("Masukkan nama Anda: ");
            String nama = scanner.nextLine();

            System.out.println("Selamat datang di Java, " + nama + "!");

            scanner.close();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
