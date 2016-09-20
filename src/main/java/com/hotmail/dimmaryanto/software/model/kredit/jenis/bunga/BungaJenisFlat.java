/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotmail.dimmaryanto.software.model.kredit.jenis.bunga;

import com.hotmail.dimmaryanto.software.model.kredit.KreditDetail;

/**
 *
 * @author bpr_ukabima
 */
public class BungaJenisFlat extends KreditDetail {

    public BungaJenisFlat(Integer angsuranKe, Double plafond, Integer jangka, Double bunga) {
        super.setAngsuranKe(angsuranKe);
        super.setJatuhTempo(angsuranKe);
        setAngsuranPokok(plafond, jangka);
        setAngsuranBunga(plafond, bunga);
        setTotalAngsuran(getAngsuranPokok() - getAngsuranBunga());
        setBaki(plafond - (getAngsuranPokok() * getAngsuranKe()));
    }

    /**
     * menghitung angsuran pokok dari plafond / jangka
     *
     * @param plafond
     * @param jangka
     */
    public void setAngsuranPokok(Double plafond, Integer jangka) {
        super.setAngsuranPokok(plafond / jangka);
    }

    /**
     * menghitung angsuran bungan jenis flat: plafond * bunga / 1200
     *
     * @param plafond
     * @param bunga
     */
    public void setAngsuranBunga(Double plafond, Double bunga) {
        super.setAngsuranBunga((plafond * bunga) / 1200);
    }

}
