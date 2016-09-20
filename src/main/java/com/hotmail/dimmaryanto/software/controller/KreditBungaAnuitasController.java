/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotmail.dimmaryanto.software.controller;

import com.hotmail.dimmaryanto.software.model.kredit.jenis.bunga.BungaJenisAnuitas;
import com.hotmail.dimmaryanto.software.model.kredit.jenis.bunga.BungaJenisFlat;
import com.hotmail.dimmaryanto.software.model.kredit.Kredit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/simulator/anuitas")
public class KreditBungaAnuitasController {

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
        Double baki = f.getPlafond();
        for (Integer i = 1; i <= f.getJangka(); i++) {
            BungaJenisAnuitas ft = new BungaJenisAnuitas(i, f.getPlafond(), baki, f.getJangka(), f.getBunga());
            grantTotalAngsuranPokok += ft.getAngsuranPokok();
            grantTotalAngsuranBunga += ft.getAngsuranBunga();
            grantTotalAngsuran += ft.getTotalAngsuran();
            f.getSimulasi().add(ft);
            baki = ft.getBaki();
        }
        ModelAndView m = new ModelAndView("/simulator/result", "kredit", f);
        m.addObject("grantTotalAngsuranPokok", grantTotalAngsuranPokok);
        m.addObject("grantTotalAngsuranBunga", grantTotalAngsuranBunga);
        m.addObject("grantTotalAngsuran", grantTotalAngsuran);
        return m;
    }

}
