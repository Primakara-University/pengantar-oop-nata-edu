import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Person[] people = new Person[10];

            for (int i = 1; i <= people.length; i++) {
                Random random = new Random();

                people[i] = new Person("Ariana Gr" + i, random.nextInt(100));
                people[i].setName("Budiono " + i);
                people[i].setAge(18 + i);

                people[i].setFriend(people[random.nextInt(people.length)]);
                people[i].sayHello();

                if (people[i].getFriend() != null) {
                    System.out.println("My friend is " + people[i].getFriend().getName());
                }

                System.out.println();
            }

            Person p1 = new Person("Budiono", 18);
            p1.setName("Budi");
            p1.setAge(18);
            p1.sayHello();

            Person p2 = new Person("Sitajo", 19);
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
