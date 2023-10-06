package pl.gornik;

import pl.gornik.miejscowosc.Miejscowosc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Miejscowosc> MiejscowoscList = new ArrayList<>();
       Miejscowosc miejscowosc = new Miejscowosc("Tarnobrzeg", "Jakas", 500, 650, 74);

       System.out.printf("Srednia ludnosci wynosi: %.2f ", miejscowosc.SredniaLudnosci());
        System.out.println();
        System.out.printf("Powierzchnia uzytkowa wynosi: %.2f ", miejscowosc.PowierzchniaUzywana());

        Miejscowosc miejscowosc1;
        String name;
        String gmina;
        int liczba_ludnosci;
        double powierzchniaHa;
        double procentNieUzytkow;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <2; i++){
            System.out.println("Podaj nazwe");
            name = scanner.nextLine();
            System.out.println("Podaj gmine");
            gmina = scanner.nextLine();
            System.out.println("Podaj liczbe ludnosci");
            liczba_ludnosci = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Podaj Powierzchnie w Ha");
            powierzchniaHa = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Podaj Procent nie uzytokowania");
            procentNieUzytkow = scanner.nextDouble();
            scanner.nextLine();

            miejscowosc1 = new Miejscowosc(name, gmina, liczba_ludnosci, powierzchniaHa, procentNieUzytkow);
            MiejscowoscList.add(miejscowosc1);

        }
        System.out.println(MiejscowoscList);
    }
}