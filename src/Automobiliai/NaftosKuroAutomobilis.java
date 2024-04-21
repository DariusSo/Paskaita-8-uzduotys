package Automobiliai;

public class NaftosKuroAutomobilis extends Automobilis{
    private double kuroSanaudos100km;
    public NaftosKuroAutomobilis(String marke, String modelis, String metai, double kaina) {
        super(marke, modelis, metai, kaina);
    }
    public NaftosKuroAutomobilis(String marke, String modelis, String metai, double kaina, double kuroSanaudos100km) {
        super(marke, modelis, metai, kaina);
        this.kuroSanaudos100km = kuroSanaudos100km;
    }

    public double getKuroSanaudos100km() {
        return kuroSanaudos100km;
    }

    public void setKuroSanaudos100km(double kuroSanaudos100km) {
        this.kuroSanaudos100km = kuroSanaudos100km;
    }


}
