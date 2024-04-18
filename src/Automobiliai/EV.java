package Automobiliai;

import java.util.Scanner;

public class EV extends AutomobilioDuomenuModifikatorius{
    @Override
    void pridedamRida(ElektrinisAutomobilis a) {
        Scanner sk = new Scanner(System.in);
        System.out.println("Kokia rida?");
        long rida = sk.nextInt();

        a.setRida(rida);
    }
}
