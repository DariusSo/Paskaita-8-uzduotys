package Automobiliai;

public class AutomobiliaiMain {
    public static void main(String[] args) {

        Nuoma autoNuoma = new Nuoma();
        ElektrinisAutomobilis prius = new ElektrinisAutomobilis("Toyota prius", "S250", "2020",30, 3);
        NaftosKuroAutomobilis bmw = new NaftosKuroAutomobilis("BMW", "E3", "2024",50, 80);
        Automobilis mb = new ElektrinisAutomobilis("Mercedes-Benz", "C320", "2007",40, 50);
        Automobilis audi = new ElektrinisAutomobilis("Audi", "A8", "2020",35, 2);
        autoNuoma.pridekAutomobili(prius);
        autoNuoma.pridekAutomobili(bmw);
        autoNuoma.pridekAutomobili(mb);
        autoNuoma.pridekAutomobili(audi);
        AutomobilioDuomenuModifikatorius mod = new AutomobilioDuomenuModifikatorius();
        System.out.println(mod.duomenuModifikatorius(prius, 20.0).getBaterijosKrovimoLaikas());
        System.out.println(mod.duomenuModifikatorius(bmw, 30.0).getKuroSanaudos100km());
        System.out.println(mod.duomenuModifikatorius((Automobilis) prius, 254565L).getRida());
        System.out.println();
        System.out.println("Masinu sarasas: ");
        for (Automobilis a : autoNuoma.automobiliuSarasas){
            System.out.println(autoNuoma.autoInfo(a));
        }
        System.out.println();
        autoNuoma.pridekAutomobiliUser();
        System.out.println();
        autoNuoma.pasiimkAutomobili();
        System.out.println();
        for (Automobilis a : autoNuoma.automobiliuSarasas){
            System.out.println(autoNuoma.autoInfo(a));
        }
    }
}
