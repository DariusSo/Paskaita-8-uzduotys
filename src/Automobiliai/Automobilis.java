package Automobiliai;

public class Automobilis {
    private String marke;
    private String modelis;
    private String metai;
    private double kaina;

    private long rida;

    public Automobilis(String marke, String modelis, String metai, double kaina) {
        setMarke(marke);
        setModelis(modelis);
        setMetai(metai);
        setKaina(kaina);
    }
    public String autoInfo(){
        return getMarke() + "|" + getModelis() + "|" + getMarke() + "|" + getMetai();
    }

    public String getMarke() {
        return marke;
    }

    public String getModelis() {
        return modelis;
    }

    public String getMetai() {
        return metai;
    }

    public double getKaina() {
        return kaina;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setModelis(String modelis) {
        this.modelis = modelis;
    }

    public void setMetai(String metai) {
        this.metai = metai;
    }

    public void setRida(long rida) {
        this.rida = rida;
    }

    public long getRida() {
        return rida;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }
}
