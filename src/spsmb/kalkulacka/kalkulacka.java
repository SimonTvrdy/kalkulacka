package spsmb.kalkulacka;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class kalkulacka {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    static void run() {
        intro();
    }

    static void intro() {
        System.out.println("Zkouska github");
        System.out.println("Tento program dokaze pracovat s jednoduchymi matematickymi operacemi jako je scitani, odcitani, nasobeni, deleni a zbytek po deleni.");
        System.out.println("Pro zvoleni operace zmacknete nasledujici cislo: \nScitani - 1\nOdcitani - 2\nNasobeni - 3\nDeleni - 4\nZbytek po deleni - 5");
        volbaOperace();
    }

    static void volbaOperace() {
        System.out.println("Zadejte cislo operace: ");
        int volba = sc.nextInt();
        System.out.println("Zadejte prvni cislo: ");
        double a = sc.nextDouble();
        System.out.println("Zadejte druhe cislo: ");
        double b = sc.nextDouble();
        switch (volba) {
            case 1 -> scitani(a,b);
            case 2 -> odcitani(a,b);
            case 3 -> nasobeni(a,b);
            case 4 -> deleni(a,b);
            case 5 -> modulo(a,b);
            default -> intro();
        }

    }


    static double scitani(double a, double b) {
        double vysledek = a + b;
        System.out.println("Vysledek je: " + vysledek);
        return vysledek;
    }

    static double odcitani(double a, double b) {
        double vysledek = a - b;
        System.out.println("Vysledek je: " + vysledek);
        return vysledek;
    }

    static double nasobeni(double a, double b) {
        double vysledek = a * b;
        System.out.println("Vysledek je: " + vysledek);
        return vysledek;
    }

    static double deleni(double a, double b) {
        double vysledek = a / b;
        System.out.println("Vysledek je: " + vysledek);
        return vysledek;
    }

    static double modulo(double a, double b) {
        double vysledek = a % b;
        System.out.println("Vysledek je: " + vysledek);
        return vysledek;
    }

    static String spatneZadani() {
        String spatne = "Zadali jste spatne zadani!";
        return spatne;
    }
}
