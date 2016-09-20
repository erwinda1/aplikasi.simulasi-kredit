package com.hotmail.dimmaryanto.software;

import com.hotmail.dimmaryanto.software.model.kredit.jenis.bunga.BungaJenisAnuitas;
import java.text.NumberFormat;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestBungaJenisAnual extends TestCase {

    @Test
    public void testTotalAngsuran() {
        BungaJenisAnuitas f = new BungaJenisAnuitas(1, 20000000.0, 20000000.0, 12, 0.2);
        assertEquals(1852690, Math.round(f.getTotalAngsuran()));
    }

    @Test
    public void testAngsuranBunga() {
        BungaJenisAnuitas f = new BungaJenisAnuitas(1, 20000000.0, 20000000.0, 12, 0.2);
        assertEquals(333333, Math.round(f.getAngsuranBunga()));

        f = new BungaJenisAnuitas(2, 20000000.0, 18480643.0, 12, 0.2);
        assertEquals(308011, Math.round(f.getAngsuranBunga()));
    }

    @Test
    public void testAngsuranPokok() {
        BungaJenisAnuitas f = new BungaJenisAnuitas(1, 20000000.0, 20000000.0, 12, 0.2);
        assertEquals(1519357, Math.round(f.getAngsuranPokok()));

        f = new BungaJenisAnuitas(2, 20000000.0, 18480643.0, 12, 0.2);
        assertEquals(1544679, Math.round(f.getAngsuranPokok()));
    }

    @Test
    public void testBaki() {
        BungaJenisAnuitas f = new BungaJenisAnuitas(1, 20000000.0, 20000000.0, 12, 0.2);
        assertEquals(18480643, Math.round(f.getBaki()));

        f = new BungaJenisAnuitas(2, 20000000.0, 18480643.0, 12, 0.2);
        assertEquals(16935964, Math.round(f.getBaki()));
    }

}
