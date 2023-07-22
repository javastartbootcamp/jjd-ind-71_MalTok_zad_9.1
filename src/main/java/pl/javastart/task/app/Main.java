package pl.javastart.task.app;

import pl.javastart.task.model.podatki.NaCzarno;
import pl.javastart.task.model.Firma;
import pl.javastart.task.model.podatki.RyczaltEwidencjonowany;
import pl.javastart.task.model.podatki.SkalaPodatkowa;

public class Main {

    public static void main(String[] args) {
        Firma firma = new Firma("JanuszPOL", new NaCzarno());

        firma.dodajPrzychod("Remont Mieszkania", 20_000);
        firma.dodajWydatek("Gładzie i farby", 1_000);

        firma.wyswietlPodsumowanie();

        Firma janNowakServices = new Firma("Jan Nowak IT Services", new RyczaltEwidencjonowany());

        janNowakServices.dodajPrzychod("Programowanie", 15_000);
        janNowakServices.dodajWydatek("Energetyki", 200);

        janNowakServices.wyswietlPodsumowanie();

        Firma paprakBud = new Firma("Hieronim Paprak Budownictwo", new SkalaPodatkowa());

        paprakBud.dodajPrzychod("Remont balkonów", 150_000);
        paprakBud.dodajWydatek("Rusztowanie", 20_000);

        paprakBud.wyswietlPodsumowanie();

    }

}
