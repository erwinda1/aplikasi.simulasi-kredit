package com.hotmail.dimmaryanto.software.model;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FlatTransaksi {

    private Integer angsuranKe;
    private LocalDate jatuhTempo;
    private Double angsuranPokok;
    private Double angsuranBunga;
    private Double totalAngsuran;
    private Double baki;

    private final Double plafond;

    public FlatTransaksi(Integer angsuranKe, Double plafond, Integer jangka, Double bunga) {
        this.plafond = plafond;
        setAngsuranKe(angsuranKe);
        setJatuhTempo(angsuranKe);
        setAngsuranPokok(plafond, jangka);
        setAngsuranBunga(plafond, bunga);
    }

    public void setJatuhTempo(LocalDate jatuhTempo) {
        this.jatuhTempo = jatuhTempo;
    }

    public void setAngsuranPokok(Double angsuranPokok) {
        this.angsuranPokok = angsuranPokok;
    }

    public void setAngsuranBunga(Double angsuranBunga) {
        this.angsuranBunga = angsuranBunga;
    }

    public void setTotalAngsuran(Double totalAngsuran) {
        this.totalAngsuran = totalAngsuran;
    }

    public Integer getAngsuranKe() {
        return angsuranKe;
    }

    private void setAngsuranKe(Integer angsuranKe) {
        this.angsuranKe = angsuranKe;
    }

    public Integer getAngsurangKe() {
        return angsuranKe;
    }

    public LocalDate getJatuhTempo() {
        if (jatuhTempo.getDayOfWeek() == DayOfWeek.SATURDAY) {
            return jatuhTempo.plusDays(2);
        } else if (jatuhTempo.getDayOfWeek() == DayOfWeek.SUNDAY) {
            return jatuhTempo.plusDays(1);
        } else {
            return jatuhTempo;
        }
    }

    private void setJatuhTempo(Integer angsuranKe) {
        this.jatuhTempo = LocalDate.now().plusMonths(angsuranKe);
    }

    public Double getAngsuranPokok() {
        return angsuranPokok;
    }

    private void setAngsuranPokok(Double plafond, Integer jangka) {
        this.angsuranPokok = plafond / jangka;
    }

    public Double getAngsuranBunga() {
        return angsuranBunga;
    }

    private void setAngsuranBunga(Double plafond, Double bunga) {
        this.angsuranBunga = (plafond * bunga) / 12;
    }

    public Double getTotalAngsuran() {
        totalAngsuran = getAngsuranPokok() + getAngsuranBunga();
        return totalAngsuran;
    }

    public Double getBaki() {
        baki = plafond - (getAngsuranPokok() * angsuranKe);
        return baki;
    }

}
