package Automobiliai;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Nuoma {
    Scanner scanner = new Scanner(System.in);
    public List<Automobilis> automobiliuSarasas = new ArrayList<>();

    public void pridekAutomobili(Automobilis automobilis){
        automobiliuSarasas.add(automobilis);
        System.out.println("Pridetas automobilis: " + autoInfo(automobilis));
    }
    public void pridekAutomobiliUser(){

        System.out.println("Koks automobilio tipas? 1 - Naftos kuro, 2 - Elektromobilis.");
        int pasirinkimas = scanner.nextInt();
        scanner.nextLine();
        try{

            System.out.println("Marke: ");
            String marke = scanner.nextLine();
            System.out.println("Modelis: ");
            String modelis = scanner.nextLine();
            System.out.println("Metai: ");
            String metai = scanner.nextLine();
            System.out.println("Kaina: ");
            double kaina = scanner.nextDouble();

            if (pasirinkimas == 1){
                System.out.println("Kuro sanaudos 100km?");
                double kuras = scanner.nextDouble();
                Automobilis naujas = new NaftosKuroAutomobilis(marke, modelis, metai, kaina, kuras);
                automobiliuSarasas.add(naujas);
            }else if(pasirinkimas == 2){
                System.out.println("Krovimo laikas?");
                double krovimoLaikas = scanner.nextDouble();
                scanner.nextLine();
                Automobilis naujas = new ElektrinisAutomobilis(marke, modelis, metai, kaina, krovimoLaikas);
                automobiliuSarasas.add(naujas);
            }else{
                System.out.println("Tokio automobilio prideti negalime.");
            }
        }catch (Exception e){
            System.out.println("Kazka ne taip suvedete, bandykite dar karta.");

        }


    }
    public void pasiimkAutomobili(){
        System.out.println("Koki automobili noresite pasiimti? Iveskite marke: ");
        scanner.nextLine();
        String marke = scanner.nextLine();
        for (Automobilis k : automobiliuSarasas){
            if (marke.equals(k.getMarke())){
                automobiliuSarasas.remove(k);
                System.out.println("Paimtas automobilis: " + autoInfo(k) );
                skaiciuotiKaina(k);
                break;
            }
        }

    }
    public void skaiciuotiKaina(Automobilis automobilis){
        try{
            System.out.println("Kiek dienu noresite issinuomoti automobili?");
            double dienuSkaicius = scanner.nextDouble();
            double kaina = automobilis.getKaina() * dienuSkaicius;
            System.out.println("Automobilio kaina uz pasirinkta dienu skaiciu: " + kaina);
        }catch (InputMismatchException e){
            System.out.println("Reikia skaiciaus.");

        }
    }
    public String autoInfo(Automobilis auto){
        return auto.getMarke() + "|" + auto.getModelis() + "|" + auto.getMetai() + "|" + auto.getKaina();
    }
}
