package pl.javastart.task.model.podatki;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        return przychody * 0.15;
    }

    @Override
    public String info() {
        return "Ryczałt ewidencjonowany";
    }
}
