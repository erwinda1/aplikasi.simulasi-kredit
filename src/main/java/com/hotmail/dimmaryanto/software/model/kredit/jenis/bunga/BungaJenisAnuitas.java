package com.hotmail.dimmaryanto.software.model.kredit.jenis.bunga;

import com.hotmail.dimmaryanto.software.model.kredit.KreditDetail;
import org.apache.poi.ss.formula.functions.Finance;

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
