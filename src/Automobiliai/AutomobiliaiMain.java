package Automobiliai;

public class AutomobiliaiMain {
    public static void main(String[] args) {

        Nuoma autoNuoma = new Nuoma();
        Automobilis prius = new ElektrinisAutomobilis("Toyota prius", "S250", "2020",30, 3);
        Automobilis bmw = new NaftosKuroAutomobilis("BMW", "E3", "2024",50, 80);
        Automobilis mb = new ElektrinisAutomobilis("Mercedes-Benz", "C320", "2007",40, 50);
        Automobilis audi = new ElektrinisAutomobilis("Audi", "A8", "2020",35, 2);
        autoNuoma.pridekAutomobili(prius);
        autoNuoma.pridekAutomobili(bmw);
        autoNuoma.pridekAutomobili(mb);
        autoNuoma.pridekAutomobili(audi);
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
