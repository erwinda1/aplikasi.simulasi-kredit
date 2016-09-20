package com.hotmail.dimmaryanto.software;

import com.hotmail.dimmaryanto.software.model.kredit.jenis.bunga.BungaJenisAnuitas;
import java.text.NumberFormat;
import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
@Ignore
public class TestBungaJenisAnual extends TestCase {

    @Ignore
    @Test
    public void testTotalAngsuran() {
        BungaJenisAnuitas f = new BungaJenisAnuitas(1, 20000000.0, 20000000.0, 12, 0.2);
        assertEquals(1852690.0, f.getTotalAngsuran());
    }

    @Test
    public void testAngsuranBunga() {
        BungaJenisAnuitas f = new BungaJenisAnuitas(1, 20000000.0, 20000000.0, 12, 0.2);
        assertEquals(333333.0, f.getAngsuranBunga());

        f = new BungaJenisAnuitas(2, 20000000.0, 18480643.0, 12, 0.2);
        assertEquals(308011.0, f.getAngsuranBunga());
    }

    @Test
    public void testAngsuranPokok() {
        BungaJenisAnuitas f = new BungaJenisAnuitas(1, 20000000.0, 20000000.0, 12, 0.2);
        assertEquals(1519357.0, f.getAngsuranPokok());

        f = new BungaJenisAnuitas(2, 20000000.0, 18480643.0, 12, 0.2);
        assertEquals(1544679.0, f.getAngsuranPokok());
    }

    @Test
    public void testBaki() {
        BungaJenisAnuitas f = new BungaJenisAnuitas(1, 20000000.0, 20000000.0, 12, 0.2);
        assertEquals(18480643.0, f.getBaki());

        f = new BungaJenisAnuitas(2, 20000000.0, 18480643.0, 12, 0.2);
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(f.getBaki()));

        assertEquals(16935964.0, f.getBaki());

    }

}
