package School;

import java.util.Scanner;

public class schoolArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Berapa data");
        int data = in.nextInt();
        System.out.println();

        System.out.println("Pilihan = Person Student teacher 1 2 3");
        int pilihan = in.nextInt();

        Person[] p = new Person[20];

        for (int i = 1; i < data; i++) {
            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan nama");
                    String nama = in.next();
                    System.out.println("Masukkan Umur");
                    int umur = in.nextInt();
                    p[0] = new Person(nama, umur);
                    p[0].print();
                    break;

                case 2:
                    System.out.println("Masukkan nama");
                    String nama1 = in.next();
                    System.out.println("Masukkan umur");
                    int umur1 = in.nextInt();
                    System.out.println("Masukkan number");
                    int number = in.nextInt();
                    System.out.println("Masukkan score");
                    int score = in.nextInt();
                    System.out.println("Masukkan major");
                    String major = in.next();

                    p[1] = new Student(nama1, umur1, number, score, major);
                    p[1].print();
                    break;

                case 3:
                    System.out.println("Masukkan nama");
                    String nama2 = in.next();
                    System.out.println("Masukkan umur");
                    int umur2 = in.nextInt();
                    System.out.println("Masukkan subject");
                    String subject = in.next();

                    p[2] = new Teacher(nama2, umur2, subject);
                    p[2].print();
            
                default:
                    break;
            }
        }
    }
}
