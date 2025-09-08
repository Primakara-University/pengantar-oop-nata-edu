import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Person p1 = new Person();
            p1.setName("Budi");
            p1.setAge(18);
            p1.sayHello();

            Person p2 = new Person();
            p2.setName("Sita");
            p2.setAge(19);

            p2.sayHello();
            p2.setFriend(p1);
            p2.setAge(p2.getAge() + 1);

            System.out.println("Halo " + p1.getName() + " umurmu " + p1.getAge());
            System.out.println("Halo teman " + p2.getFriend().getName() + " umurmu " + p2.getFriend().getAge());
            System.out.println("Halo " + p2.getName() + " umurmu " + p2.getAge());

            System.out.print("Masukkan nama Anda: ");
            String nama = scanner.nextLine();

            System.out.println("Selamat datang di Java, " + nama + "!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
