package Automobiliai;

import java.util.*;

public class KlientuSarasas {
    Scanner scanner = new Scanner(System.in);
    public List<Klientas> klientuSarasas = new ArrayList<>();
    Klientas klientas1 = new Klientas();



    public String priskirtiAuto(){
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
                        return "";
                    }
                }
                Klientas klientas = new Klientas();
                klientas.setVardas(vardas);
                klientas.setPavarde(pavarde);
                klientas.setDabarNuomojamas(a);
                klientuSarasas.add(klientas);
                Nuoma.getAutomobiliuSarasas().remove(a);
                System.out.println("Automobilis " + a.autoInfo() + "buvo isnuomotas klientui " + klientas.getVardas() + " " + klientas.getPavarde());
                return "";
            }
        }
        return "";
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
                System.out.println("Klientas: " + k.klientoInfo() + " turejo sias masinas: ");
                for (Map.Entry<Automobilis, Integer> set : k.getNuomotuAutomobiliuSarasas().entrySet()){
                    System.out.println(set.getKey().autoInfo() + "|" + set.getValue() + " 10 dienu.");
                }
            }
        }
    }
    public String klientoNuomojamasAutomobilis(){
        System.out.println("Kokia kliento pavarde?");
        String pavarde = scanner.nextLine();
        for(Klientas k : klientuSarasas){
            if (k.getPavarde().equals(pavarde)){
                System.out.println("Kliento " + k.klientoInfo() + " dabar nuomojamas automobilis yra: " + k.getDabarNuomojamas().autoInfo());
            }
        }
        return "";
    }
}
