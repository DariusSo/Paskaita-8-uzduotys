package Automobiliai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Klientas {
    private String vardas;
    private String pavarde;

    private Automobilis dabarNuomojamas;

    private Automobilis paskutinisNuomotas;

    public Map<Automobilis, Integer> nuomotuAutomobiliuSarasas = new HashMap<>();




    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public Automobilis getDabarNuomojamas() {
        return dabarNuomojamas;
    }

    public void setDabarNuomojamas(Automobilis dabarNuomojamas) {
        this.dabarNuomojamas = dabarNuomojamas;
    }

    public Automobilis getPaskutinisNuomotas() {
        return paskutinisNuomotas;
    }

    public void setPaskutinisNuomotas(Automobilis paskutinisNuomotas) {
        this.paskutinisNuomotas = paskutinisNuomotas;
    }

    public Map<Automobilis, Integer> getNuomotuAutomobiliuSarasas() {
        return nuomotuAutomobiliuSarasas;
    }

    public String klientoInfo(){
        return getVardas() + " " + getPavarde();
    }
}
