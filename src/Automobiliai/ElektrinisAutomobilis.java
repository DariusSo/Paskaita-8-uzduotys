package Automobiliai;

public class ElektrinisAutomobilis extends Automobilis{
    private double baterijosKrovimoLaikas;
    public ElektrinisAutomobilis(String marke, String modelis, String metai, double kaina, double baterijosKrovimoLaikas) {
        super(marke, modelis, metai, kaina);
        this.baterijosKrovimoLaikas = baterijosKrovimoLaikas;
    }
    public ElektrinisAutomobilis(String marke, String modelis, String metai, double kaina) {
        super(marke, modelis, metai, kaina);
    }

    public double getBaterijosKrovimoLaikas() {
        return baterijosKrovimoLaikas;
    }

}
