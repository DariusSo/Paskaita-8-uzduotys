package Automobiliai;

import java.util.Scanner;


public class AutomobilioDuomenuModifikatorius {
    Scanner scanner = new Scanner(System.in);
    public NaftosKuroAutomobilis duomenuModifikatorius(NaftosKuroAutomobilis auto, double kuroSanaudos) {
        auto.setKuroSanaudos100km(kuroSanaudos);
        return auto;
    }
    public ElektrinisAutomobilis duomenuModifikatorius(ElektrinisAutomobilis auto, double baterijosKrovimas) {
        auto.setBaterijosKrovimoLaikas(baterijosKrovimas);
        return auto;
    }

    public Automobilis duomenuModifikatorius(Automobilis auto, long rida){
        auto.setRida(rida);
        return auto;
    }
}
