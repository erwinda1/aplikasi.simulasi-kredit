package com.hotmail.dimmaryanto.software.model.kredit;

import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.NumberFormat;

public class Kredit {

    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    private Double plafond;
    @NumberFormat(style = NumberFormat.Style.PERCENT)
    private Double bunga;
    @NumberFormat(style = NumberFormat.Style.NUMBER)
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
