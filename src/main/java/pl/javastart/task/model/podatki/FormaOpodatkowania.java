package pl.javastart.task.model.podatki;

public class FormaOpodatkowania {

    public double wyliczPodatek(double przychody, double wydatki) {
        System.out.println("Metoda z wyliczaniem podatku nie została nadpisana");
        return -1;
    }

    public double dochod(double przychody, double wydatki) {
        return przychody - wydatki;
    }

    public String info() {
        return null;
    }
}
