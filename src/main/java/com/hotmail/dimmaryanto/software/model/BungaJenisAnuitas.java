/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotmail.dimmaryanto.software.model;

import org.apache.poi.ss.formula.functions.Finance;

/**
 *
 * @author bpr_ukabima
 */
public class BungaJenisAnuitas extends KreditDetail {

    public BungaJenisAnuitas(Integer angsuranKe, Double plafond, Double lastBaki, Integer jangka, Double bunga) {
        super.setAngsuranKe(angsuranKe);
        super.setJatuhTempo(angsuranKe);
        setTotalAngsuran(bunga, jangka, plafond);
        setAngsuranBunga(bunga, jangka, lastBaki);
        super.setAngsuranPokok(getTotalAngsuran() - getAngsuranBunga());
        super.setBaki(lastBaki - getAngsuranPokok());
    }

    public void setTotalAngsuran(Double bunga, Integer jangka, Double plafond) {
        super.setTotalAngsuran(Finance.pmt(0.2 / 12, jangka, -plafond));
    }

    public void setAngsuranBunga(Double bunga, Integer jangka, Double baki) {
        super.setAngsuranBunga(Finance.ipmt(bunga / 12, 1, jangka, -baki));
    }

}
