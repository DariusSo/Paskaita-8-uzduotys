package Figuros;

public class Figuros {
    private double plotas;
    private int krastine1;
    private int krastine2;


    public Figuros(int krastine1, int krastine2) {
        this.krastine1 = krastine1;
        this.krastine2 = krastine2;
    }

    public double getPlotas() {
        return plotas;
    }

    public void setPlotas(double plotas) {
        this.plotas = plotas;
    }

    public void skaiciuokPlota(){
        setPlotas(krastine1 * krastine2);
    }

    @Override
    public String toString(){
        return "Jusu figuros plotas yra " + getPlotas() + "kv.cm";
    }

    public int getKrastine2() {
        return krastine2;
    }

    public int getKrastine1() {
        return krastine1;
    }
}
