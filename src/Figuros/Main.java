package Figuros;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IOManager manager = new IOManager();
        FigurosEnum a = manager.suzinokFigura();
        if (a == FigurosEnum.KVADRATAS){
            manager.suzinokKrastines();
            Kvadratas kvadratas = new Kvadratas(manager.getKrastine1());
            kvadratas.skaiciuokPlota();
            manager.spausdinkPlota(kvadratas.toString());
        } else if (a == FigurosEnum.TRIKAMPIS) {
            manager.suzinokKrastines();
            Trikampis trikampis = new Trikampis(manager.getKrastine1(), manager.getKrastine2());
            trikampis.skaiciuokPlota();
            manager.spausdinkPlota(trikampis.toString());
        }else if (a == FigurosEnum.SKRITULYS) {
            manager.suzinokKrastines();
            Skritulys skritulys = new Skritulys(manager.getKrastine1());
            skritulys.skaiciuokPlota();
            manager.spausdinkPlota(skritulys.toString());
        }else{
            System.out.println("Tokios figuros skaiciuoti nemoku");
        }

        System.out.println();
        }
    }
