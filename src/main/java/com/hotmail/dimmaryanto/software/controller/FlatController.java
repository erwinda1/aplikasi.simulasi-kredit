/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotmail.dimmaryanto.software.controller;

import com.hotmail.dimmaryanto.software.model.BungaJenisFlat;
import com.hotmail.dimmaryanto.software.model.Kredit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/simulator/flat")
public class FlatController {

    @GetMapping("/form")
    public void form(Model m) {
        m.addAttribute("flat", new Kredit());
    }

    @PostMapping("/result")
    public void proses(Model m, @ModelAttribute Kredit f) {
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
        m.addAttribute("simulatorFlat", f);
        m.addAttribute("grantTotalAngsuranPokok", grantTotalAngsuranPokok);
        m.addAttribute("grantTotalAngsuranBunga", grantTotalAngsuranBunga);
        m.addAttribute("grantTotalAngsuran", grantTotalAngsuran);
    }

}
