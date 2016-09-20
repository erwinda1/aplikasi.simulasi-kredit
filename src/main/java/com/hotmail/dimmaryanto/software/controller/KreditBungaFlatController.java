package com.hotmail.dimmaryanto.software.controller;

import com.hotmail.dimmaryanto.software.model.kredit.jenis.bunga.BungaJenisFlat;
import com.hotmail.dimmaryanto.software.model.kredit.Kredit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/simulator/flat")
public class KreditBungaFlatController {

    @GetMapping("/form")
    public ModelAndView form() {
        return new ModelAndView("/simulator/form", "kredit", new Kredit());
    }

    @PostMapping("/result")
    public ModelAndView proses(@ModelAttribute Kredit f) {
        f.getSimulasi().clear();

        Double grantTotalAngsuranPokok = 0.0;
        Double grantTotalAngsuranBunga = 0.0;
        Double grantTotalAngsuran = 0.0;
        for (Integer i = 1; i <= f.getJangka(); i++) {
            BungaJenisFlat ft = new BungaJenisFlat(i, f.getPlafond(), f.getJangka(), f.getBunga());
            grantTotalAngsuranPokok += ft.getAngsuranPokok();
            grantTotalAngsuranBunga += ft.getAngsuranBunga();
            grantTotalAngsuran += ft.getTotalAngsuran();
            f.getSimulasi().add(ft);
        }
        ModelAndView m = new ModelAndView("/simulator/result", "kredit", f);
        m.addObject("grantTotalAngsuranPokok", grantTotalAngsuranPokok);
        m.addObject("grantTotalAngsuranBunga", grantTotalAngsuranBunga);
        m.addObject("grantTotalAngsuran", grantTotalAngsuran);
        return m;
    }

}
