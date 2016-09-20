/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotmail.dimmaryanto.software.controller;

import com.hotmail.dimmaryanto.software.model.BungaJenisFlat;
import com.hotmail.dimmaryanto.software.model.Kredit;
import com.hotmail.dimmaryanto.software.model.KreditDetail;
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

        for (Integer i = 1; i <= f.getJangka(); i++) {
            BungaJenisFlat ft = new BungaJenisFlat(i, f.getPlafond(), f.getJangka(), f.getBunga());
            f.getSimulasi().add(ft);
            //KreditDetail t = new KreditDetail(i, f.getPlafond(), f.getJangka(), f.getBunga());
            //f.getSimulasi().add(t);
        }
        m.addAttribute("simulatorFlat", f);
    }

}
