package com.hotmail.dimmaryanto.software.model;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class KreditDetail {

    private Integer angsuranKe = 0;
    private LocalDate jatuhTempo;
    private Double angsuranPokok = 0.0;
    private Double angsuranBunga = 0.0;
    private Double totalAngsuran = 0.0;
    private Double baki = 0.0;

    public void setJatuhTempo(LocalDate jatuhTempo) {
        this.jatuhTempo = jatuhTempo;
    }

    public Integer getAngsuranKe() {
        return angsuranKe;
    }

    public void setAngsuranKe(Integer angsuranKe) {
        this.angsuranKe = angsuranKe;
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

    public void setJatuhTempo(Integer angsuranKe) {
        this.jatuhTempo = LocalDate.now().plusMonths(angsuranKe);
    }

    public Double getAngsuranPokok() {
        return angsuranPokok;
    }

    public void setAngsuranPokok(Double angsuranPokok) {
        this.angsuranPokok = angsuranPokok;
    }

    public Double getAngsuranBunga() {
        return angsuranBunga;
    }

    public void setAngsuranBunga(Double angsuranBunga) {
        this.angsuranBunga = angsuranBunga;
    }

    public Double getTotalAngsuran() {
        return totalAngsuran;
    }

    public void setTotalAngsuran(Double totalAngsuran) {
        this.totalAngsuran = totalAngsuran;
    }

    public Double getBaki() {
        return baki;
    }

    public void setBaki(Double baki) {
        this.baki = baki;
    }

}
