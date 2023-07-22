package pl.javastart.task.model;

import pl.javastart.task.model.podatki.FormaOpodatkowania;

import java.util.Arrays;

public class Firma {

    private String nazwa;
    private FormaOpodatkowania formaOpodatkowania;
    private int maxPositions = 50;
    private Przychod[] przychody = new Przychod[maxPositions];
    private Wydatek[] wydatki = new Wydatek[maxPositions];
    private int countPrzychody = 0;
    private int countWydatki = 0;

    public Firma(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        this.nazwa = nazwa;
        this.formaOpodatkowania = formaOpodatkowania;
    }

    public void wyswietlPodsumowanie() {
        double sumaPrzychodow = zsumujPrzychody();
        double sumaWydatkow = zsumujWydatki();

        System.out.printf("======= Firma: %s ===========\n", nazwa);
        System.out.printf("Forma opodatkowania: %s\n", formaOpodatkowania.info());
        System.out.printf("Suma przychodów: %.2f zł\n", sumaPrzychodow);
        System.out.printf("Suma wydatków: %.2f zł\n", sumaWydatkow);
        System.out.printf("Podatek do zapłacenia: %.2f zł",
                formaOpodatkowania.wyliczPodatek(sumaPrzychodow, sumaWydatkow));
        System.out.print("\n\n");
    }

    private double zsumujWydatki() {
        double sumaWydatkow = 0;
        for (int i = 0; i < countWydatki; i++) {
            sumaWydatkow += wydatki[i].getWartosc();
        }
        return sumaWydatkow;
    }

    private double zsumujPrzychody() {
        double sumaPrzychodow = 0;
        for (int i = 0; i < countPrzychody; i++) {
            sumaPrzychodow += przychody[i].getWartosc();
        }
        return sumaPrzychodow;
    }

    public void dodajPrzychod(String nazwa, double wartosc) {
        if (countPrzychody == przychody.length) {
            przychody = Arrays.copyOf(przychody, przychody.length * 2);
        }
        przychody[countPrzychody] = new Przychod(nazwa, wartosc);
        countPrzychody++;
    }

    public void dodajWydatek(String nazwa, double wartosc) {
        if (countWydatki == wydatki.length) {
            wydatki = Arrays.copyOf(wydatki, wydatki.length * 2);
        }
        wydatki[countWydatki] = new Wydatek(nazwa, wartosc);
        countWydatki++;
    }
}
