/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotmail.dimmaryanto.software;

import com.hotmail.dimmaryanto.software.model.kredit.jenis.bunga.BungaJenisEfektif;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author bpr_ukabima
 */
public class TestBungaJenisEfektif extends TestCase {

    @Test
    public void testAngsuranPokok() {
        BungaJenisEfektif f = new BungaJenisEfektif(1, 20000000.0, 12, 0.2);
        assertEquals(1666667, Math.round(f.getAngsuranPokok()));
    }

    @Test
    public void testAngsuranBunga() {
        BungaJenisEfektif f = new BungaJenisEfektif(1, 20000000.0, 12, 0.2);
        assertEquals(333333, Math.round(f.getAngsuranBunga()));

        f = new BungaJenisEfektif(2, 20000000.0, 12, 0.2);
        assertEquals(305556, Math.round(f.getAngsuranBunga()));
    }

    @Test
    public void testTotalAngsuran() {
        BungaJenisEfektif f = new BungaJenisEfektif(1, 20000000.0, 12, 0.2);
        assertEquals(2000000, Math.round(f.getTotalAngsuran()));

        f = new BungaJenisEfektif(2, 20000000.0, 12, 0.2);
        assertEquals(1972222, Math.round(f.getTotalAngsuran()));
    }

    @Test
    public void testBaki() {
        BungaJenisEfektif f = new BungaJenisEfektif(1, 20000000.0, 12, 0.2);
        assertEquals(18333333, Math.round(f.getBaki()));

        f = new BungaJenisEfektif(2, 20000000.0, 12, 0.2);
        assertEquals(16666667, Math.round(f.getBaki()));
    }

}
