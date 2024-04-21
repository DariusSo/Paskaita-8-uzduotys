package Automobiliai;

public class AutomobiliaiMain {
    public static void main(String[] args) {

        Nuoma autoNuoma = new Nuoma();
        autoNuoma.defaultSarasai();
        while(true){
            autoNuoma.menu();
        }
    }
}
