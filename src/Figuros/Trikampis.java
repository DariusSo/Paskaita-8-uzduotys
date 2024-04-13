package Figuros;

public class Trikampis extends Figuros{

    public Trikampis(int krastine1, int krastine2) {
        super(krastine1, krastine2);
    }

    public void skaiciuokPlota(){
        setPlotas(getKrastine1() * getKrastine2() / 2);
    }
}
