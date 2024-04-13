package Figuros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IOManager {
    private FigurosEnum pasirinktaFigura;
    private int krastine1;
    private int krastine2;
    Scanner scanner = new Scanner(System.in);
    public FigurosEnum suzinokFigura() {
        System.out.println("Pasirinkita figura. Kvardatui spauskite 1, Trikampiui - 2, Skrituliui - 3:");
        try {
            int figurosSk = scanner.nextInt();
            if (figurosSk == 1) {
                setPasirinktaFigura(FigurosEnum.KVADRATAS);
                return pasirinktaFigura;
            } else if (figurosSk == 2) {
                setPasirinktaFigura(FigurosEnum.TRIKAMPIS);
                return pasirinktaFigura;
            } else if (figurosSk == 3) {
                setPasirinktaFigura(FigurosEnum.SKRITULYS);
                return pasirinktaFigura;
            } else {
                System.out.println("Neturiu tokios figuros.");
            }
            return FigurosEnum.NERAFIGUROS;
        } catch (InputMismatchException e) {


        }
        return null;
    }

    public void suzinokKrastines(){
        switch (pasirinktaFigura){
            case KVADRATAS:
                System.out.println("Iveskite krastines ilgi: ");
                krastine1 = scanner.nextInt();
                break;
            case TRIKAMPIS:
                System.out.println("Iveskite pirmos krastines ilgi: ");
                krastine1 = scanner.nextInt();
                System.out.println("Iveskite antros krastines ilgi: ");
                krastine2 = scanner.nextInt();
                break;
            case SKRITULYS:
                System.out.println("Iveskite krastines ilgi: ");
                krastine1 = scanner.nextInt();
                break;
            default:
                break;
        }

    }
    public void spausdinkPlota(String str){
        System.out.println(str);
    }

    public FigurosEnum getPasirinktaFigura() {
        return pasirinktaFigura;
    }

    public void setPasirinktaFigura(FigurosEnum pasirinktaFigura) {
        this.pasirinktaFigura = pasirinktaFigura;
    }

    public int getKrastine1() {
        return krastine1;
    }

    public int getKrastine2() {
        return krastine2;
    }
}
