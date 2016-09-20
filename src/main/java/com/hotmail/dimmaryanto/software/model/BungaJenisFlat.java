/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotmail.dimmaryanto.software.model;

/**
 *
 * @author bpr_ukabima
 */
public class BungaJenisFlat extends KreditDetail {

    private final Double plafond;

    public BungaJenisFlat(Integer angsuranKe, Double plafond, Integer jangka, Double bunga) {
        this.plafond = plafond;
        super.setAngsuranKe(angsuranKe);
        super.setJatuhTempo(angsuranKe);
        setAngsuranPokok(plafond, jangka);
        setAngsuranBunga(plafond, bunga);
        setTotalAngsuran(getAngsuranPokok() + getAngsuranBunga());
        setBaki(plafond - (getAngsuranPokok() * getAngsuranKe()));
    }

    public void setAngsuranPokok(Double plafond, Integer jangka) {
        super.setAngsuranPokok(plafond / jangka);
    }

    public void setAngsuranBunga(Double plafond, Double bunga) {
        super.setAngsuranBunga((plafond * bunga) / 1200);
    }

}
