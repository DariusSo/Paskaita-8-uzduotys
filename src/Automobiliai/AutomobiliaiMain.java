package Automobiliai;

public class AutomobiliaiMain {
    public static void main(String[] args) {

        Nuoma autoNuoma = new Nuoma();
        autoNuoma.defaultAuto();
        while(true){
            autoNuoma.menu();
        }
    }
}
