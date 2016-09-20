package com.hotmail.dimmaryanto.software.model.kredit;

import java.util.ArrayList;
import java.util.List;

public class Kredit {

    private Double plafond;
    private Double bunga;
    private Integer jangka;
    private List<KreditDetail> simulasi = new ArrayList<>();

    public Double getPlafond() {
        return plafond;
    }

    public void setPlafond(Double plafond) {
        this.plafond = plafond;
    }

    public Double getBunga() {
        return bunga;
    }

    public void setBunga(Double bunga) {
        this.bunga = bunga;
    }

    public Integer getJangka() {
        return jangka;
    }

    public void setJangka(Integer jangka) {
        this.jangka = jangka;
    }

    public List<KreditDetail> getSimulasi() {
        return simulasi;
    }

    public void setSimulasi(List<KreditDetail> simulasi) {
        this.simulasi = simulasi;
    }

}
