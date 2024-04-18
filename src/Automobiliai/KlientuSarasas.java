package Automobiliai;

import java.util.*;

public class KlientuSarasas {
    Scanner scanner = new Scanner(System.in);
    public List<Klientas> klientuSarasas = new ArrayList<>();
    Klientas klientas1 = new Klientas();



    public void priskirtiAuto(){
        System.out.println("Kliento vardas: ");
        String vardas = scanner.nextLine();
        System.out.println("Kliento pavarde: ");
        String pavarde = scanner.nextLine();
        System.out.println("Norimas automobilis(modelis): ");
        String modelis = scanner.nextLine();
        for (Automobilis a : Nuoma.getAutomobiliuSarasas()) {
            if (a.getModelis().equals(modelis)) {
                for (Klientas k : klientuSarasas){
                    if (k.getPavarde().equals(pavarde)){
                        Nuoma.getAutomobiliuSarasas().remove(a);
                        k.setDabarNuomojamas(a);
                    }else{
                        Klientas klientas = new Klientas();
                        klientas.setVardas(vardas);
                        klientas.setPavarde(pavarde);
                        klientas.setDabarNuomojamas(a);
                        klientuSarasas.add(klientas);
                        Nuoma.getAutomobiliuSarasas().remove(a);
                        System.out.println("Automobilis " + a.autoInfo() + "buvo isnuomotas klientui " + klientas.getVardas() + " " + klientas.getPavarde());
                        break;
                    }
                }break;
            }
        }

    }
    public void atimtiAuto(){
        System.out.println("Koks automobilis grazinamas(modelis)?");
        String modelis = scanner.nextLine();
        System.out.println("Kliento pavarde: ");
        String pavarde = scanner.nextLine();
        System.out.println("Kiek dienu buvo isnuomota?");
        int dienos1 = scanner.nextInt();
        scanner.nextLine();
        for (Klientas klient : klientuSarasas){
            if (klient.getPavarde().equals(pavarde)){
                    if (klient.getDabarNuomojamas().getModelis().equals(modelis)){
                        Nuoma.getAutomobiliuSarasas().add(klient.getDabarNuomojamas());
                        klientuSarasas.remove(klient);
                        klient.nuomotuAutomobiliuSarasas.put(klient.getDabarNuomojamas(), dienos1);
                        break;
                    }
            }
        }

    }
    public void ziuretiNuomotuSarasas(){
        System.out.println("Koks kliento pavarde?");
        String pavarde = scanner.nextLine();
        for (Klientas k : klientuSarasas){
            if (k.getPavarde().equals(pavarde)){
                System.out.println("Klientas :" + k + " turejo sias masinas: ");
                for (Map.Entry<Automobilis, Integer> set : k.getNuomotuAutomobiliuSarasas().entrySet()){
                    System.out.println(set);

                }
            }
        }
    }
}
