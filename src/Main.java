import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Jak masz na imię?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Jak masz na nazwisko?");
        String surename = scanner.nextLine();
        System.out.println("Ile masz lat?");
        String year = scanner.nextLine();
        System.out.println("Cześć " + name + " " + surename + " lat:" + year);
    }
}
