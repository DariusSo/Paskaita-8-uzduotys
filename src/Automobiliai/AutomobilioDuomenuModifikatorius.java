package Automobiliai;

import java.util.Scanner;


public abstract class AutomobilioDuomenuModifikatorius {
    Scanner scanner = new Scanner(System.in);
    public NaftosKuroAutomobilis duomenuModifikatorius(NaftosKuroAutomobilis auto, double kuroSanaudos) {
        auto.setKuroSanaudos100km(kuroSanaudos);
        return auto;
    }
    public ElektrinisAutomobilis duomenuModifikatorius(ElektrinisAutomobilis auto, double baterijosKrovimas) {
        auto.setBaterijosKrovimoLaikas(baterijosKrovimas);
        return auto;
    }


    void pridedamRida(Automobilis a){
        Scanner sk = new Scanner(System.in);
        System.out.println("Kokia rida?");
        long rida = sk.nextInt();
        a.setRida(rida);
        System.out.println("Automobilio " + a.autoInfo() + " rida pakeista i " + rida);
    }


    abstract void pridedamRida(ElektrinisAutomobilis a);
}
