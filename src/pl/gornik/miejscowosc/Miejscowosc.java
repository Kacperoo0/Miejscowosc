package pl.gornik.miejscowosc;

public class Miejscowosc {
    String nazwa;

    String gmina;

    int liczba_ludnosci;

    double PowierzchniaHa;

    double ProcentNieUzytkow;

    public Miejscowosc(String nazwa, String gmina, int liczba_ludnosci, double powierzchniaHa, double procentNieUzytkow) {
        this.nazwa = nazwa;
        this.gmina = gmina;
        this.liczba_ludnosci = liczba_ludnosci;
        PowierzchniaHa = powierzchniaHa;
        ProcentNieUzytkow = procentNieUzytkow;
    }

    public double SredniaLudnosci() {
        return this.liczba_ludnosci / this.PowierzchniaHa;
    }

    public double PowierzchniaUzywana() {

        return (this.PowierzchniaHa - this.ProcentNieUzytkow);
    }

    @Override
    public String toString() {
        return "Miejscowosc{" +
                "nazwa='" + nazwa + '\'' +
                ", gmina='" + gmina + '\'' +
                ", liczba_ludnosci=" + liczba_ludnosci +
                ", PowierzchniaHa=" + PowierzchniaHa +
                ", ProcentNieUzytkow=" + ProcentNieUzytkow +
                '}';
    }
}


