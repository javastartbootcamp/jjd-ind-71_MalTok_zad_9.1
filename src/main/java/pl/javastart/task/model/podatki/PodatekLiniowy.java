package pl.javastart.task.model.podatki;

public class PodatekLiniowy extends FormaOpodatkowania {
    private static final double PODATEK_LINIOWY = 19;

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        double dochod = dochod(przychody, wydatki);
        return dochod * PODATEK_LINIOWY / 100;
    }

    @Override
    public String info() {
        return "Podatek liniowy";
    }
}
