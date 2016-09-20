package com.hotmail.dimmaryanto.software;

import junit.framework.TestCase;
import org.apache.poi.ss.formula.functions.Finance;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    @Test
    public void testPMT() {
        Double pmt = Finance.pmt(0.2 / 12, 12, -20000000);
        Double pmtConvert = Double.valueOf(Math.round(pmt));
        assertEquals(1852690.0, pmtConvert);
    }
}
