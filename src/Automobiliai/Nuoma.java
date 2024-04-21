package Automobiliai;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Nuoma extends AutomobilioDuomenuModifikatorius{
    KlientuSarasas klientuSarasas = new KlientuSarasas();
    Scanner scanner = new Scanner(System.in);
    public static List<Automobilis> automobiliuSarasas = new ArrayList<>();
    public void menu(){
        System.out.println("Prideti automobili(1), pasalinti(2), priskirti automobilis klientui(3), klientas grazino automobili(4), " +
                "modifikuoti parametrus(5), " + "ziureti kliento nuomotu masinu sarasa(6), " + "ziureti kliento dabar nuomojama masina(7), " +
                "iseiti(8)");
        int pasirinko = scanner.nextInt();
        scanner.nextLine();
        switch (pasirinko){
            case 1:
                pridekAutomobiliUser();
                break;
            case 2:
                pasiimkAutomobili();
                break;
            case 3:
                klientuSarasas.priskirtiAuto();
                break;
            case 4:
                klientuSarasas.atimtiAuto();
                break;
            case 5:
                autoDuomenuModifikatorius();
                break;
            case 6:
                klientuSarasas.ziuretiNuomotuSarasas();
                break;
            case 7:
                klientuSarasas.klientoNuomojamasAutomobilis();
                break;
            case 8:
                System.exit(0);


        }
    }
    public void pridekAutomobili(Automobilis automobilis){
        automobiliuSarasas.add(automobilis);
        System.out.println("Pridetas automobilis: " + autoInfo(automobilis));
    }
    public void pridekAutomobiliUser(){

        System.out.println("Koks automobilio tipas? 1 - Naftos kuro, 2 - Elektromobilis.");
        int pasirinkimas = scanner.nextInt();
        scanner.nextLine();


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

    public static List<Automobilis> getAutomobiliuSarasas() {
        return automobiliuSarasas;
    }

    public void defaultSarasai(){
        ElektrinisAutomobilis prius = new ElektrinisAutomobilis("Toyota prius", "S250", "2020",30, 3);
        NaftosKuroAutomobilis bmw = new NaftosKuroAutomobilis("BMW", "E3", "2024",50, 60);
        Automobilis mb = new ElektrinisAutomobilis("Mercedes-Benz", "C320", "2007",40, 40);
        Automobilis audi = new ElektrinisAutomobilis("Audi", "A8", "2020",35, 2);
        ElektrinisAutomobilis prius1 = new ElektrinisAutomobilis("Toyota prius", "H250", "2019",30, 3);
        NaftosKuroAutomobilis bmw1 = new NaftosKuroAutomobilis("BMW", "M3", "2023",55, 59);
        Automobilis mb1 = new ElektrinisAutomobilis("Mercedes-Benz", "C220", "2005",45, 50);
        Automobilis audi1 = new ElektrinisAutomobilis("Audi", "A6", "2021",37, 10);
        automobiliuSarasas.add(prius);
        automobiliuSarasas.add(bmw);
        automobiliuSarasas.add(mb);
        automobiliuSarasas.add(audi);
        automobiliuSarasas.add(prius1);
        automobiliuSarasas.add(bmw1);
        automobiliuSarasas.add(mb1);
        automobiliuSarasas.add(audi1);

        Klientas klientas1 = new Klientas();
        klientas1.setVardas("Mantas");
        klientas1.setPavarde("Mantelis");
        klientas1.setDabarNuomojamas(prius);
        klientas1.nuomotuAutomobiliuSarasas.put(bmw1, 11);
        klientas1.nuomotuAutomobiliuSarasas.put(audi, 3);
        klientuSarasas.klientuSarasas.add(klientas1);
        Klientas klientas2 = new Klientas();
        klientas2.setVardas("Tomas");
        klientas2.setPavarde("Tomelis");
        klientas2.setDabarNuomojamas(prius1);
        klientas2.nuomotuAutomobiliuSarasas.put(mb, 5);
        klientas2.nuomotuAutomobiliuSarasas.put(mb1, 6);
        klientuSarasas.klientuSarasas.add(klientas2);
        Klientas klientas3 = new Klientas();
        klientas3.setVardas("Rokas");
        klientas3.setPavarde("Rokelis");
        klientas3.setDabarNuomojamas(bmw);
        klientas3.nuomotuAutomobiliuSarasas.put(audi1, 17);
        klientas3.nuomotuAutomobiliuSarasas.put(audi, 12);
        klientuSarasas.klientuSarasas.add(klientas3);
    }
    public void autoDuomenuModifikatorius(){
        System.out.println("Pasirinkite automobili pagal modeli");
        String modelis = scanner.nextLine();
        for(Automobilis a : automobiliuSarasas){
            if (a.getModelis().equals(modelis))
                if (a instanceof NaftosKuroAutomobilis){
                    System.out.println("Modifikuosite rida(1) ar kuro sanaudas(2)?");
                    int pasirinko = scanner.nextInt();
                    scanner.nextLine();
                    if (pasirinko == 1){
                        pridedamRida(a);
                    } else if (pasirinko == 2) {
                        System.out.println("Iveskite kur sanaudas: ");
                        double sanaudos = scanner.nextDouble();
                        scanner.nextLine();
                        duomenuModifikatorius((NaftosKuroAutomobilis) a, sanaudos);
                        System.out.println("Automobilio " + a.autoInfo() + " kuro sanaudos pakeistos i  " + sanaudos);

                    }
                } else if (a instanceof ElektrinisAutomobilis) {
                    System.out.println("Modifikuosite rida(1) ar baterijos krovimo laika(2)?");
                    int pasirinko1 = scanner.nextInt();
                    scanner.nextLine();
                    if (pasirinko1 == 1){
                        pridedamRida(a);
                    } else if (pasirinko1 == 2) {
                        System.out.println("Iveskite baterijos krovimo laika: ");
                        double laikas = scanner.nextDouble();
                        scanner.nextLine();
                        duomenuModifikatorius((ElektrinisAutomobilis) a, laikas);
                        System.out.println("Automobilio " + a.autoInfo() + " baterijos krovimo laikas pakeistas i  " + laikas);
                    }

                    }
                }

    }

    @Override
    void pridedamRida(ElektrinisAutomobilis a) {

    }
}
