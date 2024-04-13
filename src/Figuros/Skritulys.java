package Figuros;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Skritulys extends Figuros{

    public Skritulys(int krastine1) {
        super(krastine1, krastine1);
    }

    @Override
    public void skaiciuokPlota(){
        setPlotas((this.getKrastine1() * getKrastine1() * Math.PI));
        BigDecimal apskritimas = new BigDecimal(getPlotas());
        setPlotas(apskritimas.setScale(2, RoundingMode.UP).doubleValue());
    }
}
