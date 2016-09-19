package com.hotmail.dimmaryanto.software.model;

import java.util.ArrayList;
import java.util.List;

public class FlatMaster {

    private Double plafond;
    private Double bunga;
    private Integer jangka;
    private List<FlatTransaksi> simulasi = new ArrayList<>();

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

    public List<FlatTransaksi> getSimulasi() {
        return simulasi;
    }

    public void setSimulasi(List<FlatTransaksi> simulasi) {
        this.simulasi = simulasi;
    }

}
