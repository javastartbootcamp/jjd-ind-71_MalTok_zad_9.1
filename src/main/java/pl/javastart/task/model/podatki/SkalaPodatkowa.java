package pl.javastart.task.model.podatki;

public class SkalaPodatkowa extends FormaOpodatkowania {
    private static final int KWOTA_ZWOLNIONA = 10_000;
    private static final int KWOTA_GRANICZNA = 100_000;
    private static final double PODATEK_PIERWSZY_PROG = 18;
    private static final double PODATEK_DRUGI_PROG = 32;

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        double dochod = dochod(przychody, wydatki);
        if (dochod <= KWOTA_ZWOLNIONA) {
            return 0;
        } else if (dochod > KWOTA_ZWOLNIONA && dochod <= KWOTA_GRANICZNA) {
            return (dochod - KWOTA_ZWOLNIONA) * PODATEK_PIERWSZY_PROG / 100;
        } else {
            double podatekPierwszyProg = (KWOTA_GRANICZNA - KWOTA_ZWOLNIONA) * PODATEK_PIERWSZY_PROG / 100;
            double podatekDrugiProg = (dochod - KWOTA_GRANICZNA) * PODATEK_DRUGI_PROG / 100;
            return podatekPierwszyProg + podatekDrugiProg;
        }
    }

    @Override
    public String info() {
        return "Skala podatkowa";
    }
}
