package com.hotmail.dimmaryanto.software.model.kredit.jenis.bunga;

import com.hotmail.dimmaryanto.software.model.kredit.KreditDetail;

public class BungaJenisEfektif extends KreditDetail {

    public BungaJenisEfektif(Integer angsuranKe, Double plafond, Integer jangka, Double bunga) {
        super.setAngsuranKe(angsuranKe);
        super.setJatuhTempo(angsuranKe);
        setAngsuranPokok(plafond, jangka);
        setAngsuranBunga(angsuranKe, jangka, bunga);
        setTotalAngsuran(getAngsuranPokok() + getAngsuranBunga());
        setBaki(plafond - (angsuranKe * getAngsuranPokok()));
    }

    public void setAngsuranPokok(Double plafond, Integer jangka) {
        super.setAngsuranPokok(plafond / jangka);
    }

    public void setAngsuranBunga(Integer angsuranKe, Integer jangka, Double bunga) {
        super.setAngsuranBunga(((jangka - angsuranKe + 1) * getAngsuranPokok()) * bunga / 12);
    }

}
