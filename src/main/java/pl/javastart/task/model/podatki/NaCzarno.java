package pl.javastart.task.model.podatki;

public class NaCzarno extends FormaOpodatkowania {

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        return 0;
    }

    @Override
    public String info() {
        return "Na czarno";
    }
}
